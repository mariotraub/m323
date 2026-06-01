package aufg4.t5

import aufg4.t5.FlatMap.aufg1
import aufg4.t5.FlatMap.aufg2
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class FlatMapTest {
    @Test
    fun testAufg1() {
        assertEquals(listOf(2, 4, 6, 8, 10, 12), aufg1())
    }

    @Test
    fun testAufg2() {
        assertEquals(listOf("Blau", "Grün", "Rot", "Gelb"), aufg2())
    }
}