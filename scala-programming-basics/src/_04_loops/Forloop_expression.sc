// A simple for loop from 0 to 5 inclusive
for (x <- 0 to 5) {
  println(x)
}

// A simple for loop from 0 to 5, 5 exclusive
for (x <- 0 until 5) {
  println(x)
}

// A For loop with yield
val result = for {
  x <- 1 to 100
  if x % 5 == 0
} yield x
println(result)


val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")
for (day <- daysOfWeekList) {
  day match {
    case "Mon" => println("Monday")
    case "Tue" => println("Tuesday")
    case "Wed" => println("Wednesday")
    case "Thu" => println("Thursday")
    case "Fri" => println("Friday")
    case otherDay => println(otherDay)
  }
}

val x = for (day <- daysOfWeekList) yield {
  day match {
    case "Mon" => "Manic Monday"
    case otherDay => otherDay
  }
}

for (day <- daysOfWeekList) {
  println(day)
}

for (i <- 0 to daysOfWeekList.size - 1) {
  println(daysOfWeekList(i))
}


for (i <- 0 until daysOfWeekList.size) {
  println(daysOfWeekList(i))
}
