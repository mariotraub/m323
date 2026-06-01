package aufg4.t1

import aufg4.t1.MapUebungen.aufg1
import aufg4.t1.MapUebungen.aufg2
import aufg4.t1.MapUebungen.aufg3
import aufg4.t1.MapUebungen.getFormattedAdressString
import aufg4.t1.MapUebungen.getUppercaseFirstnames
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MapUebungenTest {
    @Test
    fun testAufg1() {
        assertEquals(listOf(2, 4, 6, 8, 10), aufg1())
    }

    @Test
    fun testAufg2() {
        assertEquals(listOf("ALICE", "BOB", "CHARLIE"), aufg2())
    }

    @Test
    fun testAufg3() {
        assertEquals(listOf(6.0, 22.5, 34.0, 50.0), aufg3())
    }

    @Test
    fun testGetFormattedAdressString() {
        val address = MapUebungen.Adresse("Hauptstrasse", 10, "12345", "Musterstadt")

        val expected = "Hauptstrasse 10, 12345 Musterstadt"
        assertEquals(expected, getFormattedAdressString(address))
    }

    @Test
    fun testGetUppercaseFirstnames() {
        val names = listOf("Max Mustermann", "Erika Mustermann")
        val expected = listOf("MAX", "ERIKA")

        assertEquals(expected, getUppercaseFirstnames(names))
    }
}