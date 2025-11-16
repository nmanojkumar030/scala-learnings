val result1 = {
  val x = 100
  println("Inside scope I", x);
  {
    val x = "ABC"
    println("Inside scope II", x)
    x
  }
}

// Block {}, result of the last statement is the result of the block
println({
  val a: Int = 2 + 2
  a + 4
})



val result3 = {
  val x = 100
  println("Inside scope I", x);
  {
    val x = "ABC"
    println("Inside scope II", x)
    x
  }
}

// Block {}, result of the last statement is the result of the block
println({
  val a: Int = 2 + 2
  a + 4
})


var radius = 10
val area = {
  val PI = 3.1
  println(s"Inside scope 1, PI = $PI");
  {
    val PI = 3.14
    println(s"Inside scope 2, PI = $PI")
    PI * radius * radius
  }
  PI * radius * radius
}
println(area)


val area1 = {
  val PI = 3.1
  println(s"Inside scope 1, PI = $PI");
  {
    val PI = 3.14
    println(s"Inside scope 2, PI = $PI")
    PI * radius * radius
  }
  //PI * radius * radius
}
println(area1)

