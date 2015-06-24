var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('RechercheController', function($scope, $http, $routeParams) {
    $http.get("/api/rechercher/"+$routeParams.centreInteret+"/"+$routeParams.civilite).success(function(listeUtilisateur) {
        $scope.listeUtilisateur = listeUtilisateur;
    });
});

app.controller('RechercheInteretController', function ($scope,$http) {
	$http.get("api/recherche/centreInteret").success(function(data) {
		$scope.listeInteret = data;
	});
});

app.config(['$routeProvider',
            function($routeProvider) {
                $routeProvider.
                    when('/RechercheListeUtilisateur/:centreInteret/:civilite', {
                        templateUrl: 'user/AfficherListeUtilisateur.html'
                    })
            }]);

app.config(['$routeProvider',
            function($routeProvider) {
                $routeProvider.
                    when('/RechercheUtilisateur', {
                        templateUrl: 'user/RechercherUtilisateur.html',
                        controller: 'RechercheInteretController'
                    })
            }]);