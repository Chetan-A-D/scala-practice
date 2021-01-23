package lectures.part1basics

object StringOps extends App {

  val s: String = "Hi, I am learning Scala"
  println(s.take(5))

  val numStr = "2"
  val num = numStr.toInt
  println('a' +: numStr :+ 'z')

  //Interpolators
  val age: Int = 10
  val name: String = "Anna"
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old"
  println(anotherGreeting)

  //f-interpolator
  val height = 2.4f
  println(f"My name is $name and my height is $height%2.2f")

  //raw
  val anyStr = raw"Hi this is \n scala tutorial"
  println(anyStr)
}
