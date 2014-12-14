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
            bottomShow : true
        };
        $scope.toLogin=function(){
            if(Session.userId) {
                $state.go('userInfo');
            }else{
                $state.go('login');
            }
        }
    }
])
.controller('welcomeCtrl',['$scope','$timeout','$state',function($scope,$timeout,$state){
    $scope.$watch('$viewContentLoaded', function() {
        $timeout(function(){
            //$state.go('login');
            $state.go('main');
        },100)
    });
}])
.controller('loginCtrl',['$scope','$rootScope','User','$state','$window','AUTH_EVENTS',function($scope,$rootScope,User,$state,$window,AUTH_EVENTS){
    $scope.loginError=false;
    $scope.errorText='用户名或密码错误';
    $scope.nav.title='登录';
    $scope.nav.registerShow=true;
    $scope.nav.bottomShow=false;

    $scope.login=function(){
        var promise=User.login($scope.user);
        promise.then(function(data){
            if(data.head.rtnMsg=='success'){
                $rootScope.$broadcast(AUTH_EVENTS.loginSuccess);
                $state.go('main');
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
    });
}])
.controller('registerCtrl',['$scope','User','$state','$window',function($scope,User,$state,$window){
    $scope.nav.title='注册';

    $scope.login=function(){
    var promise=User.register($scope.user);
    promise.then(function(data){
        if(data.head.rtnMsg=='success'){
            $state.go('login');
        }
    })
}
}])
.controller('mainCtrl',['$scope','$state',function($scope,$state){
    $scope.nav.title='早点吧';

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
.controller('setMealCtrl',function($scope,$state,promise,ShoppingCart){
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
        foodObjTotalPrice:setMeal.privilege
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
        $state.go('addToOrder',{setMealId:setMeal.setMealId});
    };
})
.controller('orderCtrl',function($scope,Order,ShoppingCart,userInfo,$window,Session,_){
    $scope.nav.title='立即支付';
    $scope.hasCoupons=false;
    $scope.hasCredits=false;
    if(userInfo){
        userInfo.userCustomer=userInfo.userCustomer||{};
        $scope.hasCredits=userInfo.userCustomer.credits||0>0;
    }else{
        userInfo = {userCustomer:{}};
    }

    var loadOrderDetails=ShoppingCart.orderDetails;
    var total= 0,orderDetails=[],temp=[],od={},index=-1,el={};
    for(var i= 0,length=loadOrderDetails.length;i<length;i++) {
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
    }
    $scope.orderDetails=orderDetails;
    $scope.order={
        customerId:Session.userId||'',
        exccreaditCount:0,
        usedCoupons:'',
        status:'DRAFT',
        orderDetails:$scope.orderDetails,
        orderPrice:total,
        consigneeMobile:userInfo.mobile||'',
        consigneeName:userInfo.userName||'',
        consigneeAddress:userInfo.userCustomer.address1||'',
        preSendTime:'08:00-08:30'
    };

    $scope.online=function() {
        $scope.order.orderType = 'online';
    };
    $scope.offline=function() {
        $scope.order.orderType = 'offline';
    };
    $scope.toOrder=function(){
        Order.toOrder($scope.order).then(function(data){
            $window.alert('订单已生成!');
            $scope.showResult=true;
            ShoppingCart.destroy();
            $window.sessionStorage.removeItem("shoppingCart");
        })
    };
})
.controller('userInfoCtrl',['$scope','$state',function($scope, $state) {
    $scope.nav.title = '零距离';
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
    $scope.mapOptions = {
        enableMapClick: false,
        // ui map config
        uiMapCache: true // 是否使用缓存来缓存此map dom，而不是每次链接跳转来都重新创建
    };
    var interval;
    $scope.$watch('$viewContentLoaded', function() {
        interval=$interval(function(){
            Express.expressPosition({userId:Session.userId}).then(function(res){
                var position=res.body;
                sessionStorage.setItem("lng",position.longitude);
                sessionStorage.setItem("lat",position.latitude);
            });
        },5000)
    });

    $scope.$on("$destroy", function() {
        $interval.cancel(interval);
    });
}])

.controller('showCreditsCtrl',function($scope,promise){
    $scope.nav.title = '我的积分';
    $scope.user=promise.body;
})
.controller('showCouponsCtrl',function($scope,promise){
    $scope.nav.title = '我的礼券';
    $scope.coupons=promise.body;
})
.controller('showOrdersCtrl',function($scope,promise){
    $scope.nav.title = '我的订单';
    $scope.orders=promise.body;
})
.controller('showInfosCtrl',function($scope,promise){
    $scope.nav.title = '个人信息';
    $scope.user=promise.body;
})

