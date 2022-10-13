fun getMessage(input: Int) = if (input > 3) {
    "Greater than 3"
} else {
    "Not greater than 3"
}


fun statementsAndExpressions() {
    val someNewVariable = 0
    val message = if (someNewVariable > 3) {
        "The value was greater than 3"
    } else {
        "The value was not greater than 3"
    }
    println(message)
}

fun whenExpressions() {
    var someVariable = 5
    val message = when (someVariable){
        3 -> "The value is three"
        else -> "The value is not three"
    }
    println(message)
}

fun getMessageWithWhen(input: Int) = when (input){
    3 -> "The value is three"
    else -> "The value is not three"
}