package exercises

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(e: Int): MyList
  def printElements: String

  override def toString: String = "[" +printElements+ "]"
}

object Empty extends MyList {
  override def head: Int = throw new NoSuchElementException
  override def tail: MyList = throw new NoSuchElementException
  override def isEmpty: Boolean =true
  override def add(e: Int): MyList = new concList(e, Empty)
  override def printElements: String = ""
}

class concList(h: Int, t: MyList) extends MyList {
  override def head: Int = h
  override def tail: MyList = t
  override def isEmpty: Boolean = false
  override def add(e: Int): MyList = new concList(e, this)
  override def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements
}

object test extends App {
  val list = new concList(1, new concList(2, Empty))
  println(list.head)
  println(list.tail)
  println(list.isEmpty)
  println(list.toString)
}
