// Expressions return a value. A statement does not return a value.

fun main() {
    val someVariable = 5
    if (true) println("The condition was true")
    if (true) {
        val message = "Complex logic here"
        println(message)
    }
    if (someVariable > 3) {
        println("The value was greater than 3")
    } else if (someVariable > 2) {
        println("The value was greater than 2")
    } else {
        println("Not greater")
    }

    when {
        someVariable > 3 -> println("The value was greater than 3")
        someVariable > 2 -> println("The value was greater than 2")
        else -> {
            println("The value was not greater")
        }
    }

    when (someVariable) {
        0, 1 -> println("The value was 0 or 1")
        2 -> println("The value is 2")
        3 -> println("The value is 3")
        in 4..Int.MAX_VALUE -> println("The value was greater than 3")


    }
    statementsAndExpressions()
    whenExpressions()
    getMessageWithWhen(3)
    usingTryCatch()
    usingTryCatchSpecificExceptions()
}

