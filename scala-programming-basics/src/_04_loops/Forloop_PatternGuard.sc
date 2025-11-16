// A For loop with conditions
for (x <- 0 to 100 if (x % 5 == 0)) {
  println(x)
}
val daysOfWeekList = List("Mon","Tue","Wed","Thu","Fri","Sat","Sun")

for(day <- daysOfWeekList if day == "Mon") {
  println("Manic Monday")
}
