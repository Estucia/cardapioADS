angular.module('cardapioADSApp')

.controller('usuarioCtrl',function($scope, $http) {

    $scope.usuario = {
        id: null,
        nome: null,
        login: null,
        senha: null
    }

    $scope.listaUsuarios = [];

    $scope.salvar = function(usuario){
        $http.post('http://localhost:8080/CardapioADS/webservice/usuario/salvar',usuario)
            .then(function(response){
                $scope.listaUsuarios.push(response.data);

                delete $scope.usuario;
                $('#cadastroUsuariosModal').modal('hide');    
            }, function(error){
                console.log(error);
            });
    }

});