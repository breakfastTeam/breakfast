/**
 * Created by kkk on 14/11/23.
 */
'use strict';

var ctrls=angular.module('bfControllers',['ui.router','bfServices']);

ctrls
.controller('ApplicationController', [
    '$scope',
    '$state',
    '$rootScope',
    '$modal',
    'User',
    'Session',
    function($scope,$state,$rootScope,$modal, User,Session){
        $scope.currentUser = null;
        $scope.isAuthorized = User.isAuthorized;
        $scope.nav={
            title : '豆点吧',
            registerShow : false,
            bottomShow : true,
            shop:true,
            shopCount:0
        };
        $scope.toLogin=function(){
            if(Session.userId) {
                $state.go('userInfo');
            }else{
                $state.go('login');
            }
        };
        $scope.toExpressMap=function(){
            if(Session.userId) {
                $state.go('wantToLook.expressMap');
            }else{
                $state.go('login');
            }
        };
        $scope.edit=function(){
            $scope.$broadcast('edit');
        };
        $scope.back=function(){
            $scope.$broadcast('back');
        };
        $scope.$on('updateShopCount',function(event){
            console.log($rootScope.config);
            event.stopPropagation();
            $scope.nav.shopCount= $rootScope.config.shopCount;
        })

        $scope.openAlert = function (message) {

            var modalInstance = $modal.open({
                templateUrl: 'tlps/modalAlert.html',
                controller: 'modalAlertInstanceCtrl',
                size: 'sm',
                resolve: {
                    message: function(){return message;}
                }
            });
        };
    }
])
.controller('welcomeCtrl',['$scope','$timeout','$state',function($scope,$timeout,$state){
    $scope.$watch('$viewContentLoaded', function() {
        $timeout(function(){
            //$state.go('login');
            $state.go('main');
        },3000)
    });
}])
.controller('activityCtrl',function($scope,$rootScope, Session, $state, RedPaper,User,$modal, $stateParams, AUTH_EVENTS){
    $scope.disableBtn=true;
    $scope.takeRedPaperBtn=true;
    $scope.$watch('$viewContentLoaded', function() {

        $scope.sendCouponId=$stateParams.sendCouponId;

        var checkRedPaperData={sendCouponId:$stateParams.sendCouponId};
        var checkRedPaperPromise = RedPaper.checkRedPaper(checkRedPaperData)
        checkRedPaperPromise.then(function(data){
            if(!data.body){//红包已经被抢完
                $scope.showTakeRedPaperBtn=false;
                if(Session.userId){
                    $scope.activityInfoText = "红包已被抢完，下次要火速疯抢哦！";
                    $scope.showPhoneRow = false;
                    $scope.showBackBtn = true;
                }else{
                    $scope.activityInfoText = "红包被抢完啦，下次记得火速围观哦！";
                    $scope.showRegistBtn = true;
                    $scope.showRegisterTip = true;
                }
            }else{//红包尚未被抢完
                $scope.showTakeRedPaperBtn=true;
                if(Session.userId){
                    $scope.activityInfoText = "抢红包就应该眼疾手快，赶快抢呀！";
                }else{
                    $scope.activityInfoText = "输入您的信息，赶快抢呀！";
                    $scope.showPhoneRow = true;
                }
            }
        });
        if(Session.userId){
            $scope.showPhoneRow = false;
            $scope.btnColor = "btn-danger";
            $scope.disableBtn=false;
        }else{
            var phone = /^1[34578]\d{9}$/;//校验手机号的正则表达式
            $scope.$watch('user.loginName', function(newValue) {
                if(phone.test(newValue)){
                    var user = $scope.user;
                    if(user){
                        if(user.password){
                            $scope.btnColor = "btn-danger";
                            $scope.disableBtn=false;
                        }else{
                            $scope.btnColor = "btn-default";
                            $scope.disableBtn=true;
                        }
                    }
                }else{
                    $scope.btnColor = "btn-default";
                    $scope.disableBtn=true;
                }
            });
            $scope.$watch('user.password', function(newValue) {
                var user = $scope.user;
                if(user){
                    var loginName = user.loginName;
                    if(newValue && phone.test(loginName)){
                        $scope.btnColor = "btn-danger";
                        $scope.disableBtn=false;
                    }else{
                        $scope.btnColor = "btn-default";
                        $scope.disableBtn=true;
                    }
                }
            });
        }
    });

        $scope.register = function(){
            $state.go('register');
        }
        $scope.goNow = function() {
            $state.go('main.setMeals');
        };

        $scope.openAboutUs=function(){
            var modalInstance = $modal.open({
                templateUrl: 'aboutUs.html'
            });
        };
        $scope.openHowToShare=function(){
            var modalInstance = $modal.open({
                templateUrl: 'howToShare.html'
            });
        };

    $scope.saveRedPaper=function(){
        $scope.disableBtn=true;
        if(Session.userId){//如果用户当前为登录状态
            var data={sendCouponId:$scope.sendCouponId, userId:Session.userId};
            var promise = RedPaper.saveRedPaper(data);
            promise.then(function(data){
                if(data.head.rtnCode == "888888"){
                    $state.go('userInfo');
                }
            });
        }else{//当前用户为非登录状态
            var promise=User.saveOrLoginUser($scope.user);
            promise.then(function(data){
                if(data.head.rtnCode=="888888"){//如果登录或者注册成功
                    var registUserId = data.body.userId;
                    $rootScope.$broadcast(AUTH_EVENTS.loginSuccess);
                    if($scope.sendCouponId){//如果红包有效
                        var data={sendCouponId:$scope.sendCouponId, userId:registUserId};
                        var promise = RedPaper.saveRedPaper(data);
                        promise.then(function(data){
                            if(data.head.rtnCode == "888888"){
                                $state.go('userInfo');
                            }
                        });
                    }else{//如果红包失效
                        $state.go('userInfo');
                    }
                }else{//登录或者注册失败
                    $scope.loginText=data.head.rtnMsg;
                }
            });
        }

    }
})
.controller('loginCtrl',['$scope','$rootScope','User','RedPaper','Express','$state','$window','$auth','Session','AUTH_EVENTS',function($scope,$rootScope,User,RedPaper,Express, $state,$window,$auth,Session, AUTH_EVENTS){
    $scope.loginError=false;
    $scope.errorText='用户名或密码错误';
    $scope.nav.title='登录';
    $scope.nav.shop=false;
    $scope.nav.registerShow=true;
    $scope.nav.bottomShow=false;
    $scope.nav.back=false;

    $scope.login=function(){
        var promise=User.login($scope.user);
        promise.then(function(data){
            if(data.head.rtnCode=='888888'){
                $rootScope.$broadcast(AUTH_EVENTS.loginSuccess);

                var getSendingRedPaperData={userId:Session.userId};
                var redPaperPromise = RedPaper.getSendingRedPaper(getSendingRedPaperData)
                redPaperPromise.then(function(data){
                    if(data.body){
                        $state.go('activity',{sendCouponId: data.body.sendCouponId});
                    }else{
                        $state.go('main');
                    }
                });
                Express.expressPosition({userId:Session.userId}).then(function(res){
                    var position=res.body;
                    sessionStorage.setItem("lng",position.longitude);
                    sessionStorage.setItem("lat",position.latitude);
                });
            }else{
                $rootScope.$broadcast(AUTH_EVENTS.loginFailed);
                $scope.loginError=true;
            }
        })
    };
    $scope.authenticate = function(provider) {
        $auth.authenticate(provider);
    };
    $scope.$on("$destroy", function() {
        $scope.nav.title='豆点吧';
        $scope.nav.registerShow=false;
        $scope.nav.bottomShow=true;
        $scope.nav.shop=true;
    });
}])
.controller('registerCtrl',['$scope','User','$state','$timeout',function($scope,User,$state,$timeout){
    $scope.nav.title='注册';
    $scope.nav.shop=false;
    $scope.alert={
        type:'warning',
        show:false
    };
    $scope.register=function(){
        var promise=User.saveUser($scope.user);
        promise.then(function(data){
            if(data.head.rtnCode=='888888'){
                $scope.alert.type='success';
                $scope.alert.show=true;
                $scope.alert.msg='注册成功,自动跳转到登陆页面';
                toLogin();
            }else if(data.head.rtnCode=='000000'){
                $scope.alert.show=true;
                $scope.alert.msg=data.head.rtnMsg;
            }
        })
    };

    function toLogin(){
        $timeout(function(){
            $state.go('login');
        },2000);
    }
    $scope.$on("$destroy", function() {
        $scope.nav.shop=true;
    });
}])
.controller('mainCtrl',['$scope','$state',function($scope,$state){
    $scope.nav.title='豆点吧';
    $scope.nav.back=false;

    $scope.$watch('$viewContentLoaded', function() {
        $state.go('main.setMeals')
    });
}])
.controller('mainSetMealsCtrl',['$scope','SetMeal',function($scope,SetMeal){

    var scope={
        page:{pageNo:1,pageSize:5},
        totalPages:0,
        loadMoreText:'点击加载更多品质美味',
        setMeals:[],
        loadNext:function(){
            if($scope.page.pageNo<=$scope.totalPages) {
                $scope.page.pageNo+=1;
                listSetMeal();
            }
        }
    };
    $scope = angular.extend($scope, scope);

    $scope.$watch('$viewContentLoaded', function() {
        listSetMeal();
    });

    function listSetMeal(){
        var promise=SetMeal.querySetMeals($scope.page);
        promise.then(function(data){
            $scope.totalPages=data.body.totalPages;
            $scope.setMeals=$scope.setMeals.concat(data.body.result);
            if($scope.page.pageNo>=$scope.totalPages){
                $scope.loadMoreText='所有美味已经加载';
            }
        })
    }

}])
.controller('mainFoodsCtrl',['$scope','Food',function($scope,Food){

    var scope={
        page:{pageNo:1,pageSize:5},
        totalPages:0,
        loadMoreText:'点击加载更多品质美味',
        foods:[],
        loadNext:function(){
            if($scope.page.pageNo<=$scope.totalPages) {
                $scope.page.pageNo+=1;
                listFood();
            }
        }
    };

    $scope = angular.extend($scope, scope);

    $scope.$watch('$viewContentLoaded', function() {
        listFood();
    });

    function listFood(){
        var promise=Food.queryFoods($scope.page);
        promise.then(function(data){
            $scope.totalPages=data.body.totalPages;
            $scope.foods=$scope.foods.concat(data.body.result);
            if($scope.page.pageNo>=$scope.totalPages){
                $scope.loadMoreText='所有美味已经加载';
            }
        })
    }
}])
.controller('mainInformationsCtrl',['$scope','Information',function($scope,Information){

    var scope={
        page:{pageNo:1,pageSize:5},
        totalPages:0,
        loadMoreText:'点击加载更多信息',
        informations:[],
        loadNext:function(){
            if($scope.page.pageNo<=$scope.totalPages) {
                $scope.page.pageNo+=1;
                listInformation();
            }
        }
    }
    $scope = angular.extend($scope, scope);

    $scope.$watch('$viewContentLoaded', function() {
        listInformation();
    });


    function listInformation(){
        var promise=Information.queryInformations($scope.page);
        promise.then(function(data){
            $scope.totalPages=data.body.totalPages;
            $scope.informations=$scope.informations.concat(data.body.result);
            if($scope.page.pageNo>=$scope.totalPages){
                $scope.loadMoreText='所有公告已经加载';
            }
        })
    }

}])
.controller('informationDetailCtrl',function($scope,promise){
    $scope.nav.title = '吧台公告';
    $scope.information = promise.body;
})
.controller('setMealCtrl',function($scope,$state,promise,ShoppingCart,ElementContent, $stateParams){
    $scope.setMeal=promise.body;
    $scope.setMeal.introduce = $scope.setMeal.introduce || '暂无介绍';
    $scope.setMeal.grade = $scope.setMeal.grade || 0;

    $scope.max = 10;
    $scope.hoveringOver = function(value) {
        $scope.overStar = value;
        $scope.percent = 100 * (value / $scope.max);
    };
    $scope.ratingStates = [
        {stateOn: 'glyphicon-ok-sign', stateOff: 'glyphicon-ok-circle'},
        {stateOn: 'glyphicon-star', stateOff: 'glyphicon-star-empty'},
        {stateOn: 'glyphicon-heart', stateOff: 'glyphicon-ban-circle'},
        {stateOn: 'glyphicon-heart'},
        {stateOff: 'glyphicon-off'}
    ];
    var setMeal=promise.body;

    $scope.orderDetail={
        foodObjName:setMeal.setName,
        foodObjId:setMeal.setMealId,
        foodObjCount:1,
        foodObjType:'SETMEAL',
        foodObjPrice:setMeal.privilege,
        foodObjTotalPrice:setMeal.privilege,
        credits:setMeal.exchangeCount
    };
    $scope.minus=function(){
        $scope.orderDetail.foodObjCount--;
        $scope.orderDetail.foodObjTotalPrice=setMeal.privilege*$scope.orderDetail.foodObjCount;
    };
    $scope.plus=function(){
        $scope.orderDetail.foodObjCount++;
        $scope.orderDetail.foodObjTotalPrice=setMeal.privilege*$scope.orderDetail.foodObjCount;
    };

    $scope.toOrder=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
        $scope.nav.shopCount=ShoppingCart.count();
        $state.go('addToOrder',{from:'SETMEAL',fromId:setMeal.setMealId});
    };
    $scope.addToShop=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
        $scope.nav.shopCount=ShoppingCart.count();
    };
    $scope.$on('back', function() {
        $state.go('main.setMeals');
    });
        $scope.$watch('$viewContentLoaded', function() {
            var promise = ElementContent.getElementContent({objId:setMeal.setMealId});
            promise.then(function(data){
                $scope.elementContents = data.body;
            })
        });
})
.controller('foodCtrl',function($scope,$state,promise,ShoppingCart,ElementContent,$stateParams){
    $scope.food=promise.body;
    $scope.food.briefIntro = $scope.food.briefIntro || '暂无介绍';
    $scope.food.grade = $scope.food.grade || 0;

    $scope.max = 10;
    $scope.hoveringOver = function(value) {
        $scope.overStar = value;
        $scope.percent = 100 * (value / $scope.max);
    };
    $scope.ratingStates = [
        {stateOn: 'glyphicon-ok-sign', stateOff: 'glyphicon-ok-circle'},
        {stateOn: 'glyphicon-star', stateOff: 'glyphicon-star-empty'},
        {stateOn: 'glyphicon-heart', stateOff: 'glyphicon-ban-circle'},
        {stateOn: 'glyphicon-heart'},
        {stateOff: 'glyphicon-off'}
    ];
    var food=promise.body;

    $scope.orderDetail={
        foodObjName:food.foodName,
        foodObjId:food.foodId,
        foodObjCount:1,
        foodObjType:'FOOD',
        foodObjPrice:food.price,
        foodObjTotalPrice:food.price,
        credits:food.exchangeCount
    };
    $scope.minus=function(){
        $scope.orderDetail.foodObjCount--;
        $scope.orderDetail.foodObjTotalPrice=food.price*$scope.orderDetail.foodObjCount;
    };
    $scope.plus=function(){
        $scope.orderDetail.foodObjCount++;
        $scope.orderDetail.foodObjTotalPrice=food.price*$scope.orderDetail.foodObjCount;
    };

    $scope.toOrder=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
        $scope.nav.shopCount=ShoppingCart.count();
        $state.go('addToOrder',{from:'FOOD',fromId:food.foodId});
    };
    $scope.addToShop=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
        $scope.nav.shopCount=ShoppingCart.count();
    };
    $scope.$on('back', function() {
        $state.go('main.foods');
    });

    $scope.$watch('$viewContentLoaded', function() {
        var promise = ElementContent.getElementContent({objId:food.foodId});
        promise.then(function(data){
            $scope.elementContents = data.body;
        })
    });
})
.controller('orderCtrl',function($scope,Order,ShoppingCart,promise,$window,Session,ORDER_LIMIT,CREDIT_SCALE,$modal,$stateParams,$state,_){
    $scope.nav.title='立即支付';
    $scope.nav.back=true;
    $scope.hasCoupons=false;
    $scope.hasCredits=false;
    var userInfo={};
    var isLogin=false;
    if(promise) {
        userInfo=promise.body;
    }
    if(userInfo.userId){
        $scope.isLogin=true;
        userInfo.userCustomer=userInfo.userCustomer||{};
        $scope.hasCredits=userInfo.userCustomer.credits||0>0;
        $scope.hasCoupons=userInfo.coupons.length>0;
    }else{
        userInfo = {userCustomer:{},coupons:[]};
    }
    $scope.userInfo=userInfo;
    var loadOrderDetails=ShoppingCart.orderDetails;
    var total= 0,length=loadOrderDetails.length,
        orderDetails=[],temp=[],od={},
        index=-1,el={},allFood=true,allCredits=0;
    for(var i= 0;i<length;i++) {
        od=loadOrderDetails[i];
        total+=od.foodObjTotalPrice;
        if(_.contains(temp, od.foodObjId)) {
            index=_.indexOf(temp,od.foodObjId);
            el=orderDetails[index];
            el.foodObjCount=parseInt(el.foodObjCount)+parseInt(od.foodObjCount);
            el.foodObjTotalPrice=parseFloat(el.foodObjTotalPrice)+parseFloat(od.foodObjTotalPrice);
        }else{
            temp.push(od.foodObjId);
            orderDetails.push(od);
        }
        //判断是否全为单品
        if(od.foodObjType=='SETMEAL'){
            allFood=false;
        }
        //积分限制
        if(od.credits) {
            allCredits+=od.credits;
        }
    }
    ShoppingCart.destroy();
    ShoppingCart.orderDetails=orderDetails;
    if(allCredits>userInfo.userCustomer.credits) {
        allCredits=userInfo.userCustomer.credits;
    }
    $scope.alterLimit=allFood&&(length>0)&total<ORDER_LIMIT;
    $scope.alert={
        type:"warning",
        msg:"温馨提示：只购买单品时总价不能低于"+ORDER_LIMIT+"元",
        show:$scope.alterLimit
    }
    $scope.orderDetails=orderDetails;
    $scope.order={
        customerId:Session.userId||'',
        exccreaditCount:null,
        usedCoupons:'',
        status:'DRAFT',
        orderDetails:$scope.orderDetails,
        orderPrice:total,
        consigneeMobile:userInfo.mobile||'',
        consigneeName:userInfo.userName||'',
        consigneeAddress:userInfo.userCustomer.address1,
        orderType:'online',
        preSendDateStr:new Date(),
        preSendTime:'08:00-08:30'
    };
    $scope.removeOrderDetail=function(index){
        orderDetails.splice(index,1);
        ShoppingCart.destroy();
        ShoppingCart.orderDetails=orderDetails;
        var shoppingCart=ShoppingCart.create(orderDetails, Session.userId);
        $window.sessionStorage["shoppingCart"] = JSON.stringify(shoppingCart);
        $scope.nav.shopCount=ShoppingCart.count();
        $scope.order.orderPrice=ShoppingCart.total();
    }
    $scope.toOrder=function(){
        if($scope.alterLimit&&total<ORDER_LIMIT){
            $scope.alert.type = 'danger';
            return false;
        }else{
            $scope.alert.type = 'warning';
        }
        if(total<=0) {
            $scope.alert.type = 'danger';
            $scope.alert.msg='提示：您的订单必须包含一份食品'
            $scope.alert.show=true;
            return false;
        }else{
            $scope.alert.show=false;
        }
        if(allCredits&&$scope.useCredits&&$scope.order.exccreaditCount>allCredits){
            $scope.alert.type = 'danger';
            $scope.alert.msg='提示：您的订单最多能使用'+allCredits+'积分';
            $scope.alert.show=true;
            return false;
        }else{
            $scope.alert.show=false;
        }

        Order.toOrder($scope.order).then(function(data){
            if(data.head.rtnCode=='888888') {
                $scope.openAlert('订单已生成!');
                $scope.showResult=true;
                ShoppingCart.destroy();
                $scope.nav.shopCount=0;
                $scope.orderDetails=[];
                $scope.order.orderPrice=null;
                $scope.order.useCredits=false;
                $scope.order.useCoupons=false;
                $window.sessionStorage.removeItem("shoppingCart");
            }else{
                $scope.openAlert(data.body);
            }
        })
    };
    $scope.open = function (size) {

        var modalInstance = $modal.open({
            templateUrl: 'coupons.html',
            controller: 'ModalInstanceCtrl',
            size: size,
            resolve: {
                items: function () {
                    return $scope.userInfo.coupons;
                }
            }
        });

        modalInstance.result.then(function (selectedItem) {
            $scope.selected = selectedItem.price;
            $scope.order.usedCoupons=selectedItem.couponId;
        }, function () {
            //console.log('Modal dismissed at: ' + new Date());
        });
    };

    $scope.$watch('order.orderType', function(newValue, oldValue) {
        if(newValue=='online'){
            $scope.privilege=true;
        }else{
            $scope.privilege=false;
            $scope.useCredits=false;
            $scope.hasCoupons=false;
        }
    });

    $scope.$watch('useCredits', function(newValue, oldValue) {
        if(!newValue){
            $scope.order.exccreaditCount=null;
        }
    });
    $scope.$watch('useCoupons', function(newValue, oldValue) {
        if(!newValue){
            $scope.order.usedCoupons='';
        }
    });
    $scope.$watch('order.exccreaditCount', function(newValue, oldValue) {
        var val=userInfo.userCustomer.credits;
        if(newValue>val){
            $scope.openAlert(["您只有"+val+"个积分"]);
            $scope.order.exccreaditCount=val;
        }
        if(newValue>$scope.order.orderPrice){
            var need=Math.ceil($scope.order.orderPrice/parseFloat(CREDIT_SCALE));
            $scope.openAlert(["您只需"+need+"个积分即可"]);
        }
    });

    $scope.$on('back', function() {
        if($stateParams.from=='SETMEAL'){
            $state.go('orderSetMeal',{setMealId:$stateParams.fromId});
        }else if($stateParams.from=='FOOD') {
            $state.go('orderFood',{foodId:$stateParams.fromId});
        }else{
            $state.go($stateParams.from);
        }
    });
})
.controller('userInfoCtrl',['$scope','$state',function($scope, $state) {
    $scope.nav.title = '个人中心';
    $scope.nav.back=false;
    $scope.$watch('$viewContentLoaded', function() {
        $state.go('userInfo.personalCenter')
    });
}])
    .controller('elementStatisticsCtrl',['$scope','$state','ElementStatistics','Session',function($scope, $state,ElementStatistics, Session) {
        $scope.nav.back=true;
        $scope.$watch('$viewContentLoaded', function() {
            listTodayElementStatistics();
            listHistoryElementStatistics();
        });
        function listTodayElementStatistics(){
            var promise=ElementStatistics.getTodayElementStatistics({userId:Session.userId});
            promise.then(function(data){
                $scope.todayElementStatistics=data.body;
            })
        }
        function listHistoryElementStatistics(){
            var promise=ElementStatistics.getHistoryElementStatistics({userId:Session.userId});
            promise.then(function(data){
                $scope.historyElementStatistics=data.body;
            })
        }
    }])
