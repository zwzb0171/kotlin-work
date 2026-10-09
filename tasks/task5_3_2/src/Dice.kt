// Task 5.3.2: rollDice() function
import kotlin.random.Random
import kotlin.system.exitProcess

fun rollDice(sides: Int = 6,noOfDice: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        var currentRoll = 0
        while (currentRoll < noOfDice) {
            currentRoll += 1
            println("$currentRoll - Rolling a $sides sided dice...")
            val result = Random.nextInt(1, sides + 1)
            println("You rolled $result")
        }
    }
    else {
        println("Error: cannot have a $sides-sided die")
        exitProcess(1)
    }
}