package lectures.part2oop

object AbstractDataTypes extends App {

  abstract class Shape {
    def draw: Unit
  }

  class Circle extends Shape {
    override def draw: Unit = println("Drawing Circle")
  }
}
