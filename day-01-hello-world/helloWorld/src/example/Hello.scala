import zio._
import zio.Console._

object HelloWorld extends App :
  def run(args: List[String]) = putStrLn("Hello World").exitCode
