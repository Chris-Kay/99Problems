import org.scalatra.sbt._
import sbt.Keys._
import sbt._
import com.earldouglas.xwp.XwpPlugin._
import sbtassembly.AssemblyKeys._
import sbtassembly.{MergeStrategy, PathList}

object Build extends sbt.Build {
  val Name = "Problems"
  val Version = "0.0.1"
  val ScalaVersion = "2.11.6"
  val ScalatraVersion = "2.3.1"
  val JettyPort = 9090

  lazy val project = Project (
    id = Name,
    base = file("."),
    settings = Seq(
      name := Name,
      version := Version,
      scalaVersion := ScalaVersion,
      resolvers ++= allResolvers,
      libraryDependencies ++= (dependencies ++ testDependencies)
    )
  )

  lazy val allResolvers = Seq(
    Classpaths.typesafeReleases,
    "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"
  )

  lazy val dependencies = Seq(
    "org.scalatra" %% "scalatra" % ScalatraVersion
  )

  lazy val testDependencies = Seq(
    "org.scalatra"              %% "scalatra-specs2"  % ScalatraVersion   % "test"
  )

  val acceptanceTestPause = taskKey[Unit]("Wait in order to give the application time to start before running the acceptance tests")
}
