val ScalaVersion = "2.12.1"

lazy val macros = Project(
  id = "macros",
  base = file("macros"),
  settings = Seq(
    scalaVersion := ScalaVersion,
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-reflect" % scalaVersion.value % "provided"
    )
  )
)

lazy val uses = Project(
  id = "uses",
  base = file("uses"),
    settings = Seq(
      scalaVersion := ScalaVersion
    )
) dependsOn(macros)