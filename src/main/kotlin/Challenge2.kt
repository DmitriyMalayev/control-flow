fun getOutputWithIf(input: Any?): String = if (input is Number) {
    if (input !is Int) {
        "Input was an Int"
    } else {
        "Input was a non-Int Number"
    }
}
else if (input is String) { "Input was a String with length ${input.length}" }
else if (input == null) { "Input was null" }
else { "Input didn't match target inputs" }

fun main() {
    println(getOutputWithIf(null))
    println(getOutputWithIf(4))
    println(getOutputWithIf(3.2))
    println(getOutputWithIf("Hello Kotlin"))
    println(getOutputWithIf('a'))
}