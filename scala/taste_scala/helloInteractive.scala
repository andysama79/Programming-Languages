import scala.io.StdIn.readLine

@main def helloInteractive(): Unit =
    println("Please enter your name:")
    val name = readLine()

    println("Hello, " + name + "!")