package aufg3.t3

import java.time.LocalDate

// 3.1
fun getListSum(list: List<Int>) = list.sum()

// 3.2
fun getListAvg(list: List<Int>) = list.average()

// 3.3
fun sort(list: List<String>) = list.sorted()

// 3.4
data class Task(
    val date: LocalDate,
    val priority: Int,
    val title: String,
)

fun sortTasks(tasks: List<Task>) =
    tasks.sortedWith(compareBy({ it.date }, {it.priority}, {it.title}))

// 3.5
data class Node(
    val children: List<Node> = listOf(),
)

fun getLeaves(root: Node): List<Node> = root.children.flatMap { node ->
    if (node.children.isEmpty()) listOf(node) else getLeaves(node)
}
