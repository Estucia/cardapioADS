angular.module('cardapioADSApp',['ngRoute'])

.config(function($routeProvider){
    
    $routeProvider.when('/', {
        templateUrl: 'view/login.html',
        controller: 'loginCtrl'
    }).when('/home',{
        templateUrl: 'view/home.html',
        controller: 'homeCtrl'
    });

    $routeProvider.otherwise({redirectTo: '/'});

});