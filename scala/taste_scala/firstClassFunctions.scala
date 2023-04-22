//  Lambdas(anonymous functions)
//  Higher-order functions (HOFs)
//  Immutable collections in the standard library
val a = List(1, 2, 3).map(i => i * 2)   // HOF
val b = List(1, 2, 3).map(_ * 2)

def double(i: Int): Int = i * 2

// a = List(1, 2, 3).map(i => double(i))
// b = List(1, 2, 3).map(double)

//  Immutable collections: these functions don't mutate the collection
//  instead, they return a new collection with the update data
val nums = (1 to 10).toList

val x = nums.filter(_ > 3).filter(_ < 7).map(_ * 10)