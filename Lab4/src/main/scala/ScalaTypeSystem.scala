import scala.collection.mutable.ListBuffer
object ScalaTypeSystem extends {
  def main(args: Array[String]): Unit = {

    val myList = new ListOfInt(ListBuffer(3, 6, 9))

    println("*** count ***")
    println(myList.count)

    println("\n*** contains(e) ***")
    println(myList.contains(3))

    println("\n*** sum ***")
    println(myList.sum)

    println("\n*** add(e) ***")
    myList.add(0)
    println(myList.someList)

  }

  class ListOfInt (val someList: ListBuffer[Int]) {
    def count: Int = someList.length

    def contains (e: Int): Boolean = someList.contains(e)

    def sum: Int = someList.sum

    def add(e: Int): someList.type = someList.addOne(e)

  }

}
