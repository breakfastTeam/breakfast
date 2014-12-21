/**
 * Created by kkk on 14/11/23.
 */
'use strict';

var ctrls=angular.module('bfControllers',['ui.router','bfServices']);

ctrls
.controller('ApplicationController', [
    '$scope',
    '$state',
    'User',
    'Session',
    function($scope,$state, User,Session){
        $scope.currentUser = null;
        $scope.isAuthorized = User.isAuthorized;
        $scope.nav={
            title : '早点吧',
            registerShow : false,
            bottomShow : true,
            shop:true
        };
        $scope.toLogin=function(){
            if(Session.userId) {
                $state.go('userInfo');
            }else{
                $state.go('login');
            }
        }
        $scope.toExpressMap=function(){
            if(Session.userId) {
                $state.go('wantToLook.expressMap');
            }else{
                $state.go('login');
            }
        }
        $scope.edit=function(){
            $scope.$broadcast('edit');
        }
        $scope.back=function(){
            $scope.$broadcast('back');
        }
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
.controller('activityCtrl',function($scope, Session, $state, RedPaper, $stateParams){
    $scope.disableBtn=true;

    $scope.$watch('$viewContentLoaded', function() {
        if(Session.userId){
            $scope.activityInfoText = "好友分享给您一份红包，赶快去抢吧";
            $scope.showPhoneRow = false;
            $scope.btnColor = "btn-danger";
            $scope.disableBtn=false;
        }else{
            $scope.activityInfoText = "输入手机号，红包将放入您的生活账户";
            $scope.showPhoneRow = true;

            $scope.$watch('phone', function(newValue, oldValue) {
                var phone = /^1[34578]\d{9}$/;//校验手机号的正则表达式
                if(phone.test(newValue)){
                    $scope.btnColor = "btn-danger";
                    $scope.disableBtn=false;
                }else{
                    $scope.btnColor = "btn-default";
                    $scope.disableBtn=true;
                }
            });

        }
    });

    $scope.saveRedPaper=function($stateParams){
        $scope.disableBtn=true;
        var data={sendCouponId:$stateParams.sendCouponId};
        var promise = RedPaper.saveRedPaper(data);
        promise.then(function(data){
            console.log(data)
        });
    }
})
.controller('loginCtrl',['$scope','$rootScope','User','RedPaper','$state','$window','Session','AUTH_EVENTS',function($scope,$rootScope,User,RedPaper,$state,$window,Session, AUTH_EVENTS){
    $scope.loginError=false;
    $scope.errorText='用户名或密码错误';
    $scope.nav.title='登录';
    $scope.nav.shop=false;
    $scope.nav.registerShow=true;
    $scope.nav.bottomShow=false;

    $scope.login=function(){
        var promise=User.login($scope.user);
        promise.then(function(data){
            if(data.head.rtnMsg=='success'){
                $rootScope.$broadcast(AUTH_EVENTS.loginSuccess);

                var getSendingRedPaperData={userId:Session.userId};
                var redPaperPromise = RedPaper.getSendingRedPaper(getSendingRedPaperData)
                redPaperPromise.then(function(data){
                    console.log(data);
                    if(data.body.sendCouponId){
                        $state.go('activity',{sendCouponId:data.body.sendCouponId});
                    }else{
                        $state.go('main');
                    }
                });
            }else{
                $rootScope.$broadcast(AUTH_EVENTS.loginFailed);
                $scope.loginError=true;
            }
        })
    }
    $scope.$on("$destroy", function() {
        $scope.nav.title='早点吧';
        $scope.nav.registerShow=false;
        $scope.nav.bottomShow=true;
        $scope.nav.shop=true;
    });
}])
.controller('registerCtrl',['$scope','User','$state','$window','$timeout',function($scope,User,$state,$timeout){
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
                $timeout(function(){
                    $state.go('login');
                },2000);
            }else if(data.head.rtnCode=='000000'){
                $scope.alert.show=true;
                $scope.alert.msg=data.head.rtnMsg;
            }
        })
    }

    $scope.$on("$destroy", function() {
        $scope.nav.shop=true;
    });
}])
.controller('mainCtrl',['$scope','$state',function($scope,$state){
    $scope.nav.title='早点吧';
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
        loadMoreText:'点击加载更多品质美味',
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
.controller('setMealCtrl',function($scope,$state,promise,ShoppingCart,$stateParams){
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
        $state.go('addToOrder',{from:'SETMEAL',fromId:setMeal.setMealId});
    };
    $scope.addToShop=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
    };
    $scope.$on('back', function() {
        $state.go('main.setMeals');
    });
})
.controller('foodCtrl',function($scope,$state,promise,ShoppingCart,$stateParams){
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
        $state.go('addToOrder',{from:'FOOD',fromId:food.foodId});
    };
    $scope.addToShop=function(){
        ShoppingCart.saveOrderDetail($scope.orderDetail);
    };
    $scope.$on('back', function() {
        $state.go('main.foods');
    });
})
.controller('orderCtrl',function($scope,Order,ShoppingCart,promise,$window,Session,ORDER_LIMIT,$modal,$stateParams,$state,_){
    $scope.nav.title='立即支付';
    $scope.nav.back=true;
    $scope.hasCoupons=false;
    $scope.hasCredits=false;
    var userInfo=promise.body;
    if(userInfo){
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
            el.foodObjCount+=od.foodObjCount;
            el.foodObjTotalPrice+=od.foodObjTotalPrice;
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
        exccreaditCount:userInfo.userCustomer.credits,
        usedCoupons:0,
        status:'DRAFT',
        orderDetails:$scope.orderDetails,
        orderPrice:total,
        consigneeMobile:userInfo.mobile||'',
        consigneeName:userInfo.userName||'',
        consigneeAddress:userInfo.userCustomer.address1||'如:财富广场3号楼302室',
        orderType:'online',
        preSendDate:new Date(),
        preSendTime:'08:00-08:30'
    };

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
            $window.alert('订单已生成!');
            $scope.showResult=true;
            ShoppingCart.destroy();
            $window.sessionStorage.removeItem("shoppingCart");
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
    $scope.nav.title = '零距离';
    $scope.nav.back=false;
    $scope.$watch('$viewContentLoaded', function() {
        $state.go('userInfo.personalCenter')
    });
}])

.controller('wantToLookCtrl',['$scope','$state',function($scope,$state){
     $scope.nav.title='想看看';
     $scope.$watch('$viewContentLoaded', function() {
        $state.go('wantToLook.expressMap')
     });
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
        $scope.nav.title='早点吧';
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
