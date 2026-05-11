package aufg1.t3

fun getTipPercentage(people: List<String>): Int {
    return when (people.size) {
        0 -> 0
        in 1..5 -> 10
        else -> 20
    }
}
