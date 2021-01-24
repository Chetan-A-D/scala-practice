package lectures.part3funprog

object MapFlatMapFilter extends App {

  val list = List(1, 2, 3)
  println(list)
  println(list.head)

  println(list.map(n => n + 1))
  println(list.map(_ + 1))
  println(list.filter(_ % 2 == 0))

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
