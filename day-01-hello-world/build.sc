import mill._, scalalib._

object helloWorld extends ScalaModule {
  def scalaVersion = "3.1.0"
  def ivyDeps = Agg(ivy"dev.zio::zio:2.0.0-M2")

  object test extends Tests {
    def ivyDeps = Agg(ivy"org.scalameta::munit:0.7.29")
    def testFrameworks = Seq("munit.Framework")
  }
}