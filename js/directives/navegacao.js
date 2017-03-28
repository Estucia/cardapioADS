angular.module('cardapioADSApp')

.directive('navegacao',function(){
    return {
        restrict: 'E',
        templateUrl: 'partials/navegacao.html',
        controller: function($scope){
            $scope.menus = [
                {label: 'Home', url: '#!/home', ativo: true},
                {label: 'Pedidos', url: '#!/pedidos', ativo: false},
                {label: 'Produtos', url: '#!/produtos', ativo: false},
                {label: 'Clientes', url: '#!/clientes', ativo: false},
                {label: 'Usuarios', url: '#!/usuarios', ativo: false}
            ]
        }
    }
})