
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Book Store</title>

            <!-- Bootstrap core CSS -->
        <link  href=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("bootstrap/css/bootstrap.min.css")),format.raw/*11.74*/("""" rel="stylesheet">
        <link  href=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("stylesheets/navbar.css")),format.raw/*12.65*/("""" rel="stylesheet">
          <script src=""""),_display_(/*13.25*/routes/*13.31*/.Assets.at("javascripts/jquery-1.9.0.min.js")),format.raw/*13.76*/("""" type="text/javascript"></script>
            <!-- Angular -->
        <script type='text/javascript' src='"""),_display_(/*15.46*/routes/*15.52*/.Assets.at("javascripts/angular-bookstrore/lib/angular.js")),format.raw/*15.111*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*16.46*/routes/*16.52*/.Assets.at("javascripts/angular-bookstrore/lib/angular-route.js")),format.raw/*16.117*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*17.46*/routes/*17.52*/.Assets.at("javascripts/angular-bookstrore/lib/angular-resource.js")),format.raw/*17.120*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*18.46*/routes/*18.52*/.Assets.at("javascripts/angular-bookstrore/app.js")),format.raw/*18.103*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*19.46*/routes/*19.52*/.Assets.at("javascripts/angular-bookstrore/book/book.resource.js")),format.raw/*19.118*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*20.46*/routes/*20.52*/.Assets.at("javascripts/angular-bookstrore/book/book.controller.js")),format.raw/*20.120*/("""'></script>
        <script type='text/javascript' src='"""),_display_(/*21.46*/routes/*21.52*/.Assets.at("javascripts/angular-bookstrore/component/dropzone.directive.js")),format.raw/*21.128*/("""'></script>



    </head>
    <body ng-app="bookStore">

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">BookStore</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">Books</a></li>

                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav>

        <div class="container">

            <div class="jumbotron">

            """),_display_(/*52.14*/content),format.raw/*52.21*/("""
            """),format.raw/*53.13*/("""</div>
        </div>

    </body>
</html>








"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Mar 12 02:43:10 CET 2017
                  SOURCE: /home/najd-dev/Documents/play-java/app/views/main.scala.html
                  HASH: 02ef2ba40aac38c9e920b46198db388e3c4f20ea
                  MATRIX: 748->1|873->31|901->33|1213->318|1228->324|1294->369|1363->411|1378->417|1435->453|1506->497|1521->503|1587->548|1723->657|1738->663|1819->722|1903->779|1918->785|2005->850|2089->907|2104->913|2194->981|2278->1038|2293->1044|2366->1095|2450->1152|2465->1158|2553->1224|2637->1281|2652->1287|2742->1355|2826->1412|2841->1418|2939->1494|4061->2589|4089->2596|4130->2609
                  LINES: 27->1|32->1|34->3|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|83->52|83->52|84->53
                  -- GENERATED --
              */
          