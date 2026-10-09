// Task 5.5: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Incorrect number of arguments supplied")
        exitProcess(1)
    }

    val word1 = args[0]
    val word2 = args[1]

    if (word1 anagramOf word2) {
        println("\"$word1\" and \"$word2\" are anagrams")
    } else {
        println("\"$word1\" and \"$word2\" are not anagrams")
    }
}
