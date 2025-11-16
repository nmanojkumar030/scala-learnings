package module01._08_string

/**
  * 1. String once created cannot be changed
  * 2. When we operate on the string internally it creates a new string and returns that string
  */
object StringImmutability {

  def main(args: Array[String]): Unit = {
    val firstName = "NPN"
    println(firstName.toUpperCase)
    // name still hasn't changed
    println(firstName)

   
    var lastName = "Training"
    lastName = lastName.toUpperCase
    // Now the lastname reference to the new string created ("Training")
    println(lastName)
  }
}
