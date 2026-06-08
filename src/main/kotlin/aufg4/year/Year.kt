package aufg4.year

import java.time.Month
import java.time.Year
import java.time.YearMonth
import kotlin.random.Random

object Year {
    data class Day(
        val yearMonth: YearMonth,
        val day: Int
    ) {
        fun getName() = this.yearMonth.month.name
    }

    fun aufg(year: Int, random: Random) {
        val map: List<List<Pair<Day, List<Int>>>> = Month.entries.map { month ->
            val ym = YearMonth.of(year, month)

            return@map (1..ym.lengthOfMonth()).map {
                Day(ym, it) to getRandomValuesForDay(random)
            }
        }
        val valuesPerMonth = map.map {
            (it.first().first.getName() to (it.map { day -> day.second.size }.fold(0) { acc, curr ->
                acc + curr
            }))
        }
        val avgPerMonth = map.map {
            val monthValues = it.flatMap { day -> day.second }
            (it.first().first.getName() to monthValues.reduce { acc, curr ->
                acc + curr
            } / monthValues.size)
        }
        val sum = avgPerMonth.map { it.second }.reduce { acc, curr -> acc + curr }

        println(valuesPerMonth.fold("") { acc, curr ->
            "$acc\n${curr.first}: ${curr.second} Values"
        }.drop(1))
        println(avgPerMonth.fold("") { acc, curr ->
            "$acc, ${curr.second}"
        }.drop(2))
        println("Sum: $sum")
    }

    @JvmStatic
    fun main(args: Array<String>) {
        aufg(2025, Random(67))
    }

    fun getRandomValuesForDay(random: Random): List<Int> =
        (0..random.nextInt(10, 20)).map {
            random.nextInt(1000)
        }
}