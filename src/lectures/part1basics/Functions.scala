package lectures.part1basics

object Functions extends App {

    def greetings(name: String, age: Int): String = "Hi, my name is "+ name +" and I am "+ age +" years old."
    println(greetings("Ana", 10))

    def factorial(n: Int): Int = {
      if(n <= 0) 1
      else n * factorial(n - 1)
    }
    println(factorial(0))

    def fibonacci(n: Int): Int = {
      if(n <= 2) 1
      else fibonacci(n - 1) + fibonacci(n - 2)
    }
    // 1 1 2 3 5 8
    println(fibonacci(6))

    def concatStr(a: String, b: String): String = a + " " + b
    println(concatStr("Hello,", "Scala"))

    def noParam(): Int = 5
    println(noParam())

    def returnTypeInfer(s: String) = "Hi, "+ s
    println(returnTypeInfer("Scala"))
}
