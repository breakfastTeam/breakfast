/**
 * Created by kkk on 14/11/24.
 */

var services=angular.module('bfServices',['bfApp.constants']);

services
.factory('SetMeal',['$q','$http','ctx',function($q,$http,ctx){
    var services = {};

    services.querySetMeals=function(data){
        var deferred = $q.defer();
        $http.post(ctx+'/mobile/cGetSetMeals',data)
            .success(function(data){
                deferred.resolve(data);
            }).error(function(data){
                deferred.reject(data);
            });

        return deferred.promise;
    }
    services.loadSetMeal=function(data){
        var deferred = $q.defer();
        $http({
            method:'POST',
            url:ctx+'/mobile/cGetSetMealDetail',
            params:data
        }).success(function(data){
            deferred.resolve(data);
        }).error(function(data){
            deferred.reject(data);
        });
        return deferred.promise;
    }

    return services;
}])
.factory('Food',['$q','$http','ctx',function($q,$http,ctx){
    var services = {};

    services.queryFoods=function(data){
        var deferred = $q.defer();
        $http.post(ctx+'/mobile/cGetFoods',data)
            .success(function(data){
                deferred.resolve(data);
            }).error(function(data){
                deferred.reject(data);
            });

        return deferred.promise;
    }

    return services;
}])
.factory('Information',['$q','$http','ctx',function($q,$http,ctx){
    var services = {};

    services.queryInformations=function(data){
        var deferred = $q.defer();
        $http.post(ctx+'/mobile/cGetInformations',data)
            .success(function(data){
                deferred.resolve(data);
            }).error(function(data){
                deferred.reject(data);
            });

        return deferred.promise;
    }

    return services;
}])
.factory('Order',['$q','$http','ctx',function($q,$http,ctx){
    var services = {};

    services.toOrder=function(data){
        var deferred = $q.defer();
        $http.post(ctx+'/mobile/cOrder',data)
            .success(function(data){
                deferred.resolve(data);
            }).error(function(data){
                deferred.reject(data);
            });

        return deferred.promise;
    }

    return services;
}])

.factory('User',['$q','$http','ctx','Session','$window',function($q,$http,ctx,Session,$window){
    var services = {};

    services.login=function(data){
        var deferred = $q.defer();
        $http.post(ctx+'/mobile/cLogin',data)
            .success(function(data){
                var userInfo=data.body;
                if(userInfo) {
                    Session.create(userInfo.userId, userInfo.userId, userInfo);
                    $window.sessionStorage["userInfo"] = JSON.stringify(userInfo);
                }
                deferred.resolve(data);
            }).error(function(data){
                deferred.reject(data);
            })
        ;

        return deferred.promise;
    }

    services.loadUser=function(data){
        var deferred = $q.defer();
        $http({
            method:'POST',
            url:ctx+'/mobile/cGetUserInfo',
            params:data
        }).success(function(data){
            deferred.resolve(data);
        }).error(function(data){
            deferred.reject(data);
        });
        return deferred.promise;
    }

    services.loadUserCoupons=function(data){
        var deferred = $q.defer();
        $http({
            method:'POST',
            url:ctx+'/mobile/cGetUserCoupons',
            params:data
        }).success(function(data){
            deferred.resolve(data);
        }).error(function(data){
            deferred.reject(data);
        });
        return deferred.promise;
    }
    services.loadUserOrders=function(data){
        var deferred = $q.defer();
        $http({
            method:'POST',
            url:ctx+'/mobile/cGetUserOrders',
            params:data
        }).success(function(data){
            deferred.resolve(data);
        }).error(function(data){
            deferred.reject(data);
        });
        return deferred.promise;
    }

    services.isAuthenticated=function(){
        return !!Session.userId;
    }
    return services;
}])

.service('Session', function(){
    this.create = function(sessionId, userId,user){
        this.id = sessionId;
        this.userId = userId;
        this.user = user;
    };
    this.destroy = function(){
        this.id = null;
        this.userId = null;
        this.user = null;
    };
    return this;
})

.service('shoppingCart', function(){
    this.create = function(shoppingCart, userId){
        this.shoppingCart = shoppingCart;
        this.userId = userId;
    };
    this.destroy = function(){
        this.userId = null;
        this.shoppingCart = null;
    };
    return this;
})