package exercises

object OOPBasics extends App {

  val author = new Writer("Chetan", "Bhagat", 1980)
  val novel = new Novel("5 PS", 2005, author)
  println(novel.authorAge())
  println(novel.isWrittenBy(author))
  println(novel.copy(2008).authorAge())
  println(author.getFullName())
}

class Writer(firstName: String, lastName: String, val birthYear: Int) {
  def getFullName(): String = firstName+" "+lastName
}

class Novel(name: String, yor: Int, author: Writer) {
  def authorAge(): Int = yor - author.birthYear
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}
