function ProductFN($resource){

    var url = "http://localhost:9000/api/books/:id";
    var params={id:"@id"};
    var customMethods={
        'update':{
            method:"PUT",
            params: {
                id: null
            }
        }
    };
    return $resource(url,params,customMethods);
}
ProductFN.$inject=["$resource"];
angular
    .module("bookStore")
    .factory("Book",ProductFN);