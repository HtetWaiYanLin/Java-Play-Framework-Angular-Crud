name := """play-java-intro"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.8"

libraryDependencies += javaJpa

libraryDependencies += "org.mockito" % "mockito-core" % "2.1.0"

libraryDependencies += javaWs % "test"

libraryDependencies += "org.hibernate" % "hibernate-core" % "5.2.5.Final"
libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "5.2.5.Final"
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
libraryDependencies += "org.apache.directory.studio" % "org.apache.commons.io" % "2.4"

