//  in OOP fields are typically mutable, hence var
class Person(var firstName: String, var lastName: String):
  def printFullName() = println(s"$firstName $lastName")

val p = Person("John", "Stephens")  //  creates a constructor
println(p.firstName)
p.lastName = "Legend"
p.printFullName()