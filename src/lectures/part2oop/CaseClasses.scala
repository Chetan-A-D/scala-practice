package lectures.part2oop

object CaseClasses extends App {

  case class Person(name: String, age: Int)

  val p = new Person("Anna", 10)
  println(p)
  println(p.name)

  val p2 = new Person("David", 20)
  val p3 = new Person("Anna", 10)

  println(p == p2)
  println(p == p3)

  val p4 = p.copy(age=35)
  println(p4)

  val p5 = Person
  println(p5)

}
