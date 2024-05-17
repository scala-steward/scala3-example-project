lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-example-project",
    description := "Example sbt project that compiles using Scala 3",
    version := "0.1.0",
    scalaVersion := "3.4.2",
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
