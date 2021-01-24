package lectures.part3funprog

object TuplesAndMaps extends App {

  val tuple = Tuple2(2, "Scala")
  val tup2 = (1, "Java")
  println(tuple._1)
  println(tup2._2)
  println(tuple.copy(_1 = 5))

  val map: Map[Int, String]  = Map()
  val languages = Map(tuple, tup2)
  println(languages)
  println(languages.contains(1))
  println(languages(1))

}
