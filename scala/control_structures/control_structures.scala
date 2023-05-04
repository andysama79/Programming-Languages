val x = 1
if x == 1 then println(x)

//  for multiple lines
if x == 1 then
    println("x is 1, as you can see:")
    println(x)

//  if else
if x == 1 then
  println("x is 1, as you can see:")
  println(x)
else
  println("x was not 1")

//  if else-if else
if x < 0 then
  println("negative")
else if x == 0 then
  println("zero")
else
  println("positive")

//  end-if statement (only in scala 3)
if x == 1 then
  println("x is 1, as you can see:")
  println(x)
end if

//  if else expressions always return a result
val a: Int = 1
val b: Int = 2
val minValue = if a < b then a else b   //  EOP: Expression oriented programming

def compare(a: Int, b: Int): Int = 
  if a < b then
    -1
  else if a == b then
    0
  else
    1

//  for loops
val ints = Seq(1, 2, 3)
for i <- ints do println(i) //  i <- ints is referred to as a generator

//  for multiline blocks
for i <- ints
do
  val x = i * 2
  println(s"i = $i, x = $x")

//  multiline generators: embedded for loops
for
  i <- 1 to 2
  j <- 'a' to 'b'
  k <- 1 to 10 by 5
do
  println(s"i = $i, j = $j, k = $k")

//  Guards: basically if statements
for
  i <- 1 to 5
  if i % 2 == 0
do
  println(i)

//  multiple guards
for
  i <- 1 to 10
  if i > 3
  if i < 5
  if i % 2 == 0
do
  println(i)

//  using 'for' with maps
val states = Map(
  "AK" -> "Alaska",
  "AL" -> "Alabama",
  "AR" -> "Arizona"
)

for (abbrev, fullName) <- states do println(s"$abbrev: $fullName")

//  'for' expressions
val list = for i <- 10 to 12 yield i * 2
val list1 = (10 to 12).map(i => i * 2)

//
def between3and10(xs: List[Int]): List[Int] =
  for
    x <- xs
    if x >= 3
    if x <= 10
  yield x

between3and10(List(1, 3, 7, 11))  //  : List[Int] = List(3, 7)

//  while loops
var i = 0

while i < 3 do
   println(i)
   i += 1

//  match expressions
i = 3
val day = i match
  case 0 => "Sunday"
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case _ => "invalid day" //  the default, catch-all

//  handling multiple possible mathces on one line
val evenOrOdd = i match
  case 1 | 3 | 5 | 7 => println("odd")
  case 2 | 4 | 6 | 8 => println("even")
  case _ => println("some other number")

//  using if guards in case clauses
i match
  case 1 => println("one, a lonely number")
  case x if x == 2 || x == 3 => println("two's conpany, three's a crowd")
  case x if x > 3 => println("4+, that's a party")
  case _ => println("i'm guessing your number is zero or less")
  