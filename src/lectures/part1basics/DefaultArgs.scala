package lectures.part1basics

object DefaultArgs extends App {

  def factorial(n: Int, accumulator: Int = 1): Int =
    if(n <= 1) accumulator
    else factorial(n - 1, n * accumulator)

  println(factorial(4))

  def greeting(name: String, age: Int = 10) : String = s"Hi, I am $name and I am $age years old"
  println(greeting("Anna"))
  println(greeting("Anna", 10))
  def greeting2(name: String = "Anna", age: Int) : String = s"Hi, I am $name and I am $age years old"
  //println(greeting2(10)) // compiler complains.. it thinks 10 is name
  println(greeting2(age = 10))
}
