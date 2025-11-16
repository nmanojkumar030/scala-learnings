// Condition inside case
val dayOfWeek01 = "Saturday"
val typeOfDay01 = dayOfWeek01 match {
  case "Monday" => "Manic Monday"
  case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other working day"
  case dayOfWeek01 if dayOfWeek01 == "Sunday" => "Sleepy Sunday"
  case dayOfWeek01 if dayOfWeek01 == "Saturday" => "Sizzling Saturday"
}

val dayOfWeek04 = 6
val weekName04 = dayOfWeek04 match {
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case dayOfWeek04 if dayOfWeek04 == 6 | dayOfWeek04 == 7 => "Saturday OR Sunday"
  case _ => "No Match"
}

val num = 1
val result2 = num match {
  case num if (num == 1 || num == 2) => "One OR Two" // Match two conditions
  case 3 => "Three"
  case _ => "Default"
}

// Expression blocks
val dayOfWeek02 = "Friday"
val typeOfDay02 = dayOfWeek02 match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case someOtherDay => {
    println(s"Some other day - neither Sunday nor Monday, its $someOtherDay")
    someOtherDay
  }
}
println(typeOfDay02)


val dayOfWeek03 = "Friday"
val typeOfDay03 = dayOfWeek03 match {
  case "Monday" => "Manic Monday"
  case "Sunday" => "Sleepy Sunday"
  case _ => {
    val errorString = s"Some other day - neither Sunday nor Monday, its $dayOfWeek03"
    errorString
  }
}

