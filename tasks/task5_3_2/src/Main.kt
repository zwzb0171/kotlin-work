import kotlin.system.exitProcess

// Task 5.3.2: main program
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDice()
        return
    }

    val parts = args[0].lowercase().split("d")
    if (parts.size != 2) {
        println("Dice specification must look like #d#")
        exitProcess(1)
    }

    val noOfDice = parts[0].toIntOrNull()
    if (noOfDice == null) {
        println("Number of dice must be an integer")
        exitProcess(1)
    }

    val sides = parts[1].toIntOrNull()
    if (sides == null) {
        println("Number of sides must be an integer")
        exitProcess(1)
    }

    rollDice(sides = sides, noOfDice = noOfDice)
}
