package aufg2.t1

class Route private constructor(
    val destinations: List<String>
) {
    companion object {
        fun createRoute(destinations: List<String>): Route = Route(destinations)
    }

    fun addDestination(destination: String) = Route(destinations + destination)
    fun insertDestinationAtIndex(destination: String, index: Int) = Route(
        destinations.subList(0, index)
                + destination
                + destinations.subList(index, destinations.size)
    )
    fun removeDestination(destination: String) = Route(destinations.filter { it != destination })
    fun replaceDestination(destination: String, replacement: String) = Route(
        destinations.map { if (it == destination) replacement else it }
    )
}