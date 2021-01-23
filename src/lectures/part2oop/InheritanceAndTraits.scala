package lectures.part2oop

object InheritanceAndTraits extends App {

  class Animal {
    val aType: String = "Wild"
    private def run(): Unit = println("run")
    def eat(): Unit = println("eating")
  }

  class Cat extends Animal {
    def crunch = {
      //run compile time error for private method
      eat
      println("crunchy")
      println(aType)
    }
  }

  val cat = new Cat
  cat.crunch

  class Dog extends Animal { // can also override like class Dog(override val aType: String) and new Dog("Domestic")
    override def eat: Unit = println("Dog is eating")
    override val aType = "Domestic"
  }

  val dog = new Dog
  println(dog.aType)
  println(dog.eat)

  val newAnimal: Animal = new Cat
  newAnimal.eat()

  class Person(name: String, age: Int)
  class Employee(name: String, age: Int, employeeId: Int) extends Person(name, age)
}
