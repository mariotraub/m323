package aufg4.t1

object MapUebungen {
    fun aufg1(): List<Int> {
        val list = listOf(1, 2, 3, 4, 5)
        return list.map { it * 2 }
    }

    fun aufg2(): List<String> {
        val list = listOf("Alice", "Bob", "Charlie")
        return list.map { it.uppercase() }
    }

    fun aufg3(): List<Double> {
        val list = listOf(12, 45, 68, 100)
        return list.map { it / 2.0 }
    }

    data class Adresse(
        val strasse: String,
        val hausnummer: Int,
        val postleitzahl: String,
        val stadt: String
    )

    fun getFormattedAdressString(address: Adresse): String {
        return "${address.strasse} ${address.hausnummer}, ${address.postleitzahl} ${address.stadt}"
    }

    fun getUppercaseFirstnames(names: List<String>): List<String> =
        names.map { it.substringBefore(" ").uppercase() }
}