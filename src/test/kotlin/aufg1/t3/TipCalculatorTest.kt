package aufg1.t3

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object TipCalculatorTest {
    val names = listOf("1", "2", "3", "4", "5", "6")
    @Test
    fun testEmptyGroup() {
        assertEquals(0, getTipPercentage(listOf()))
    }

    @Test
    fun testOneToFive() {
        assertEquals(10, getTipPercentage(names.subList(0, 1)))
        assertEquals(10, getTipPercentage(names.subList(0, 3)))
        assertEquals(10, getTipPercentage(names.subList(0, 5)))
    }

    @Test
    fun testMoreThanFive() {
        assertEquals(20, getTipPercentage(names))
    }
}