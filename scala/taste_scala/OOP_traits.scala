//  simple interfaces, but they can also contain abstract
//  and concrete methods and fields, and they have parameters
//  just like classes
trait Speaker:
  def speak(): String   //  has no body, so it's abstract

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

trait Runner:
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "meow!"
  override def startRunning(): Unit = println("yeah ... I don't run")
  override def stopRunning(): Unit = println("No need to stop")

val d = Dog("Rover")
println(d.speak())

val c = Cat("Morris")
println(c.speak())
c.startRunning()
c.stopRunning()