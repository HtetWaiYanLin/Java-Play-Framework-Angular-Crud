
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/najd-dev/Documents/play-java/conf/routes
// @DATE:Sun Mar 12 04:26:52 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def deleteBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.deleteBookById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:8
    def template: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.template",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "template"})
        }
      """
    )
  
    // @LINE:15
    def listBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.listBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books"})
        }
      """
    )
  
    // @LINE:18
    def updateBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.updateBook",
      """
        function() {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books"})
        }
      """
    )
  
    // @LINE:17
    def createBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.createBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books"})
        }
      """
    )
  
    // @LINE:16
    def getbookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.getbookById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/books/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
