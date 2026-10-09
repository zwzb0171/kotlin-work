// Task 5.4.2: main program
fun main() {
    val tests = listOf(
        "",
        "short",
        "exactly twenty chars",
        "twenty-one characters",
        "this string is definitely too long"
    )

    for (s in tests) {
        println("\"$s\" (length ${s.length}) is too long: ${s.isTooLong}")
    }
}
