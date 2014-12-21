
var directives=angular.module('bfDirectives',[]);

directives
.directive('unlink',function($parse){
    return {
        compile: function (tElm,tAttrs) {
            var fn = $parse(tAttrs.unlink);
            return {
                pre: function (scope,elm){
                    elm[0].addEventListener('click', function(e){
                        if(fn(scope)) {
                            e.stopImmediatePropagation();
                            event.preventDefault();
                            return false;
                        }
                    });
                }
            }
        }
    }
})
.directive('dateFormat', ['$filter',function($filter) {
    var dateFilter = $filter('date');
    return {
        require: 'ngModel',
        link: function(scope, elm, attrs, ctrl) {
            function formatter(value) {
                console.log(value)
                return dateFilter(value, 'yyyy-MM-dd');
            }
            function parser() {
                return ctrl.$modelValue;
            }
            ctrl.$formatters.push(formatter);
            ctrl.$parsers.unshift(parser);

        }
    };
}]);