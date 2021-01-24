package exercises

object FrescoExercise extends App {

  def flatMapUsage(var1: Int) = {
    val numberList = List.range(1, var1+1)
    val listGenerator = numberList.map(n => List.range(1, n+1))
    val resultList = listGenerator.flatMap(l => l)
    println(resultList)
    println(resultList.size)
  }

  flatMapUsage(3)

  trait ArithmeticOpertaions{
    var x: Int
    var y: Int
    def add = x + y
    def subtract = x - y
    def multiply = x * y
    def divide = x / y
  }

  class Variables(a: Int, b: Int) extends ArithmeticOpertaions {
    override var x: Int = a
    override var y: Int = b

  }
  val variable = new Variables(2, 5)
  println(variable.add)
  println(variable.subtract)
  println(variable.multiply)
  println(variable.divide)

  def ListHigherOrder(input: Int) {
    val intList = List.range(1, input+1)
    myHigherOrderFunction(factorial, intList)
  }

  def factorial(n: Int): BigInt = {
    def factHelper(x:Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  def myHigherOrderFunction(f: Int => BigInt, l: List[Int]) = {
    l.foreach(n => println(f.apply(n)))
  }
  ListHigherOrder(3)

  def mapHigherOrder(args: Array[Int]) {
    val intList: List[Int] =
  }


}
