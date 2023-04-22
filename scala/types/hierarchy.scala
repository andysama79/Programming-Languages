//  supertype/toptype: Any
//  subtype: matchable
//  subtype: AnyVal | AnyRef/Object
//  subtype: Unit, Boolean, Int... | String, Lists, reference types...
//  subtype/bottomtype: Nothing, Null

//  void -> Unit
import scala.math.BigInt
import scala.math.BigDecimal

def printIt(a: Any): Unit = println(a)

val list: List[Any] = List(
    "a String",
    732,
    'c',
    true,
    () => "an anonymous function returning a string"
)

list.foreach(element => println(element))

//  for large numbers use BigInt, BigDecimal; gives precision
val a = BigInt(1_234_567_890)
val b = BigDecimal(123_456.789)

//  strings support: interpolation, multiline strings
val quote = """The essence of Scala:
            |Fusion of functional and object-oriented
            |programming in a typed setting.""".stripMargin

//  type casting: byte->short, char->Int->Long->Float->Double