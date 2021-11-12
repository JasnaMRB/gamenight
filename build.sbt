
/**
 * Projects
 */

lazy val gamenight =
  project
    .in(file("."))
    .settings(projectSettings)

/**
 * Libraries
  */
lazy val library =
  new {
    object Version {
      val cats = "2.6.1"
    }
    val catsCore             = "org.typelevel"               %% "cats-core"                % Version.cats
}

lazy val projectSettings = commonSettings

lazy val commonSettings =
  Seq(
    name := "gamenight",
    version := "0.1",
    scalaVersion := "2.13.7",
    idePackagePrefix := Some("me.jasna.gamenight"),
    scalacOptions ++= Seq(
      "-deprecation",
      "-explaintypes",
      "-feature",
      "-language:_",
      "-unchecked",
      "-Xcheckinit",
      //"-Xfatal-warnings",  // Disable if using twirl and unused:imports!
      "-Xlint:adapted-args",
      "-Xlint:constant",
      "-Xlint:delayedinit-select",
      "-Xlint:doc-detached",
      "-Xlint:inaccessible",
      "-Xlint:infer-any",
      "-Xlint:missing-interpolator",
      "-Xlint:nullary-unit",
      "-Xlint:option-implicit",
      "-Xlint:package-object-classes",
      "-Xlint:poly-implicit-overload",
      "-Xlint:private-shadow",
      "-Xlint:stars-align",
      "-Xlint:type-parameter-shadow",
      // "-Ywarn-dead-code", // for now
      "-Ywarn-extra-implicit",
      "-Ywarn-numeric-widen",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports", // May produce false positives with twirl templates.
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates",
      "-Ywarn-value-discard",
      "-Ycache-plugin-class-loader:last-modified",
      "-Ycache-macro-class-loader:last-modified",
    ),
    Compile / console / scalacOptions --= Seq(
      "-Xfatal-warnings",
      "-Ywarn-unused-import",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates"
    ),
    Test / console / scalacOptions --= Seq(
      "-Xfatal-warnings",
      "-Ywarn-unused-import",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates"
    )
  )
