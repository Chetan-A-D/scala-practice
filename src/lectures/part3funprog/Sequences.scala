package lectures.part3funprog

object Sequences extends App {

  val seq = Seq(1,2,3)
  println(seq)
  println(seq.reverse)
  println(seq ++ Seq(4,5))
  println(seq.sorted)

  val list = List(1,2,3)
  val prepend = 0 +: list :+ 4
  println(prepend)
  println(list.mkString(" : "))

  val numbers = Array(1,2,3)
  val arr = Array.ofDim[Int](5)
  println(numbers)
  println(arr)
  numbers.foreach(println)
  arr.foreach(println)
  numbers(2) = 5
  numbers.foreach(println)
}
