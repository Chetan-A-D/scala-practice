package lectures.part2oop

object AnonymousClasses extends App {

  abstract class Shape { // or trait
    def draw: Unit
  }

  val circle: Shape = new Shape {
    override def draw: Unit = println("drawing circle")
  }
  circle.draw

  class Person(name: String) {
    def greet: Unit = println(s"Hi, I am $name")
  }

  val person = new Person("Chetan") {
    override def greet: Unit = println(s"Hi this is Chetan")
  }
  person.greet
}
