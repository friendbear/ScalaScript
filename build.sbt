// It uses to import dependencies to IntelliJ.
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.12.8"
    )),
    libraryDependencies ++= Seq(
      "com.lihaoyi" % "ammonite" % "1.6.0" cross CrossVersion.full
      // Please add dependencies to use in Scala Scripts.
      // "com.sample" %% "scala-library" % "0.1.0"
    )
  )


