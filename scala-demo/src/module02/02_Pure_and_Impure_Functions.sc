/**
  * Pure Function
  */
val name: String = "NPN"
name.charAt(1)

/**
  * Impure Function
  */
var x: Int = 2
def sum(num: Int): Int = {
  num + x
}

sum(5)

x = 10
sum(5)