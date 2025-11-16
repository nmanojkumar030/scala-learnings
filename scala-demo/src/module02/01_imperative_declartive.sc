/**
  * Declartive style of programming
  */
List.range(1, 100).filter(_ % 2 == 0).foreach(println)

/**
  * Imperative style of programming
  */
var i: Int = 1
while (i < 100) {
  if (i % 2 == 0) {
    println(i)
  }
  i = i + 1
}