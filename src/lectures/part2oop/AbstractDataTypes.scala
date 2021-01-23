package lectures.part2oop

object AbstractDataTypes extends App {

  abstract class Shape {
    val area: Double
    def draw: Unit
  }

  class Circle extends Shape {
    override def draw: Unit = println("Drawing Circle")
    override val area: Double = 20.3
  }

  trait Rectangle {
    def draw(shape: Shape): Unit
  }

  trait oneMoreTrait
  class Square extends Shape with Rectangle with oneMoreTrait {
    override val area: Double = 30
    override def draw: Unit = println("draw from shape")
    override def draw(shape: Shape): Unit = println(s"call from square draw : ${shape.area}")
  }

  val sq = new Square
  val ci = new Circle
  sq.draw
  sq.draw(ci)
}
