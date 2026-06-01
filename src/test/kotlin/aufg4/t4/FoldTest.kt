package aufg4.t4

import aufg4.t4.Fold.aufg1
import aufg4.t4.Fold.aufg2
import aufg4.t4.Fold.aufg3
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class FoldTest {
    @Test
    fun testAufg1() {
        assertEquals(15, aufg1())
    }

    @Test
    fun testAufg2() {
        assertEquals("Hallo Welt!", aufg2())
    }

    @Test
    fun testAufg3() {
        assertEquals(3 to 4, aufg3())
    }
}