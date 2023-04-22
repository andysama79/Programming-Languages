//  sum types are one way to model algebraic data types (ADTs) in Scala
enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import CrustSize.*
val currentCrustSize = Small

//  enums in a `match` expression
currentCrustSize match
  case Small => println("Small crust size")
  case Medium => println("Medium crust size")
  case Large => println("Large crust size")

//  enums in an `if` statement
if currentCrustSize == Small then println("Small crust size")

//  another example
enum Nat:
  case Zero
  case Succ(pred: Nat)