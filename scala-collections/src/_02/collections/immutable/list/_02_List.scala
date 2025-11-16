package _02.collections.immutable.list

/**
 * https://www.scala-lang.org/api/current/#scala.collection.immutable.List
 */
object _01_List {
  def main(args: Array[String]): Unit = {

    // List of Strings
    val months = List("Feb", "Mar", "Apr", "May")

    // Accessing elements at a specific index
    println(s"Elements at index 0 ${months(0)}")
    println(s"Elements at index 1 ${months(1)}")
    println(s"Elements at index 2 ${months(2)}")
    println(s"Elements at index 3 ${months(3)}")

    //Prepend elements to the beginning of the list
    val months2 = months.+:("Jan")
    println(months2)

    // Append elements at the end of the list
    val months3 = months2.:+("Jun")
    println(months3)

    // Head of the list
    val head = months3.head
    println(head)

    // Last element of the list
    val last = months3.last
    println(last)

    // Rest of the list except the first element
    val tail = months3.tail
    println(tail)

    // Init - All elements except the last one
    val init = months3.init
    println(init)

    // Throws NoSuchElementException
    List().head
    List().last

    // UnsupportedOpertaionException
    List().tail
    List().init

  }
}