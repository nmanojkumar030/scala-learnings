package _00_why_scala.chapater01

/**
  * Scala is high-level.
  *
  * Scala helps you manage complexity by letting you
  * raise the level of abstraction in the interfaces you design
  * and use.
  */
object ch01_ex04 {
  def main(args: Array[String]): Unit = {
    println(nameHasUpperCase("Manoj"))
  }

  def nameHasUpperCase(name: String): Boolean = {
    name.exists(_.isUpper)
  }

  /**
    * the same code in Java
    *
    * boolean nameHasUpperCase = false
    * for(i=0; i < name.length; i++){
    *  if(Character.isUpperCase(name.characterAt(i))){
    *     namHasUpperCase=true
    *     break;
    *   }
    * }
    */

}
