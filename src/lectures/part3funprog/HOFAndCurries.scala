package lectures.part3funprog

object HOFAndCurries extends App {

  //write a function which applies another function n times over a value

  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if(n <= 0) x
    else nTimes(f, n-1, f(x))

  def incrementer = (x: Int) => x + 1
  println(nTimes(incrementer, 5, 1))

  //curried functions
  def superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  println(superAdder(3)(5))

}
