package exercises

import scala.jdk.Accumulator

object Recursion  extends App {

  def factorialTailRec(n: Int): BigInt = {
    def factHelper(x:Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }
  //println(factorialTailRec(50000))

  def factHelper(x:Int, accumulator: BigInt): BigInt =
    if(x <= 1) accumulator
    else factHelper(x - 1, x * accumulator)

  //println(factHelper(50000, 1))

  def concatTailRec(name: String, i: Int, accumulator: String): String =
    if(i <= 0) accumulator
    else concatTailRec(name, i - 1, name + accumulator)

  println(concatTailRec("Scala", 5, ""))

  def fibonacci(n: Int): Int = {
    def fibonacciTailRec(i: Int, last: Int, nextToLast: Int): Int =
      if(i >= n) last
      else fibonacciTailRec(i + 1, last + nextToLast, last)

    if(n <= 2) 1
    else fibonacciTailRec(2, 1, 1)
  }
  println(fibonacci(7))
}