.controller('rawMaterialCtrl',['$scope','RawMaterial',function($scope, RawMaterial) {
     $scope.nav.back=false;
     $scope.$watch('$viewContentLoaded', function() {
         listRawMaterial();
     });
     function listRawMaterial(){
         var promise=RawMaterial.loadRawMaterial();
         promise.then(function(data){
             $scope.rawMaterials=data.body;
         })
     }
}])

.controller('wantToLookCtrl',['$scope','$state',function($scope,$state){
     $scope.nav.title='零距离';
     $scope.$watch('$viewContentLoaded', function() {
        $state.go('wantToLook.expressMap')
     });
}])
.controller('lookCtrl',['$scope','$modal','Look',function($scope,$modal,Look){
        $scope.$watch('$viewContentLoaded', function() {
            var promise=Look.getPhotoShow();
            promise.then(function(data){
                $scope.photoShows=data.body;
                $scope.photoShowTime=data.head.rtnMsg+"卫生抽查";

            })
        });
        $scope.openBigPhoto=function(bigPhotoPath){

            var modalInstance = $modal.open({
                templateUrl: 'bigPhoto.html',
                controller: 'modalOpenBigPhotoCtrl',
                resolve: {
                    message: function(){return bigPhotoPath;}
                }
            });
        };
}])
    .controller("modalOpenBigPhotoCtrl", ["$scope","message", function($scope, message){
        $scope.bigPhotoPath=message;
    }])
