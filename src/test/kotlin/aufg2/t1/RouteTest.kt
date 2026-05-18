package aufg2.t1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RouteTest {
    val destList = listOf("A", "B", "C")
    @Test
    fun testCreation() {
        val actual = Route.createRoute(destList).destinations
        assertEquals(destList, actual)
    }

    @Test
    fun testAddDestination() {
        val subject = Route.createRoute(destList)

        val expected = destList + "D"
        val actual = subject.addDestination("D").destinations

        assertEquals(expected, actual)
    }

    @Test
    fun testInsertDestinationAtIndex() {
        val subject = Route.createRoute(destList)

        val expected = listOf("A", "D", "B", "C")
        val actual = subject.insertDestinationAtIndex("D", 1).destinations

        assertEquals(expected, actual)
    }

    @Test
    fun testRemoveDestination() {
        val subject = Route.createRoute(destList)

        val expected = listOf("A", "C")
        val actual = subject.removeDestination("B").destinations

        assertEquals(expected, actual)
    }

    @Test
    fun testReplaceDestination() {
        val subject = Route.createRoute(destList)

        val expected = listOf("A", "D", "C")
        val actual = subject.replaceDestination("B", "D").destinations

        assertEquals(expected, actual)
    }
}