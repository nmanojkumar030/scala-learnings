package _02.collections.immutable.tuple

object _01_Tuple {
  def main(args: Array[String]): Unit = {

    val tuple02 = Tuple2("Hello", "World")
    println(tuple02)

    // shortcut to create tuple
    val helloworld = ("Hello", "World")

    //Swap elements
    println(tuple02.swap)

    // Using TupleN classes to store more than 2 data points
    val tuple03 = Tuple3("EmployeeA", "DeptA", 1000.00)
    println(tuple03)

    // Access each element in tuple
    println(tuple03._1)
    println(tuple03._2)
    println(tuple03._3)

    // Iterate
    tuple03.productIterator.foreach(println)

    // Pattern Match
    val tuple04 = Tuple3("EmployeeB", "DeptA", 2000.00)
    val tuple05 = Tuple3("EmployeeC", "DeptB", 3000.00)

    val employeeList = List(tuple03, tuple04, tuple05)
    employeeList.foreach(tuple => {
      tuple match {
        case (name, "DeptA", salary) => println(s"Employee $name belongs to Department A and has salary $salary")
        case t if t._2 == "DeptB"    => println(s"Employee ${t._1} belongs to Department B and has salary ${t._3}")
        case _                       => None
      }
    })
  }
}