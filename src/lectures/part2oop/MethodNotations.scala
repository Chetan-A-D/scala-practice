package lectures.part2oop

object  MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie: String): Boolean = favMovie == movie
    def hangsOutWith(person: Person) = s"$name hangs out with ${person.name}"
    def +(person: Person) = s"$name hangs out with ${person.name}"
    def isAlive: Boolean = true
    def apply(): String = "Hi"
  }

  //infix notations
  val chetan = new Person("Chetan", "URI")
  println(chetan.likes("URI"))
  println(chetan likes "URI")
  val sushant = new Person("Sushant", "RDB")
  println(chetan hangsOutWith sushant)

  //operators
  println(chetan + sushant) // you can name method as operator.. freedom
  println(1 + 2)

  //postfix
  println(chetan isAlive) // works with no param methods
  println(chetan.isAlive)

  //apply
  println(chetan.apply)
  println(chetan())
}
