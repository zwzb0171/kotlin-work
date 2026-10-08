// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val argumentCount = args.size
    if (argumentCount == 3) {
        val avg = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble()) / 3
        val mark = avg.roundToInt()
        val grade = when (mark) {
            in 0..39   -> "Fail"
            in 40..69  -> "Pass"
            in 70..100 -> "Distinction"
            else       -> "?"
        }
        println("You scored a $grade")
    } else {
        print("Incorrect number of arguments supplied")
    }


}