// Task 4.7: finding the longest line in a file

import java.io.File
import java.io.IOException
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Incorrect number of arguments supplied")
        exitProcess(1)
    }

    val lines = try {
        File(args[0]).readLines()
    } catch (e: IOException) {
        println("Could not read file: ${args[0]}")
        exitProcess(1)
    }

    if (lines.isEmpty()) {
        println("File is empty")
        exitProcess(1)
    }

    var longestLine = 1
    var longestLength = 0
    for ((index, line) in lines.withIndex()) {
        if (line.length > longestLength) {
            longestLength = line.length
            longestLine = index + 1
        }
    }

    println("Line $longestLine is the longest (length = $longestLength)")
}
