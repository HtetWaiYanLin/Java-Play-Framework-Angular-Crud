
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/najd-dev/Documents/play-java/conf/routes
// @DATE:Sun Mar 12 04:26:52 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  BookController_0: controllers.BookController,
  // @LINE:23
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    BookController_0: controllers.BookController,
    // @LINE:23
    Assets_1: controllers.Assets
  ) = this(errorHandler, BookController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BookController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.BookController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """template""", """controllers.BookController.template()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.listBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""" + "$" + """id<[0-9]+>""", """controllers.BookController.getbookById(id:Integer)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.createBook()"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books""", """controllers.BookController.updateBook()"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/books/""" + "$" + """id<[0-9]+>""", """controllers.BookController.deleteBookById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_BookController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_BookController_index0_invoker = createInvoker(
    BookController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BookController_template1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("template")))
  )
  private[this] lazy val controllers_BookController_template1_invoker = createInvoker(
    BookController_0.template(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "template",
      Nil,
      "GET",
      """Render AngularJS ng-view""",
      this.prefix + """template"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BookController_listBooks2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_listBooks2_invoker = createInvoker(
    BookController_0.listBooks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "listBooks",
      Nil,
      "GET",
      """""",
      this.prefix + """api/books"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BookController_getbookById3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_BookController_getbookById3_invoker = createInvoker(
    BookController_0.getbookById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getbookById",
      Seq(classOf[Integer]),
      "GET",
      """""",
      this.prefix + """api/books/""" + "$" + """id<[0-9]+>"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_BookController_createBook4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_createBook4_invoker = createInvoker(
    BookController_0.createBook(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "createBook",
      Nil,
      "POST",
      """""",
      this.prefix + """api/books"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_BookController_updateBook5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books")))
  )
  private[this] lazy val controllers_BookController_updateBook5_invoker = createInvoker(
    BookController_0.updateBook(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "updateBook",
      Nil,
      "PUT",
      """""",
      this.prefix + """api/books"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_BookController_deleteBookById6_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/books/"), DynamicPart("id", """[0-9]+""",false)))
  )
  private[this] lazy val controllers_BookController_deleteBookById6_invoker = createInvoker(
    BookController_0.deleteBookById(fakeValue[Integer]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "deleteBookById",
      Seq(classOf[Integer]),
      "DELETE",
      """""",
      this.prefix + """api/books/""" + "$" + """id<[0-9]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_BookController_index0_route(params) =>
      call { 
        controllers_BookController_index0_invoker.call(BookController_0.index())
      }
  
    // @LINE:8
    case controllers_BookController_template1_route(params) =>
      call { 
        controllers_BookController_template1_invoker.call(BookController_0.template())
      }
  
    // @LINE:15
    case controllers_BookController_listBooks2_route(params) =>
      call { 
        controllers_BookController_listBooks2_invoker.call(BookController_0.listBooks())
      }
  
    // @LINE:16
    case controllers_BookController_getbookById3_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BookController_getbookById3_invoker.call(BookController_0.getbookById(id))
      }
  
    // @LINE:17
    case controllers_BookController_createBook4_route(params) =>
      call { 
        controllers_BookController_createBook4_invoker.call(BookController_0.createBook())
      }
  
    // @LINE:18
    case controllers_BookController_updateBook5_route(params) =>
      call { 
        controllers_BookController_updateBook5_invoker.call(BookController_0.updateBook())
      }
  
    // @LINE:19
    case controllers_BookController_deleteBookById6_route(params) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BookController_deleteBookById6_invoker.call(BookController_0.deleteBookById(id))
      }
  
    // @LINE:23
    case controllers_Assets_at7_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_1.at(path, file))
      }
  }
}
