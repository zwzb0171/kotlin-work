// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

import kotlin.math.round

fun main(args: Array<String>) {
    // Add your code here
    val argumentCount = args.size
    if (argumentCount == 3) {
        println("Temperature in Celsius | Temperature in Farenheit")
        val initTemp = args[0].toFloat()
        val maxTemp = args[1].toFloat()
        val increment = args[2].toFloat()
        if (increment <= 0f) {
            println("Increment must be greater than zero")
            exitProcess(1)
        } else {
            var currentTemp = initTemp //initialises currentTemp to initialTemp
            while (currentTemp <= maxTemp) {
                val convertedTemp = currentTemp * 1.8f + 32
                val roundedCurrent = round(currentTemp * 100) / 100
                val roundedConverted = round(convertedTemp * 100) / 100
                println("$roundedCurrent | $roundedConverted")
                currentTemp += increment
            }
        }
    } else {
        print("Incorrect number of arguments supplied")
        exitProcess(1)
    }
}
