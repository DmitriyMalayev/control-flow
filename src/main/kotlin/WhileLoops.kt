fun main() {
    runAtleastOnce()
    whileLoopAlternative()
}

fun runAtleastOnce(){
    var counter = 0

    do {
        println(counter)
        counter += 1
    } while (counter < 5)
}

fun whileLoopAlternative(){
    var counter = 0
    while (counter < 5){
        println(counter)
        counter++
        if (counter == 3)break
    }
}