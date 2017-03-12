
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/najd-dev/Documents/play-java/conf/routes
// @DATE:Sun Mar 12 04:26:52 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
