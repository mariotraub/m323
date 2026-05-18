package aufg2.t1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RouteTest {
    val destList = listOf("A", "B", "C")

    @Test
    fun testAddDestination() {
        val expected = destList + "D"
        val actual = addDestination(destList, "D")

        assertEquals(expected, actual)
    }

    @Test
    fun testInsertDestinationAtIndex() {
        val expected = listOf("A", "D", "B", "C")
        val actual = insertDestinationAtIndex(destList, "D", 1)

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDestination() {
        val expected = listOf("A", "C")
        val actual = removeDestination(destList, "B")

        assertEquals(expected, actual)
    }

    @Test
    fun testReplaceDestination() {
        val expected = listOf("A", "D", "C")
        val actual = replaceDestination(destList, "B", "D")

        assertEquals(expected, actual)
    }
}