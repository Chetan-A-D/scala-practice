package lectures.part1basics

object Expressions extends App {

  val a = 4 + 5
  println(a)
  println(10 + 20 * 2)
  println(!(a == 9))

  var t = 10
  t += 2
  println(t += 2) // println(t += 2) => () why?

  val conditionedVal = if(a==9) 9 else 8
  println(conditionedVal)

  //Code Block
  val codeBlk = {
    val x = 10 //not available outside of this block
    val y = 20
    if(x < y) "Yes" else "No"
  }
  println(codeBlk)

  //Type is Unit which is same as void
  val aWeirdVal = (t = 10) // what's the use? expressions returning unit are side effects
  println(aWeirdVal)

}
