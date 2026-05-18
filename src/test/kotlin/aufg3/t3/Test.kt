package aufg3.t3

import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertEquals

class Aufg3Test {
    // 1.1
    @Test
    fun testListSum() {
        assertEquals(3, getListSum(listOf(1, 2)))
    }

    // 1.2
    @Test
    fun testListAvg() {
        assertEquals(3.0, getListAvg(listOf(1, 5)))
    }

    // 1.3
    @Test
    fun testSort() {
        val expected = listOf("a", "b", "c")
        val actual = sort(listOf("c", "a", "b"))

        assertEquals(expected, actual)
    }

    // 3.4
    @Test
    fun testSortTasksByDate() {
        val t1 = Task(LocalDate.of(2025, 3, 1), 1, "A")
        val t2 = Task(LocalDate.of(2025, 1, 1), 1, "B")
        val t3 = Task(LocalDate.of(2025, 2, 1), 1, "C")

        assertEquals(listOf(t2, t3, t1), sortTasks(listOf(t1, t2, t3)))
    }

    @Test
    fun testSortTasksByPriority() {
        val date = LocalDate.of(2025, 1, 1)
        val t1 = Task(date, 3, "A")
        val t2 = Task(date, 1, "B")
        val t3 = Task(date, 2, "C")

        assertEquals(listOf(t2, t3, t1), sortTasks(listOf(t1, t2, t3)))
    }

    @Test
    fun testSortTasksByTitle() {
        val date = LocalDate.of(2025, 1, 1)
        val t1 = Task(date, 1, "C")
        val t2 = Task(date, 1, "A")
        val t3 = Task(date, 1, "B")

        assertEquals(listOf(t2, t3, t1), sortTasks(listOf(t1, t2, t3)))
    }

    // 3.5
    @Test
    fun testGetLeaves() {
        val leaf1 = Node()
        val leaf2 = Node()
        val leaf3 = Node()
        val root = Node(listOf(
            Node(listOf(leaf1, leaf2)),
            Node(listOf(leaf3)),
        ))

        assertEquals(listOf(leaf1, leaf2, leaf3), getLeaves(root))
    }

    @Test
    fun testGetLeavesFlat() {
        val leaf1 = Node()
        val leaf2 = Node()
        val root = Node(listOf(leaf1, leaf2))

        assertEquals(listOf(leaf1, leaf2), getLeaves(root))
    }
}