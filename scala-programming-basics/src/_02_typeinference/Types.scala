    def printAny(x: Any) = println(x)
    def printAnyVal(y: AnyVal) = println(y)
    def printAnyRef(z: AnyRef) = println(z)

    val someVal = 5
    val someRef = List(3,5)

    printAny(someVal)
    printAny(someRef)

    printAnyVal(someVal)
    printAnyVal(someRef)

    printAnyRef(someVal)
    printAnyRef(someRef)
