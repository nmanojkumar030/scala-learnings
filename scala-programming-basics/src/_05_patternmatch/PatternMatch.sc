/**
  * Monday -1
  * Tuesday - 2
  * Wednesday - 3
  * Thursday - 4
  * Friday - 5
  * Saturday-6
  * Sunday - 7
  */

// A simple pattern match.
val dayOfWeek01 = 5
val weekName01 = dayOfWeek01 match {
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case 7 => "Sunday"
}

// Scala.MatchError if none of the case is matched.
val dayOfWeek02 = 8
val weekName02 = dayOfWeek02 match {
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case 7 => "Sunday"
}

// case with logical expression.
val dayOfWeek03 = 4
val weekName03 = dayOfWeek03 match {
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 | 4 | 5 => "Wednesday OR Thursday OR Friday"
  case 6 => "Saturday"
  case 7 => "Sunday"
}

val dayOfWeek04 = 8
val weekName04 = dayOfWeek04 match {
  case 1 => "Monday"
  case 2 => "Tuesday"
  case 3 => "Wednesday"
  case 4 => "Thursday"
  case 5 => "Friday"
  case 6 => "Saturday"
  case 7 => "Sunday"
  case _ => "No Match"
}

// Casting
val radius01: Any = 10
val typeOfRadius01 = radius01 match {
  case radius01: Int => "Integer"
  case radius01: String => "String"
  case radius01: Double => "Double"
  case _ => "Any"
}

val radius03: Any = "10"
val typeOfRadius = radius03 match {
  case radius03: Int => "Integer"
  case radius03: String => "String"
  case radius03: Double => "Double"
  case _ => "Any"
}
