package week4

import week4._

object nth {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  //
  def nth[T](n: Int, xs: List[T]): T = {
    if (xs.isEmpty) throw new IndexOutOfBoundsException
    if (n == 0) xs.head
    else nth(n - 1, xs.tail)
  }                                               //> nth: [T](n: Int, xs: week4.List[T])T

  val list = new Cons(1, new Cons(2, new Cons(3, new Cons(4, new Nil))))
                                                  //> list  : week4.Cons[Int] = week4.Cons@6b71769e
  nth(2, list)                                    //> res0: Int = 3
  nth(4, list)                                    //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week4.nth$.nth$1(week4.nth.scala:10)
                                                  //| 	at week4.nth$.$anonfun$main$1(week4.nth.scala:17)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at week4.nth$.main(week4.nth.scala:5)
                                                  //| 	at week4.nth.main(week4.nth.scala)
  nth(-1, list)
}