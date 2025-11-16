package com.npntraining.basics

object example03 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  // Accesss to inner state of the object
  val student = new Student03                     //> student  : com.npntraining.basics.Student03 = com.npntraining.basics.Student
                                                  //| 03@6b71769e
  student.firstName = "A"
  student.firstName = "B"

  println(student)                                //> com.npntraining.basics.Student03@6b71769e

}

class Student03 {
  var firstName: String = ""
  var lastName: String = ""
}