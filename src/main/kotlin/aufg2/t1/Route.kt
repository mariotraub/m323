package aufg2.t1


fun addDestination(route: List<String>, destination: String) = route + destination
fun insertDestinationAtIndex(route: List<String>, destination: String, index: Int) =
    route.subList(0, index) + destination + route.subList(index, route.size)

fun removeDestination(route: List<String>, destination: String) = route.filter { it != destination }
fun replaceDestination(route: List<String>, destination: String, replacement: String) =
    route.map { if (it == destination) replacement else it }