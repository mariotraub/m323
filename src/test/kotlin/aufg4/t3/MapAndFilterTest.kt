package aufg4.t3

import aufg4.t3.MapAndFilter.aufg1
import aufg4.t3.MapAndFilter.aufg2
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MapAndFilterTest {
    @Test
    fun testAufg1() {
        assertEquals(listOf("MAX", "KLAUS"), aufg1())
    }

    @Test
    fun testAufg2() {
        assertEquals(listOf("Datenbanken", "AlgorithmenundDatenstrukturen"), aufg2())
    }
}