/**
 * Created by kkk on 14/11/24.
 */

var services = angular.module('bfServices', ['bfApp.constants']);

services
    .factory('SetMeal', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};

        services.querySetMeals = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cGetSetMeals', data)
                .success(function (data) {
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }
        services.loadSetMeal = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetSetMealDetail',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        return services;
    }])
    .factory('Food', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};

        services.queryFoods = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cGetFoods', data)
                .success(function (data) {
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }
        services.loadFood = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetFoodDetail',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });

            return deferred.promise;
        }

        return services;
    }])
    .factory('Information', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};

        services.queryInformations = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cGetInformations', data)
                .success(function (data) {
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }
        services.loadInformation = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetInformation',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        return services;
    }])
    .factory('RawMaterial', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};
        services.loadRawMaterial = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cFindRawMaterial',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        return services;
    }])
    .factory('Order', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};

        services.toOrder = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cOrder', data)
                .success(function (data) {
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }

        return services;
    }])
    .factory('Express', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};
        services.expressPosition = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetExpressPosition',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });

            return deferred.promise;
        }

        return services;
    }])
    .factory('RedPaper', ['$q', '$http', 'ctx', function ($q, $http, ctx) {
        var services = {};
        services.saveRedPaper = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cSaveRedPaper',
                params: data,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });

            return deferred.promise;
        }

        services.getSendingRedPaper = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetSendingRedPaper',
                params: data,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });

            return deferred.promise;
        }
        services.checkRedPaper = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cCheckRedPaper',
                params: data,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });

            return deferred.promise;
        }
        return services;
    }])
    .factory('User', ['$q', '$http', 'ctx', 'Session', '$window', function ($q, $http, ctx, Session, $window) {
        var services = {};

        services.login = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cLogin', data)
                .success(function (data) {
                    var userInfo = data.body;
                    if (userInfo) {
                        Session.create(userInfo.userId, userInfo.userId, userInfo);
                        $window.sessionStorage["userInfo"] = JSON.stringify(userInfo);
                    }
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });

            return deferred.promise;
        }

        services.loadUser = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetUserInfo',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        services.loadUserCoupons = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetUserCoupons',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }
        services.loadUserOrders = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cGetUserOrders',
                params: data
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        services.isAuthenticated = function () {
            return !!Session.userId;
        }

        services.saveUser = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cSaveUser', data)
                .success(function (data) {
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });
            return deferred.promise;
        }
        services.saveOrLoginUser = function (data) {
            var deferred = $q.defer();
            $http.post(ctx + '/mobile/cSaveOrLoginUser', data)
                .success(function (data) {
                    var userInfo = data.body;
                    if (userInfo) {
                        Session.create(userInfo.userId, userInfo.userId, userInfo);
                        $window.sessionStorage["userInfo"] = JSON.stringify(userInfo);
                    }
                    deferred.resolve(data);
                }).error(function (data) {
                    deferred.reject(data);
                });
            return deferred.promise;
        }
        services.saveFeedback = function (data) {
            var deferred = $q.defer();
            $http({
                method: 'POST',
                url: ctx + '/mobile/cFeedback',
                params: data,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (data) {
                deferred.resolve(data);
            }).error(function (data) {
                deferred.reject(data);
            });
            return deferred.promise;
        }

        return services;
    }])

    .service('Session', function () {
        this.create = function (sessionId, userId, user) {
            this.id = sessionId;
            this.userId = userId;
            this.user = user;
        };
        this.destroy = function () {
            this.id = null;
            this.userId = null;
            this.user = null;
        };
        return this;
    })

    .service('ShoppingCart', function ($window, Session , _) {
        this.orderDetails = [];
        this.userId = '';
        this.create = function (orderDetails, userId) {
            this.orderDetails = orderDetails;
            this.userId = userId;
            return this;
        };
        this.destroy = function () {
            this.userId = '';
            this.orderDetails = [];
        };
        this.saveOrderDetail = function (orderDetail) {
            var shoppingCart = this || this.create([], Session.userId || '');
            shoppingCart.orderDetails.push(orderDetail);
            $window.sessionStorage["shoppingCart"] = JSON.stringify(shoppingCart);
        }
        this.count = function(){
            var orderDetails=this.orderDetails,length=orderDetails.length,od={},temp=[],count=0;
            for(var i= 0;i<length;i++) {
                od=orderDetails[i];
                if(!_.contains(temp, od.foodObjId)) {
                    count++;
                    temp.push(od.foodObjId);
                }
            }
            return count;
        }
        this.total = function(){
            var orderDetails=this.orderDetails,length=orderDetails.length,od={},total=0;
            for(var i= 0;i<length;i++) {
                total+=orderDetails[i].foodObjTotalPrice;
            }
            return total;
        }
        return this;
    })
    .factory('_', function () {
        return window._;
    })