package _02.collections.immutable.list

object _05_List {
  def main(args: Array[String]): Unit = {

    // Map
    val list = List(1, 2, 3, 4, 5)
    println(list.map(_ + 1))

    val words = List("the", "quick", "brown", "fox")
    println(words map (_.length))

    println(words map (_.reverse))

    //FlatMap - Takes a function returning a list, It applies the function
    // to each element and returns the concatenation of all function results
    println(words map (_.toList))

    println(words flatMap (_.toList))

    //Foreach
    var sum = 0
    List(1, 2, 3, 4, 5) foreach (sum += _)
    println(sum)

    // Filter
    println(List(1, 2, 3, 4, 5, 6) filter (_ % 2 == 0))

    println(words filter (_.length == 3))

    // Partition
    println(List(1, 2, 3, 4, 5, 6) partition (_ % 2 == 0))

  }
}