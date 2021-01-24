package lectures.funprog

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

  val numbers = List(1,2,3)
  val chars = List('a','b','c')
  val combinations = numbers.flatMap(n => chars.map(c => ""+ c + n))
  println(combinations)
  println(numbers.filter(_ % 2 == 0))

  val colors = List("Black", "White")
  val aComb = numbers.flatMap(n => chars.flatMap(c => colors.map(col => ""+ c + n + col)))
  //above syntax is hard to read so below can be used
  //for-comprehensions
  val moreComb = for {
    n <- numbers
    c <- chars
    col <- colors
  } yield "" + c + n + col
  println(moreComb)

  val oddNums = for(n <- numbers if n % 2 != 0) yield n
  println(oddNums)
}
