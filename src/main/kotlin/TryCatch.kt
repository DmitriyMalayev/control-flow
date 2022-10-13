fun usingTryCatch() {
    val message = try {
        "The value is ${10 / 0}"
    } catch (error: Throwable) {
        "An error was thrown"
    }
    println(message)
}

fun usingTryCatchSpecificExceptions() {
    val message = try {
        throw IllegalStateException()
        "The value is ${10 / 0}"
    } catch (error: ArithmeticException) {
        "Error was thrown"
    } catch (error: java.lang.IllegalStateException) {
        "An error was IllegalState"
    }
    println(message)
}
