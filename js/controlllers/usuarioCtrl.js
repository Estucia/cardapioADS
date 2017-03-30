angular.module('cardapioADSApp')

.controller('usuarioCtrl',function($scope) {

    $scope.usuario = {
        id: null,
        nome: null,
        login: null,
        senha: null
    }

    $scope.listaUsuarios = [];

    $scope.salvar = function(usuarioCadastrado){
        $scope.listaUsuarios.push(usuarioCadastrado);
        delete $scope.usuario;
        $('#cadastroUsuariosModal').modal('hide');
    }

});