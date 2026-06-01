package aufg4.t5


object FlatMap {
    fun aufg1(): List<Int> {
        val list = listOf(listOf(1, 2), listOf(3, 4), listOf(5, 6))
        return list.flatMap { l -> l.map { it * 2 } }
    }

    fun aufg2(): List<String> {
        val list = listOf(
            "Max"   to listOf("Blau", "Grün"),
            "Anna"  to listOf("Rot"),
            "Julia" to listOf("Gelb", "Blau", "Grün")
        )

        return list.flatMap { it.second }.distinct()
    }
}