def compareStrings(s1: String, s2: String): Int = {
  if (s1 == s2) 0
  else if (s1 > s2) -1
  else {
    1
  }
}

// Parameter group - Multiple group of parameters
def curriedSmartCompare(compareFunction: (String, String) => Int)(s1: String, s2: String): Int = {
  compareFunction(s1, s2)
}

// Example 1
val defaultCompare = curriedSmartCompare(compareStrings)(_: String, _: String)
defaultCompare("abc", "xy")

// Example 2
val piCompare = curriedSmartCompare(compareStrings)("Pi", _: String)
piCompare("Pi")
piCompare("Abc")
piCompare("xyz")