
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
