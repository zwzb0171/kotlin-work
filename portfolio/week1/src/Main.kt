// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

// Student id: 201767850
// Student name: Pierre Frizelle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }

    val x = args[0].toDouble()
    val y = args[1].toDouble()
    val z = args[2].toDouble()

    val a = (x + y + z) / 2.0
    val area = sqrt(a * (a - x) * (a - y) * (a - z))

    println("Area = %.5f".format(area))
}