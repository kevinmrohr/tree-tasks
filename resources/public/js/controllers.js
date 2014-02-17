var treeTasksApp = angular.module('treeTasksApp', []);

treeTasksApp.controller('ProjectListCtrl', ['$scope', '$http', function ($scope, $http) {
    $http.get('/api/project-list/kevinmrohr').success(function (data) {
        $scope.projects = data;
        $.getScript( "/js/dnd.js" )
    });
}]);