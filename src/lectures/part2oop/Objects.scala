package lectures.part2oop

object Objects extends App {

  object Person { //singleton
    val N_EYES = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Anna")
  }

  class Person(name : String) {
    def getName = name
  }

  println(Person.N_EYES)
  println(Person.canFly)

  val chetan = Person
  val sushant = Person
  println(chetan == sushant)//true
  /*
  class Person {}
  val p1 = new Person
  val p2 = new Person
  println(p1 == p2) //false*/

  val anna = Person.apply(new Person("Winni"), new Person("David"))
  println(anna.getName)

  //def main(args: Array[String]): Unit = {} // remove extends App and runthe code
}
