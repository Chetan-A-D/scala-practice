package lectures.part2oop

object OOPBasics extends App {

  val person = new Person("Anna", 10)
  //println(person.name)// not accessible since name is class param and not field
  println(person.age);println(person.x)
  person.greet("James")
  val anotherPerson = new Person()
  anotherPerson.greet()
}

class Person(name: String, val age: Int) {

  val x = 30;
  def greet(name: String): Unit = println(s"$name says hello to ${this.name}")
  def greet(): Unit = println(s"Hi, this is $name and I am $age years old")

  def this(name: String) = this(name, 10)
  def this() = this("defName")
}
