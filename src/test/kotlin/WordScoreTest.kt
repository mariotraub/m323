import aufg1.calculateScore
import aufg1.wordScore
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

object WordScoreTest {
    @Test
    fun wordScoreTest() {
        assertEquals(calculateScore("imperative"), 9)
        assertEquals(calculateScore("no"), 2)
        assertEquals(wordScore("declarative"), 9)
        assertEquals(wordScore("yes"), 3)
    }
}