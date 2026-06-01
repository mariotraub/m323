package aufg4.t3

object MapAndFilter {
    data class Mitarbeiter(
        val name: String,
        val abteilung: String,
        val gehalt: Int
    )

    fun aufg1(): List<String> {
        val mitarbeiter = listOf(
            Mitarbeiter("Max Mustermann", "IT", 50000),
            Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
            Mitarbeiter("Klaus Klein", "IT", 55000),
            Mitarbeiter("Julia Gross", "HR", 40000)
        )

        return mitarbeiter
            .filter { it.abteilung == "IT" && it.gehalt >= 50000 }
            .map { it.name.substringBefore(" ").uppercase() }
    }

    fun aufg2(): List<String> {
        val kurse = listOf(
            "Programmierung in Scala",
            "Datenbanken",
            "Webentwicklung mit JavaScript",
            "Algorithmen und Datenstrukturen"
        )

        return kurse
            .filter { it.contains("Daten") }
            .map { it.replace(" ", "") }
            .sorted()
            .sortedDescending()
    }

}