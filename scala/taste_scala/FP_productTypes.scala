//  a product type is an ADT that only has one shape,
//  for example a singletom object
//  a case class has all the functionality of a class,
//  alongwith additional features useful for FP

//  define a case class
case class Person(name: String, vocation: String)

//  create an instance of the case class
val p = Person("Reginald Kenneth Dwight", "Singer")

//  a good default toString method
p   //  :   Person = Person(Reginald Kenneth Dwight, Singer)

//  can access its fields, which are immutable
p.name          //  "Reginale Kenneth Dwight"
p.name = "Joe"  //  error: can't reassign a val field

//  when you need to make a change, use the `copy` method
//  to "update as you copy"
val p2 = p.copy(name = "Elton John")
p2  //  :   Person = Person(Elton John, Singer)
