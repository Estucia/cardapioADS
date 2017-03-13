angular.module('cardapioADSApp',['ngRoute'])

.config(function($routeProvider){
    
    $routeProvider.when('/', {
        templateUrl: 'view/login.html',
        controller: 'loginCtrl'
    });

    $routeProvider.otherwise({redirectTo: '/'})

});