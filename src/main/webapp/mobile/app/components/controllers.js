/**
 * Created by kkk on 14/11/23.
 */
'use strict';

var ctrls=angular.module('bfControllers',['ui.router','bfServices']);

ctrls
.controller('ApplicationController', [
    '$scope',
    'User',
    function($scope, User){
        $scope.currentUser = null;
        $scope.isAuthorized = User.isAuthorized;$scope.nav={title : '早点吧'};
    }
])
.controller('welcomeCtrl',['$scope','$timeout','$state',function($scope,$timeout,$state){
    $scope.$watch('$viewContentLoaded', function() {
        $timeout(function(){
            $state.go('login');
        },100)
    });
}])
.controller('loginCtrl',['$scope','$rootScope','User','$state','$window','AUTH_EVENTS',function($scope,$rootScope,User,$state,$window,AUTH_EVENTS){
    $scope.loginError=false;
    $scope.errorText='用户名或密码错误';

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
}])
.controller('registerCtrl',['$scope','User','$state','$window',function($scope,User,$state,$window){

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
.controller('setMealCtrl',function($scope,promise){
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
})
.controller('orderCtrl',function($scope,promise,Order){
    var setMeal=promise.body;
    $scope.foodObjName=setMeal.setName;
    $scope.count=1;
    $scope.orderDetail={
        foodObjId:setMeal.setMealId,
        foodObjCount:$scope.count,
        foodObjType:'SETMEAL',
        foodObjPrice:setMeal.privilege
    };
    $scope.order={
        exccreaditCount:'',
        usedCoupons:'',
        status : 'DRAFT',
        orderPrice:setMeal.privilege*$scope.count
    };
    $scope.minus=function(){
        $scope.count--;
        $scope.order.orderPrice=setMeal.privilege*$scope.count;
    };
    $scope.plus=function(){
        $scope.count++;
        $scope.order.orderPrice=setMeal.privilege*$scope.count;
    };
    $scope.online=function() {
        $scope.order.orderType = 'online';
    };
    $scope.offline=function() {
        $scope.order.orderType = 'offline';
    };
    $scope.toOrder=function(){
        Order.toOrder().then(function(data){
            $scope.showResult=true;
        })
    };
})
.controller('userInfoCtrl',function($scope) {
       $scope.nav.title = '个人中心';
})
.controller('expressMapCtrl',function($scope) {
        $scope.nav.title = '想看看';
        $scope.mapOptions = {
            enableMapClick: false,
            // ui map config
            uiMapCache: true, // 是否使用缓存来缓存此map dom，而不是每次链接跳转来都重新创建
            lng:116.404,
            lat:39.915
        };
        $scope.map =function(){
            console.log("dfs");
        }
})
.controller('showCreditsCtrl',function($scope,promise){
    $scope.user=promise.body;
})
.controller('showCouponsCtrl',function($scope,promise){
    $scope.coupons=promise.body;
})
.controller('showOrdersCtrl',function($scope,promise){
    $scope.orders=promise.body;
})
.controller('showInfosCtrl',function($scope,promise){
    $scope.infos=promise.body;
})

