class NumF(val x: Double, val d: Double) {
  def +(that: NumF) = new NumF(this.x + that.x, this.d + that.d)
  def *(that: NumF) = new NumF(this.x + that.x, this.d * that.x + that.d * this.x)
}

def grad(f: NumF => NumF)(x: Double) = {
  val y = f(new NumF(x, 1.0))
  y.d
}

val df = grad(x => ((2, 0).asInstanceOf[NumF]) * x + x * x * x)

//? val df = grad(x => NumF(2, 0) * x + x * x * x)

// def B(x: Double) = {
//   val df = grad(x => ((2, 0).asInstanceOf[NumF]) * x + x * x * x)
//   df(x) == (2.0 + 3 * x * x)
// }

def B(x: Double) = {df(x) == (2.0 + 3 * x * x)}

// val myList = List(1.0, 2.0, 3.0)
// val res = myList.forall(x => B(x))

// println(res)
List(1.0, 2.0, 3.0).forall(x => B(x))