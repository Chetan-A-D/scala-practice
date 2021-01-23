package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 12
  println(x)
  //x = 1 compiler complains - reassignment val

  //Type inference
  val y = 30
  println(y)

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aString: String = "Scala"
  val aFloat: Float = 10.3f
  val aDouble: Double = 23.3
  val aShort: Short = 1
  val aLong: Long = 1893475938

  println(aBoolean);println(aChar);println(aString);println(aFloat);println(aDouble)

  //variables
  var aVar = 10
  aVar = x
  println(aVar) // vars are mutable
}
