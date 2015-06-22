var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('RechercheController', function($scope, $http) {
    $http.get('/api/rechercher').success(function(listeUtilisateur) {
        $scope.listeUtilisateur = listeUtilisateur;
    });
});

app.config(['$routeProvider',
            function($routeProvider) {
                $routeProvider.
                    when('/RechercheListeUtilisateur', {
                        templateUrl: 'user/RechercheListeUtilisateur.html'
                    })
            }]);