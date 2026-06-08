package aufg5.t1

object Aufg {
    @JvmStatic
    fun main(args: Array<String>) {
        // Übung 1
        val m1 = mapOf("key" to "value")

        // Übung 2
        val m2 = m1 + ("key2" to "value2")

        // Übung 3
        val m3 = m2 + ("key2" to "aDifferentValue")

        // Übung 4
        val m4 = m3 - "key"

        // Übung 5
        val v5 = m3["key"]

        // Übung 6
        val v6 = m4["key"]
    }
}
