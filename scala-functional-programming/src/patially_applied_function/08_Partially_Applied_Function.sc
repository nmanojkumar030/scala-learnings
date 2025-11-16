def compareStrings(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {
    1
  }
}

def smartCompare(s1: String, s2: String, compareFunction: (String, String) => Int): Int = {
  compareFunction(s1, s2)
}

// Example 1
val defaultCompare = smartCompare(_: String, _: String, compareStrings)
defaultCompare("abc", "xy")

// Example 2
val piCompare = smartCompare("Pi", _: String, compareStrings)
piCompare("Pi")
piCompare("Abc")
piCompare("xyz")