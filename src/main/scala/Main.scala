import models._
import scala.tools.scalap.scalax.rules.scalasig._

object Main extends App{
  val parser = ScalaSigParser.parse(classOf[MyRecord])
    println(parser) 
}
