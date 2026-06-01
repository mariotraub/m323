package aufg4.t4

object Fold {
    fun aufg1(): Int {
        val list = listOf(1, 2, 3, 4, 5)

        return list.fold(0) { acc, curr -> acc + curr }
    }

    fun aufg2(): String {
        val list = listOf("Hallo", " ", "Welt", "!")

        return list.fold("") { acc, curr -> acc + curr }
    }

    fun aufg3(): Pair<Int, Int> {
        val list = listOf(
            1 to 3,
            2 to 5,
            4 to 8,
            6 to 2,
        )
        val total = list.fold(0 to 0) { acc, curr ->
            (acc.first + curr.first) to (acc.second + curr.second)
        }
        return (total.first / list.size) to (total.second / list.size)
    }
}