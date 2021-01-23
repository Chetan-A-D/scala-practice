package lectures.part2oop

object  MethodNotations extends App {

  class Person(val name: String, favMovie: String) {
    def likes(movie: String): Boolean = favMovie == movie
    def hangsOutWith(person: Person) = s"$name hangs out with ${person.name}"
    def +(person: Person) = s"$name hangs out with ${person.name}"
    def +() = s"$name the rockstar"
    def +(newName: String) = new Person(s"$name, $newName", favMovie)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, I am $name"
    def apply(n: Int): String = s"$name likes $favMovie and watched it $n times"
    def learns(lang: String) = s"$name is learning $lang"
    def learnsScala = this learns "Scala"
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

  println(new Person("Mary", "Agent 7").+())
  println((chetan + "the rockstar").apply)
  println(chetan learnsScala)
  println(chetan(4))
}
