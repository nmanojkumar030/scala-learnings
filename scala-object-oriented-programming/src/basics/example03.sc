package com.npntraining.basics

object example03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val student = new Student03                     //> student  : com.npntraining.basics.Student03 =  
  student.firstName = "A"
  student.lastName = "B"
  println(student)                                //> A B

  student.firstName = "C"
  println(student)                                //> C B

}

// Inner state of the object can be modified with
// the var declaration
class Student03 {
  var firstName: String = ""
  var lastName: String = ""

  override def toString: String = firstName + " " + lastName
}