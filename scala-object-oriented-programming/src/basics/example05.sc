package com.npntraining.basics

object example05 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val student = new Student07("A", "B", List("Cricket"))
                                                  //> student  : com.npntraining.basics.Student07 = A B List(Cricket)

  println(student)                                //> A B List(Cricket)

  student.addMoreHobbies("Swimming")

  println(student)                                //> A B List(Swimming, Cricket)

}

/**
 * Data Encapsulation
 * 1. firstName and lastName are val
 * 2. Hobbies - var
 * As both are private its not accessible from outside.
 */
class Student07(fn: String, ln: String, hob: List[String]) {

  private val firstName: String = fn
  private val lastName: String = ln
  private var hobbies: List[String] = hob

  def getFirstName: String = firstName
  def getLastName: String = lastName
  def getHobbies: List[String] = hobbies

  def addMoreHobbies(hobby: String): Unit = hobbies = hobby :: hobbies

  override def toString: String = firstName + " " + lastName + " " + hobbies
}