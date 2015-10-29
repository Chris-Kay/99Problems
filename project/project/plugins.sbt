resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

addSbtPlugin("org.scalatra.sbt" % "scalatra-sbt" % "0.4.0")

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.6.0")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.0")
