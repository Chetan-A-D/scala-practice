package lectures.part3funprog

object AnonymousFunctions extends App {

  val doubler: Int => Int = (a: Int) => a * 2

  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  val noParam: () => Unit = () => println("no param lambda")

  println(doubler(2));println(adder(2, 2));noParam()
  //syntactic sugar
  val incrementer: Int => Int = _ + 1 // same as (a: Int) => a + 1
  val newAddr: (Int, Int) => Int = _ + _ // same as (a: Int, b: Int) => a + b

  println(incrementer) // gives instance
  println(incrementer(2))
  println(newAddr(3, 4))

  val list = List(1,2,3)
  val fun = (x: Int) => List(List(x))
  println(list.flatMap((x: Int) => List(x, x+1)))
  println(list.flatMap(fun))


}
