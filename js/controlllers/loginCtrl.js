angular.module('cardapioADSApp')

.controller('loginCtrl',function($scope, $location) {

    $scope.usuario = {
        login: null,
        senha: null
    }

    var usuario = {
        login: 'admin',
        senha: 'admin'
    }

    $scope.acessarSistema = function(usuarioInformado) {
        if (usuarioInformado.login == usuario.login) {
            if (usuarioInformado.senha == usuario.senha){
                console.log('Login efetuado com sucesso!');
                $location.path('/home');
            }
            else {
                console.log('Senha errada!');
            }
        }
        else {
            console.log('Usuario inexistente!');
        }
    }

});