name := """b"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala, SbtWeb)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "net.francesbagual" %% "a" % "1.0-SNAPSHOT",
  "net.francesbagual" %% "a" % "1.0-SNAPSHOT"  artifacts(Artifact("a", "asset", "jar", "assets"))
)

pipelineStages := Seq(digest, gzip)

