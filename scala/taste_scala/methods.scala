//* def methodName(param1: Type1, param2: Type2): ReturnType =
//*    //  the method body
//*    //  goes here

def sum(a: Int, b: Int): Int = a + b
def concatenate(s1: String, s2: String): String = s1 + s2

//  you may skip the ReturnType
def sum(a: Int, b: Int) = a + b
def concatenate(s1: String, s2: String) = s1 + s2

//  calling methods
val x = sum(1, 2)
val y = concatenate("foo", "bar")

//  multiline method
def getStackTraceAsString(t: Throwable): String = 
  val sw = new StringWriter
  t.printStackTrace(new PrintWriter(sw))
  sw.toString

//  method parameters can also have default values
def makeConnection(url: String, timeout: Int = 5000): Unit =
  println(s"url=$url, timeout=$timeout")

//  calling the above method
makeConnection("https://localhost")
makeConnection("https://localhost", 2500)

//  also supports named parameters
makeConnection(url="https://localhost", timeout=2500)

//  the `extension` keyword declares that you're about
//  to define one or more extension methods on the parameter
//  that's put in parentheses

extension (s: String)
    def makeInt(radix: Int): Int = Integer.parseInt(s, radix)

"1".makeInt(2)      //  Int = 1
"10".makeInt(2)     //  Int = 2
"100".makeInt(2)    //  Int = 4