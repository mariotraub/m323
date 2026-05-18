package aufg2.t1

fun main() = app(listOf())

fun app(route: List<String>) {
    printRoute(route)
    printOptions()
    val selectedOption = prompt("Select option:").toIntOrNull()
    app(when (selectedOption) {
        1 -> addDestination(route, prompt("Destination to add:"))
        2 -> insertDestinationAtIndex(route, prompt("Destination to insert:"), prompt("Index:").toInt())
        3 -> removeDestination(route, prompt("Destination to remove:"))
        4 -> replaceDestination(route, prompt("Destination to replace:"), prompt("Replacement"))
        5 -> return
        else -> route
    })
}

fun prompt(prompt: String): String {
    print("$prompt\n> ")
    return readln()
}

fun printOptions() {
    println(
        """
        1: add destination
        2: insert destination
        3: remove destination
        4: replace destination
        5: stop
    """.trimIndent()
    )
}

fun printRoute(route: List<String>) {
    println(route.joinToString(", ", "Route: "))
}