.controller('expressMapCtrl',["$scope","$interval","$state",'Express',"Session",function($scope,$interval, $state,Express, Session){

    var interval;

    $scope.$watch('$viewContentLoaded', function() {
        Express.expressPosition({userId:Session.userId}).then(function(res){
            $scope.mapOptions = {
                enableMapClick: false,
                // ui map config
                uiMapCache: true // 是否使用缓存来缓存此map dom，而不是每次链接跳转来都重新创建
            };
            var position=res.body;
            if(!position.longitude || !position.latitude) {
                $scope.hideMap=true;
                $scope.showTip = true;
            }else{
                $scope.hideMap=false;
                $scope.showTip = false;
                interval=$interval(function(){
                    Express.expressPosition({userId:Session.userId}).then(function(res){
                        var position=res.body;
                        sessionStorage.setItem("lng",position.longitude);
                        sessionStorage.setItem("lat",position.latitude);
                    });
                },5000)
            }
        });

    });

    $scope.$on("$destroy", function() {
        if(interval) {
            $interval.cancel(interval);
        }
    });
}])

.controller('feedbackCtrl',function($scope,Session,User){
    $scope.saveFeedback=function(){
        var data={
            userId:Session.userId,
            targetType:'ADVICE',
            content:$scope.content1+' - 联系方式：'+$scope.content2
        }
        User.saveFeedback(data).then(function(res){
            if(res.head.rtnMsg='success'){
                $scope.alert={
                    type:'success',
                    show:true,
                    msg:'感谢您的建议!我们会认真处理.'
                }
            }
        });
        $scope.closeAlert=function(){
            $scope.alert.show=false;
        }
    }
})
.controller('showCreditsCtrl',function($scope,$state,promise){
    $scope.nav.title = '我的积分';
    $scope.user=promise.body;

    $scope.nav.back=true;
    $scope.$on('back', function() {
        $state.go('userInfo');
    });
})
.controller('showCouponsCtrl',function($scope,$state,promise){
    $scope.nav.title = '我的礼券';
    $scope.coupons=promise.body;

    $scope.nav.back=true;
    $scope.$on('back', function() {
        $state.go('userInfo');
    });
})
.controller('showOrdersCtrl',function($scope,$state,promise){
    $scope.nav.title = '我的订单';
    $scope.orders=promise.body;

    $scope.oneAtATime=true;
    $scope.nav.back=true;
    $scope.$on('back', function() {
        $state.go('userInfo');
    });
})
.controller('showInfosCtrl',function($scope,$state,promise,User){
    $scope.nav.title = '个人信息';
    $scope.nav.edit = true;
    $scope.nav.shop = false;
    $scope.edit = false;
    $scope.user=promise.body;

    $scope.user.sexStr=$scope.user.sex=='male'?'男':'女';

    $scope.$on('edit', function(d) {
        $scope.edit = true;
    });
    $scope.saveUser=function(){
        User.saveUser($scope.user).then(function(data){
            if(data.body) {
                $scope.edit = false;
            }
        });
    }

    $scope.$on("$destroy", function() {
        $scope.nav.title='豆点吧';
        $scope.nav.edit = false;
        $scope.nav.shop = true;
    });

    $scope.nav.back=true;
    $scope.$on('back', function() {
        $state.go('userInfo');
    });
})




.controller('ModalInstanceCtrl', function ($scope, $modalInstance, items) {

    $scope.items = items;
    $scope.selected = {
        item: 1
    };

    $scope.ok = function () {
        $modalInstance.close(items[$scope.selected.item]);
    };

    $scope.cancel = function () {
        $modalInstance.dismiss('cancel');
    };
})

.controller('modalAlertInstanceCtrl',function($scope, $modalInstance, message){
    if(Array.isArray(message)){
        $scope.message = message;
    }else{
        $scope.message = [message];
    }
    $scope.ok = function () {
        $modalInstance.dismiss('cancel');
    };
})