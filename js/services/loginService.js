angular.module('cardapioADSApp')

.service('loginService', function($http){

    var _login = function(usuario){
        return $http.post('http://localhost:8080/CardapioADS/webservice/usuario/login',usuario);
    }

    return {
        login: _login
    }

})