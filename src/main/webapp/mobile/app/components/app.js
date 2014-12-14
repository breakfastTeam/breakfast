'use strict';

// Declare app level module which depends on views, and components
var app=angular.module('bfApp', ['ui.router','ui.bootstrap','pasvaz.bindonce','bfControllers','bfServices','bfDirectives','ui.map']);

app.config(function($stateProvider,$urlRouterProvider,$locationProvider){
    //$locationProvider.html5Mode(true);

    $urlRouterProvider.when("", "/welcome");

    $stateProvider
        .state('welcome',{
            url:'/welcome',
            templateUrl:'tlps/welcome.html',
            controller:'welcomeCtrl'
        })
        .state('login',{
            url:'login',
            templateUrl:'tlps/login.html',
            controller:'loginCtrl'
        })
        .state('register',{
            url:'register',
            templateUrl:'tlps/register.html',
            controller:'registerCtrl'
        })
        .state('main',{
            url:'/main',
            templateUrl:'tlps/main.html',
            controller:'mainCtrl'
        })
        .state('main.setMeals',{
            url:'/main',
            templateUrl:'tlps/setMeals.html',
            controller:'mainSetMealsCtrl'
        })
        .state('main.foods',{
            url:'/main',
            templateUrl:'tlps/foods.html',
            controller:'mainFoodsCtrl'
        })
        .state('main.informations',{
            url:'/main',
            templateUrl:'tlps/informations.html',
            controller:'mainInformationsCtrl'
        })
        .state('informationDetail',{
            url:'/informationDetail/:informationId',
            templateUrl:'tlps/informationDetail.html',
            controller:'informationDetailCtrl',
            resolve:{
                promise:function($stateParams,Information){
                    var data={informationId:$stateParams.informationId};
                    return Information.loadInformation(data);
                }
            }
        })
        .state('orderSetMeal',{
            url:'/orderSetMeal/:setMealId',
            templateUrl:'tlps/orderSetMeal.html',
            controller:'setMealCtrl',
            resolve:{
                promise:function($stateParams,SetMeal){
                    var data={setMealId:$stateParams.setMealId};
                    return SetMeal.loadSetMeal(data);
                }
            }
        })
        .state('addToOrder',{
            url:'/addToOrder/:setMealId',
            templateUrl:'tlps/addToOrder.html',
            controller:'orderCtrl',
            resolve:{
                userInfo:function(User,Session){
                    if(Session.userId) {
                        var data={userId:Session.userId};
                        return User.loadUser(data);
                    }
                }
            }
        })
        .state('wantToLook',{
            url:'/wantToLook',
            templateUrl:'tlps/wantToLook.html',
            controller:'wantToLookCtrl'
        })
        .state('wantToLook.expressMap',{
            url:'/wantToLook',
            templateUrl:'tlps/expressMap.html',
            controller:'expressMapCtrl',
            resolve:{
                promise:function($stateParams,Session,Express){
                    var data={userId:Session.userId};
                    return Express.expressPosition(data);
                }
            }
        })
        .state('wantToLook.serviceArea',{
            url:'/wantToLook',
            templateUrl:'tlps/serviceArea.html'
        })
        .state('userInfo',{
            url:'/userInfo',
            templateUrl:'tlps/userInfo.html',
            controller:'userInfoCtrl'
        })
        .state('userInfo.personalCenter',{
            url:'/userInfo',
            templateUrl:'tlps/personalCenter.html'
        })
        .state('userInfo.feedback',{
            url:'/userInfo',
            templateUrl:'tlps/feedback.html'
        })
        .state('showCredits',{
            url:'/showCredits',
            templateUrl:'tlps/showCredits.html',
            controller:'showCreditsCtrl',
            resolve:{
                promise:function(User,Session){
                    var data={userId:Session.userId};
                    return User.loadUser(data);
                }
            }
        })
        .state('showCoupons',{
            url:'/showCoupons',
            templateUrl:'tlps/showCoupons.html',
            controller:'showCouponsCtrl',
            resolve:{
                promise:function(User,Session){
                    var data={userId:Session.userId};
                    return User.loadUserCoupons(data);
                }
            }
        })
        .state('showOrders',{
            url:'/showOrders',
            templateUrl:'tlps/showOrders.html',
            controller:'showOrdersCtrl',
            resolve:{
                promise:function(User,Session){
                    var data={userId:Session.userId};
                    return User.loadUserOrders(data);
                }
            }
        })
        .state('showInfos',{
            url:'/showInfos',
            templateUrl:'tlps/showInfos.html',
            controller:'showInfosCtrl',
            resolve:{
                promise:function(User,Session){
                    var data={userId:Session.userId};
                    return User.loadUser(data);
                }
            }
        })
});

app.constant('AUTH_EVENTS', {
    loginSuccess: 'auth-login-success',
    loginFailed: 'auth-login-failed',
    logoutSuccess: 'auth-logout-success',
    sessionTimeout: 'auth-session-timeout',
    notAuthenticated: 'auth-not-authenticated',
    notAuthorized: 'auth-not-authorized'
});


app.run([
    '$rootScope',
    '$state',
    '$window',
    'AUTH_EVENTS',
    'User',
    'Session',
    'ShoppingCart',
    function($rootScope,$state,$window, AUTH_EVENTS, User,Session,ShoppingCart){
        if ($window.sessionStorage["userInfo"]) {
            var userInfo = JSON.parse($window.sessionStorage["userInfo"]);
            Session.create(userInfo.userId, userInfo.userId, userInfo);
        }
        if ($window.sessionStorage["shoppingCart"]) {
            var shoppingCart = JSON.parse($window.sessionStorage["shoppingCart"]);
            ShoppingCart.create(shoppingCart.orderDetails, Session.userId);
        }
        $rootScope.$on('$locationChangeStart', function(event, next){
            if(next.state!='login'&&!User.isAuthenticated()) {
                $rootScope.$broadcast(AUTH_EVENTS.notAuthenticated);
                //$state.go('login');
                console.log("未登录");
            }
        });
    }
]);


app.filter('to_trusted', ['$sce', function ($sce) {
    return function (text) {
        return $sce.trustAsHtml(text);
    }
}]);
app.config(['uiMapLoadParamsProvider', function (uiMapLoadParamsProvider) {
    uiMapLoadParamsProvider.setParams({
        v: '2.0',
        ak:'G8eLGMlNf9Yh0ncZEqcro4K2'
    });
}]);
