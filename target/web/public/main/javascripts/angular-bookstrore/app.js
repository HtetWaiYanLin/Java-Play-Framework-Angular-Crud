function configFN($routeProvider){
    $routeProvider
        .when("/books",{
            controller:"BookController",
            templateUrl:"/template"
        })
        .otherwise({redirectTo:"/books"});
}

angular
    .module("bookStore",["ngRoute","ngResource"])
    .config(configFN);