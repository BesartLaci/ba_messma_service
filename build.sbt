name := """ba_messma"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean).disablePlugins(PlayFilters)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  guice,
  javaJdbc,
  evolutions,
  "mysql"   %  "mysql-connector-java" % "5.1.35",
  "org.webjars" % "swagger-ui" % "3.1.5",
  "javax.validation" % "validation-api" % "1.1.0.Final",
  "io.cucumber" % "cucumber-java" % "4.3.1",
  "io.cucumber" % "cucumber-junit" % "4.3.1",
  "io.cucumber" % "cucumber-core" % "4.3.1"
)


javaOptions in Test := Seq(
  "-Dconfig.file=conf/test.conf"
)
