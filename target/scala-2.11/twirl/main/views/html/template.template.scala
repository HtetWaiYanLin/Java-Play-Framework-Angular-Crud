
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object template_Scope0 {
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

class template extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<span><button ng-show="!visible" ng-click="showform()" class="btn btn-info">Add Book</button>
    <button ng-show="visible" ng-click="Hideform()" class="btn btn-info"><span class="glyphicon glyphicon-remove"></span>Cancel</button>
</span>

<div style="width: 50%"  ng-show="visible" >
    <div class="panel panel-default">
        <div class="panel-body">
            <button class="btn btn-info" ng-click="save()"><span class="glyphicon glyphicon-pencil"></span>
                <i ng-show="!book.id" >Add</i>
                <i ng-show="book.id" >Update</i></button>
            <button class="btn btn-info" ng-click="reset()"><span class="glyphicon glyphicon-flash"></span>Reset</button>
            <button ng-show="book.id" class="btn btn-info" ng-click="delete()"><span class="glyphicon glyphicon-trash"></span>Delete</button>

            <div ng-show="msg.length" class="alert alert-info">
                """),format.raw/*15.17*/("""{"""),format.raw/*15.18*/("""{"""),format.raw/*15.19*/("""msg"""),format.raw/*15.22*/("""}"""),format.raw/*15.23*/("""}"""),format.raw/*15.24*/("""
            """),format.raw/*16.13*/("""</div>

            <form name="BookFrom">
                <div class="form-group">
                    <label for="id">id: """),format.raw/*20.41*/("""{"""),format.raw/*20.42*/("""{"""),format.raw/*20.43*/("""book.id"""),format.raw/*20.50*/("""}"""),format.raw/*20.51*/("""}"""),format.raw/*20.52*/("""</label>
                </div>
                <div class="form-group">
                    <label for="id">Title</label>
                    <input required type="text" class="form-control" ng-model="book.title" >
                    <span style="color: red" ng-show="!book.title.length">Field title is empty!</span>
                </div>
                <div class="form-group">
                    <label for="id">Author </label>
                    <input required type="text" class="form-control" ng-model="book.author" >
                    <span style="color: red" ng-show="!book.author.length">Field author is empty!</span>
                </div>
                <div class="form-group">
                    <label for="id">Pages</label>
                    <input required type="number" class="form-control" ng-model="book.pages" >
                    <span style="color: red" ng-show="!book.pages">Field pages is empty!</span>
                </div>
                <div class="form-group">
                    <label for="id">Description</label>
                    <textarea style="width: 100%" ng-model="book.description"></textarea>
                </div>
            </form>
        </div>
    </div>
</div>

<br> <br>

<div ng-show="!visible">
    <table id="table_id" class="table table-condensed table-striped table-hover">
        <thead>
            <tr>
                <th>id</th>
                <th>title</th>
                <th>Author</th>
                <th>pages</th>
                <th>Manage</th>

            </tr>
        </thead>

        <tbody>
            <tr ng-repeat="book in books" ng-click="selectBook(book,$index)" style="cursor: hand">
                <td>"""),format.raw/*63.21*/("""{"""),format.raw/*63.22*/("""{"""),format.raw/*63.23*/(""" """),format.raw/*63.24*/("""book.id """),format.raw/*63.32*/("""}"""),format.raw/*63.33*/("""}"""),format.raw/*63.34*/("""</td>
                <td>"""),format.raw/*64.21*/("""{"""),format.raw/*64.22*/("""{"""),format.raw/*64.23*/(""" """),format.raw/*64.24*/("""book.title """),format.raw/*64.35*/("""}"""),format.raw/*64.36*/("""}"""),format.raw/*64.37*/("""</td>
                <td>"""),format.raw/*65.21*/("""{"""),format.raw/*65.22*/("""{"""),format.raw/*65.23*/(""" """),format.raw/*65.24*/("""book.author """),format.raw/*65.36*/("""}"""),format.raw/*65.37*/("""}"""),format.raw/*65.38*/("""</td>
                <td>"""),format.raw/*66.21*/("""{"""),format.raw/*66.22*/("""{"""),format.raw/*66.23*/(""" """),format.raw/*66.24*/("""book.pages """),format.raw/*66.35*/("""}"""),format.raw/*66.36*/("""}"""),format.raw/*66.37*/("""</td>
              <td><button ng-click="showform()" class="btn btn-info"><span class="glyphicon glyphicon-pencil"></span> Edit</button></td>
                <td><button  class="btn btn-info" ng-click="delete(book,$index)"><span class="glyphicon glyphicon-trash"></span>Delete</button></td>
            </tr>

        </tbody>
    </table>

</div>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object template extends template_Scope0.template
              /*
                  -- GENERATED --
                  DATE: Sun Mar 12 04:28:06 CET 2017
                  SOURCE: /home/najd-dev/Documents/play-java/app/views/template.scala.html
                  HASH: 8873d20df95f5255f403cfdf4f07697445437c4a
                  MATRIX: 833->0|1775->914|1804->915|1833->916|1864->919|1893->920|1922->921|1963->934|2115->1058|2144->1059|2173->1060|2208->1067|2237->1068|2266->1069|3997->2772|4026->2773|4055->2774|4084->2775|4120->2783|4149->2784|4178->2785|4232->2811|4261->2812|4290->2813|4319->2814|4358->2825|4387->2826|4416->2827|4470->2853|4499->2854|4528->2855|4557->2856|4597->2868|4626->2869|4655->2870|4709->2896|4738->2897|4767->2898|4796->2899|4835->2910|4864->2911|4893->2912
                  LINES: 32->1|46->15|46->15|46->15|46->15|46->15|46->15|47->16|51->20|51->20|51->20|51->20|51->20|51->20|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66
                  -- GENERATED --
              */
          