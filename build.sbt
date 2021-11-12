
/**
 * Projects
 */

lazy val gamenight =
  project
    .in(file("."))
    .settings(projectSettings)
    .settings(
      libraryDependencies ++= Seq(
        library.catsCore,
        library.refinedCats,
        library.refinedCore,
        library.refinedPureConfig,
        library.refinedScalaCheck,
        library.scalaCheck,
        library.scalaTest,
        library.scalaTestPlus
      )
    )

/**
 * Libraries
  */
lazy val library =
  new {
    object Version {
      val cats          = "2.6.1"
      val refined       = "0.9.27"
      val scalaCheck    = "1.15.4"
      val scalaTest     = "3.2.10"
      val scalaTestPlus = "3.2.10.0"
    }
    val catsCore             = "org.typelevel"               %% "cats-core"                % Version.cats
    val scalaCheck           = "org.scalacheck"              %% "scalacheck"               % Version.scalaCheck
    val scalaTest            = "org.scalatest"               %% "scalatest"                % Version.scalaTest
    val scalaTestPlus        = "org.scalatestplus"           %% "scalacheck-1-15"          % Version.scalaTestPlus
    val refinedCore          = "eu.timepit"                  %% "refined"                  % Version.refined
    val refinedCats          = "eu.timepit"                  %% "refined-cats"             % Version.refined
    val refinedPureConfig    = "eu.timepit"                  %% "refined-pureconfig"       % Version.refined
    val refinedScalaCheck    = "eu.timepit"                  %% "refined-scalacheck"       % Version.refined
  }

lazy val projectSettings = commonSettings

lazy val commonSettings =
  Seq(
    name := "gamenight",
    version := "0.1",
    scalaVersion := "2.13.7",
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
