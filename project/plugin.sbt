resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  Resolver.sonatypeRepo("snapshots")
)
addSbtPlugin("com.earldouglas" % "xsbt-web-plugin" % "1.0.0")
addSbtPlugin("com.github.aselab" % "scala-activerecord-scalatra-sbt" % "0.3.1")
