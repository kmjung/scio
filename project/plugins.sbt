addSbtPlugin("com.cavorite" % "sbt-avro-1-8" % "1.1.9")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
addSbtPlugin("com.eed3si9n" % "sbt-unidoc" % "0.4.2")
addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.6.5")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.13")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.0.1")
addSbtPlugin("com.typesafe.sbt" % "sbt-ghpages" % "0.6.3")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.8.1")
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.3.7")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "0.6.1")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.9.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.0")
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.11")
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "1.3.3")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox" % "0.6.8")
addSbtPlugin("io.github.jonas" % "sbt-paradox-material-theme" % "0.6.0")
addSbtPlugin("ch.epfl.scala" % "sbt-bloop" % "1.3.5")
addSbtPlugin("org.scalameta" % "sbt-mdoc" % "2.1.1")

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.11.1"
)
