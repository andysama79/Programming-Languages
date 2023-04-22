//  Creating Lists
val a = List(1, 2, 3)

// Range methods
val b = (1 to 5).toList
val c = (1 to 10 by 2).toList
val e = (1 until 5).toList
val f = List.range(1, 5)
val g = List.range(1, 10, 3)

// List methods
val d = List(10, 20, 30, 40, 10)

d.drop(2)
d.dropWhile(_ < 25)
d.filter(_ < 25)
d.slice(2, 4)
d.tail
d.take(3)
d.takeWhile(_ < 30)

//  flatten
val h = List(List(1, 2), List(3, 4))
h.flatten

//  map, flatMap
val nums = List("One", "Two")
nums.map(_.toUpperCase)
nums.flatMap(_.toUpperCase)

//  foldLeft, reduceLeft
val firstTen = (1 to 10).toList

firstTen.reduceLeft(_ + _)
firstTen.foldLeft(100)(_ + _)

//  Tuples
case class Person(name: String)
val t = (11, "eleven", Person("Eleven"))
t(0)
t(1)
t(2)

val (num, str, person) = t