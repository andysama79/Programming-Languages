//  Companion objects: can access private members of its companion
import scala.math.*

class Circle(radius: Double):
  import Circle.*
  def area: Double = calculateArea(radius)

object Circle:
  private def calculateArea(radius: Double): Double = 
    Pi * pow(radius, 2.0)

val circle1 = Circle(5.0)
circle1.area