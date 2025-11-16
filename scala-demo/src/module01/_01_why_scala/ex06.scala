package module01._01_why_scala

import java.text.DateFormat.{LONG, getDateInstance}
import java.util.{Date, Locale}

/**
  * Scala interoperability
  * We can embed java code in scala code
  */
object ex06 {
  def main(args: Array[String]): Unit = {
    val todayDate = new Date()
    val dateFormat = getDateInstance(LONG, Locale.FRANCE)
    //println(dateFormat.format(todayDate))
    println(dateFormat format todayDate)
  }
}
