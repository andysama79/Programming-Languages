//  match is similar to switch in java

val i = 1
// i match
//     case 1 => println("One")
//     case 2 => println("Two")
//     case _ => println("other")
//  OR
val res = i match
    case 1 => ("one")
    case 2 => ("two")
    case _ => "other"

//  getClassAsStrinng is a method that takes a single argument of any type
def getClassAsString(x: Matchable): String = x match
    case s: String => s"'$s' is s String"
    case i: Int => "Int"
    case d: Double => "Double"
    case l: List[?] => "List"
    case _ => "Unknown"

//  examples
getClassAsString(1) //Int
getClassAsString("hello")   //  'hello' is a string
getClassAsString(List(1, 2, 3)) //  list