import sbt._
object Dependencies {

  lazy val slickVersion="3.3.3"

  lazy val mySqlVersion="8.0.26"

  lazy val mySqlConnector="mysql" % "mysql-connector-java" % mySqlVersion

  lazy val slick="com.typesafe.slick" %% "slick" % slickVersion

    lazy val slickHickariCp="com.typesafe.slick" %% "slick-hikaricp" % slickVersion
lazy val SLF4J="org.slf4j" % "slf4j-api" % "2.0.0-alpha4"

  def compileDependencies:Seq[ModuleID]=Seq(slick,slickHickariCp,mySqlConnector)
  def testDependencies:Seq[ModuleID]=Seq.empty
}
