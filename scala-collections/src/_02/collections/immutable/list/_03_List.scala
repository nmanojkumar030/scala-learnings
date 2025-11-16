package _02.collections.immutable.list

object _02_List {
  def main(args: Array[String]): Unit = {

    // Concatenating two lists
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)

    val list3 = list1 ::: list2
    println(list3)

    val list4 = List() ::: List(1, 2, 3)
    println(list4)

    val list5 = List(1, 2, 3) ::: List(4, 5) ::: List(6, 7, 8)
    println(list5)

    // Using :: returns a new List(List(...), elements from the second list)
    val list6 = List(1, 2, 3) :: List(4, 5, 6)
    println(list6)

    val list7 = List.concat(List(1, 2, 3), List(4, 5, 6));
    println(list7)

    // Length of a list
    val list8 = List(1, 2, 3, 4, 5, 6)
    println(list8.length)

    // Reverse a list
    val list9 = List(1, 2, 3, 4, 5)
    println(list9.reverse)

    // Properties
    println(list9.reverse.reverse equals list9)
    println(list9.reverse.tail equals list9.init.reverse)
    println(list9.reverse.head equals list9.last)
    println(list9.reverse.last equals list9.head)

  }
}