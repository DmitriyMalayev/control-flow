fun checkType(input: Any?) {
    when (input) {
        null -> println("Input was null")
        is String -> println("Input was a String of length ${input.length}")
    }
}

fun main() {
    val aGenericVariable: Any = 5
    val anIntVariable: Int = aGenericVariable as Int

    checkType("null")
}

// To cast a value means that we explicitly
// change the type of the variable or property to some new specific type.