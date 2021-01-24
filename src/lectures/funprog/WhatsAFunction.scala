package lectures.funprog

object WhatsAFunction extends App {

  val doubler: Int => Int = new Function1[Int, Int] {
    override def apply(x: Int): Int = x * 2
  }

  val strConcat: (String, String) => String = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  println(doubler(2))
  println(strConcat("Hello", "Scala"))

  val addr: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }
  val addr2 = addr(5)
  println(addr2(5))
  println(addr(2)(3))
}
