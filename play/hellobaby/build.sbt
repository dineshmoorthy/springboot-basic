name := """hellobaby"""
organization := "act"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

sbtPlugin := true

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += guice
libraryDependencies ++= Seq(
  ws,
  guice,
  cacheApi,
  ehcache,
  "org.mockito" % "mockito-all" % "1.10.19" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.3" % Test,
  "com.typesafe.slick" %% "slick" % "2.0.0",
  "com.typesafe.play" %% "play-slick" % "0.6.0.1",
  "mysql" % "mysql-connector-java" % "5.1.34",
  "com.chuusai" %% "shapeless" % "2.3.3",
  "ai.x" %% "play-json-extensions" % "0.40.2",
  "com.rabbitmq" % "amqp-client" % "4.1.1",
  "com.amazonaws" % "aws-java-sdk-core" % "1.11.712",
  "com.amazonaws" % "aws-java-sdk-sns" % "1.11.712",
  "com.amazonaws" % "aws-java-sdk-sts" % "1.11.712",
  "org.apache.commons" % "aws-java-sdk-sts" % "1.11.712"
)


resolvers += "Maven Central Server" at "https://repo1.maven.org/maven2"
resolvers ++= Seq(
  ("scalaz-bintray" at "http://dl.bintray.com/scalaz/releases").withAllowInsecureProtocol(true),
  ("Typesafe Releases" at "https://github.com/playframework/play-slick").withAllowInsecureProtocol(true)

)

lazy val commonSettings = Seq(
  scalaVersion := "2.12.10",
  organization := "edu.trinity"
)

// loads the server project at sbt startup
onLoad in Global := (onLoad in Global).value andThen {s: State => "project server" :: s}