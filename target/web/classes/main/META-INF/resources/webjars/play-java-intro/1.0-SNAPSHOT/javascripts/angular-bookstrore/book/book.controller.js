function BookControllerFN($scope,Book){
    /*********Get All Books using ressoruce*******/
    $scope.books=Book.query();


    /*****Notify user when add/modify book using msg*/
    $scope.msg = "";

    $scope.book=new Book();
    var selectedIndex=null;

    /*********Select Book to be shown in form *******/
    $scope.selectBook=function(_book,_$index){
        $scope.msg ="";
        selectedIndex=_$index;
        $scope.book=_book;
    };



    /*********Update +  Add Book*******/
    $scope.save=function(){


        if(!$scope.BookFrom.$valid){
            $scope.msg ="Some Fields are empty";
            return;
        }

        if(selectedIndex==null){

            $scope.book.$save();
            $scope.books.push($scope.book);
            $scope.msg ="Book added";
            $scope.book = new Book();
            selectedIndex = null;
        }else{
            $scope.book.$update();
            $scope.msg ="Book Updated";
        }

    };

    $scope.delete=function(_book,_$index){
        selectedIndex=_$index;
        $scope.book=_book;
        $scope.book.$remove();
        $scope.books.splice(selectedIndex,1);
    };


    /*******reset all input of form */
    $scope.reset=function() {
        $scope.msg ="";
        $scope.book = new Book();
        selectedIndex = null;

    };
    /*******Hide form books */
    $scope.Hideform = function(){
        $scope.book=new Book();
        selectedIndex=null;
        $scope.visible = false;
        $scope.msg ="";

    };
    /*******Show form books */
    $scope.showform = function(){
        $scope.book=new Book();
        selectedIndex=null;
        $scope.visible = true;
        $scope.msg ="";
    }


}
BookControllerFN.$inject=["$scope","Book"];
angular
    .module("bookStore")
    .controller("BookController",BookControllerFN);