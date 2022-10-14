fun main() {
    for (i in 0 until 5) {
        println(i)
    }
    println()
    for (i in 0..5) {
        println(i)   //includes 5
    }
    println()

    for (i in 10 downTo 0) {
        println(i)
    }
    println()
    for (i in 10 downTo 0 step 3) {
        println(i)
    }
    println()

}