// Task 5.2.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Incorrect number of arguments supplied")
        exitProcess(1)
    }

    val radius = args[0].toDoubleOrNull()
    if (radius == null) {
        println("Radius must be a number")
        exitProcess(1)
    }

    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)
    println("Circle has area %.4f".format(area))
    println("Circle has perimeter %.4f".format(perimeter))
}
