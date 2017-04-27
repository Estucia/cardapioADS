angular.module('cardapioADSApp')

.controller('usuarioCtrl',function($scope, $http) {

    $scope.usuario = {
        idUsuario: null,
        nome: null,
        login: null,
        senha: null,
        logado: false
    }

    $scope.listaUsuarios = [];

    function constructor(){
        $scope.getTodos();
    }

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

    $scope.getTodos = function(){
        $http.get('http://localhost:8080/CardapioADS/webservice/usuario/getTodos')
            .then(function(response){
                $scope.listaUsuarios.push(response.data);
            }, function(error){
                console.log(error);
            });
    }

    constructor();
});