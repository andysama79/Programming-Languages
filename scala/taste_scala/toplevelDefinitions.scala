import scala.collection.mutable.ArrayBuffer

enum Topping:
  case Cheese, Pepperoni, Mushrooms

import Topping.*
class Pizza:
  val toppings = ArrayBuffer[Topping]()

val p = Pizza()

extension (s: String)
  def captalizeAllWords = s.split(" ").map(_.capitalize).mkString(" ")

val hwUpper = "hello, world".captalizeAllWords

type Money = BigDecimal

@main def myApp =
  p.toppings += Cheese
  println("show me the code".captalizeAllWords)

package foo {
    def double(i: Int) = i * 2
}

//  when you place a definition in a package named foo,
//  you can then access that definition under all other
//  packages under foo

package foo {
    package bar {
        @main def fooBarMain = 
            println(s"$double(1)")  //this works
    }
}