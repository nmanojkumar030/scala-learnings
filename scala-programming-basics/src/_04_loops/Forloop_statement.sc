val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

for (day <- daysOfWeekList) {
  day match {
    case "Mon" => println("Monday")
    case "Tue" => println("Tuesday")
    case "Wed" => println("Wednesday")
    case "Thu" => println("Thursday")
    case "Fri" => println("Friday")
    case otherDay => println(otherDay) // Remaining weekdays matches this case
  }
}

// yield is to accumulate the results
val x = for (day <- daysOfWeekList) yield {
  day match {
    case "Mon" => "Monday"
    case "Tue" => "Tuesday"
    case "Wed" => "Wednesday"
    case "Thu" => "Thursday"
    case "Fri" => "Friday"
    case otherDay => otherDay
  }
}
