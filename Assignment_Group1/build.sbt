name := "Assignment_Group1"
version := "1.0"
scalaVersion := "2.12.12"

// https://mvnrepository.com/artifact/org.scalatest/scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test


lazy val Q1_Q2 = project.in(file("Q1_Q2"))
  .settings(
    libraryDependencies ++= Seq( "org.scalatest" %% "scalatest" % "3.2.3" % Test
    ))


lazy val Q3 = project.in(file("Q3"))
  .settings(
      libraryDependencies ++= Seq( "org.scalatest" %% "scalatest" % "3.2.3" % Test
      ))