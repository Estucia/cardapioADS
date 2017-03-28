angular.module('cardapioADSApp',['ngRoute'])

.config(function($routeProvider){
    
    $routeProvider.when('/', {
        templateUrl: 'view/login.html',
        controller: 'loginCtrl'
    }).when('/home', {
        templateUrl: 'view/home.html',
        controller: 'homeCtrl'
    }).when('/pedidos', {
        templateUrl: 'view/pedidos.html',
        controller: 'pedidosCtrl'
    }).when('/produtos', {
        templateUrl: 'view/produtos.html',
        controller: 'produtosCtrl'
    }).when('/clientes', {
        templateUrl: 'view/clientes.html',
        controller: 'clientesCtrl'
    }).when('/usuarios', {
        templateUrl: 'view/usuario.html',
        controller: 'usuarioCtrl'
    });

    $routeProvider.otherwise({redirectTo: '/'});

}); 