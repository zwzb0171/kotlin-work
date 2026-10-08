// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Incorrect number of arguments supplied")
        exitProcess(1)
    }

    val limit = args[0].toIntOrNull()
    if (limit == null) {
        println("Limit must be an integer")
        exitProcess(1)
    }

    var sum = 0L
    for (n in 1..limit step 2) {
        sum += n
    }

    println("Sum of odd integers from 1 to $limit is $sum")
}
