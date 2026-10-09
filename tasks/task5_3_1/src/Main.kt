// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDie()
        return
    }

    val sides = args[0].toIntOrNull()
    if (sides == null) {
        println("Number of sides must be an integer")
        exitProcess(1)
    }

    rollDie(sides)
}
