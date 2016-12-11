import sbt._

object Dependencies {
  val resolutions = Seq(
    "Twitter" at "http://maven.twttr.com/",
    "Typesafe releases" at "http://repo.typesafe.com/typesafe/releases/",
    "One" at "https://repo1.maven.org/maven2/",
    "Mvn" at "https://mvnrepository.com/"
  )

  lazy val versions = new {
    val config = "1.3.1"
    val finatra = "2.5.0"
    val swagger = "0.6.0"
    val jwt = "0.4.1"

    val idl = "0.1.0-SNAPSHOT"

    val specs2 = "3.8.6"
    val logback = "1.1.7"
  }

  val baseDependencies = Seq(
    "com.typesafe" % "config" % versions.config,
    "ch.qos.logback" % "logback-classic" % versions.logback
  )

  val testDependencies = Seq(
    "org.specs2" %% "specs2-core" % versions.specs2 % "test",
    "org.specs2" %% "specs2-junit" % versions.specs2 % "test",
    "org.specs2" %% "specs2-mock" % versions.specs2 % "test",
    "org.specs2" %% "specs2-matcher-extra" % versions.specs2 % "test",
    "org.specs2" %% "specs2-scalacheck" % versions.specs2 % "test"
  )
  val finatraDependencies = Seq(
    "com.twitter" %% "finatra-thrift" % versions.finatra,
    "com.twitter" %% "inject-thrift-client-http-mapper" % versions.finatra,
    "com.twitter" %% "inject-slf4j" % versions.finatra
  )

  val thriftClientDependency = Seq(
    "be.sdtechnologies" %% "thrift-idl" % versions.idl
  )

}