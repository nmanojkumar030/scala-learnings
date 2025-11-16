package _02.collections.immutable.list

/**
 * List vs Arrays
 * 1. List are Immutable
 * 2. List have a recursive structure (Ex: LinkedList)
 */
object _01_ListLiterals {
  def main(args: Array[String]): Unit = {

    // List of Strings
    val fruit = List("apples", "oranges", "pears")
    // val fruit:List[String] = List("apples", "oranges", "pears")

    // List of Numbers
    val nums = List(1, 2, 3, 4, 5)
    // val nums:List[Int] = List(1, 2, 3, 4, 5)

    // Two dimensional List
    val twoDimensionalList = List(List(1, 1, 1), List(2, 2, 2))
    // val twoDimensionalList:List[List[Int]] = List(List(1, 1, 1), List(2, 2, 2))

    // Initialize empty list
    val empty = List()
    // val empty:List[Nothing] = List()
    // val empty2:List[String] = List(); // List are covariant, List[Nothing] is a subtype of List[String]

    val emptyList = List.empty[String]
    println(emptyList)

  }
}