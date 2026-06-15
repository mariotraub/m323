package aufg5.t2

import java.time.LocalTime

object Aufg2 {
    fun wetterFunktion(): Triple<String, LocalTime, Int> {
        return Triple("sonnig", LocalTime.now(), 17)
    }

    val data = listOf(
        ("Zurich" to 17),
        ("Bern" to 19),
        ("Geneva" to 21),
        ("Basel" to 18),
        ("Lugano" to 24),
        ("Lausanne" to 20),
        ("Lucerne" to 16),
        ("St. Gallen" to 14),
    )

    @JvmStatic
    fun main(args: Array<String>) {
        println(data.filter { it.second > 20})
    }
}