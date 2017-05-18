angular.module('cardapioADSApp')

.controller('loginCtrl',function($scope, $location,loginService) {

    $scope.usuario = {
        login: null,
        senha: null
    }

    $scope.acessarSistema = function(usuarioInformado) {
        loginService.login(usuarioInformado)
            .then(function(response){
                if (response.data){
                    console.log('Login efetuado com sucesso!');
                    $location.path('/home');
                } else {
                    alert('login inválido!')
                }
            },function(error){
                console.log(error);
            });

    }
});