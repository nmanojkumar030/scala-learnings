package _02.collections.immutable.list

object _04_List {
  def main(args: Array[String]): Unit = {
    // take - returns first n elements of the list
    val list = List(1, 2, 3, 4, 5, 6)

    println(list take (3))
    println(list take (6)) // In take(n) n > length of the list entire list is returned

    // drop - Returns all the elements except the first n elements
    println(list drop 2)
    println(list drop 6) // In drop(n) n > length of the list empty list is returned

    println(list splitAt (3))

    // Flatten - Flattens a list of list into a single list
    val list2 = List(List(1, 2), List(3, 4), List(5, 6))
    println(list2.flatten)

    // zip - Takes two list and forms a pair of list
    val list3 = List(1, 2, 3) zip List("one", "two", "three")
    println(list3)

    val list4 = List(1, 2, 3, 4, 5) zip List("one", "two", "three")
    println(list4)

    // unzip
    println(list4.unzip)

    // Converting lists
    println(List(1, 2, 3, 4, 5).toArray)
  }
}