trait AddService:
    def add(a: Int, b: Int) = a + b

trait MultiplyService:
    def multiply(a: Int, b: Int) = a * b

//  implement those traits as a concreate object
object MathService extends AddService, MultiplyService

//  use the object
import MathService.*
println(add(1, 1))
println(multiply(2, 2))