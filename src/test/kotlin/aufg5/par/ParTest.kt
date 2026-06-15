package aufg5.par

import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class ParTest {
    @Test
    fun testIsPrime() {
        assertTrue { Par.isPrime(2) }
        assertTrue { Par.isPrime(17) }
        assertTrue { Par.isPrime(3) }
        assertFalse { Par.isPrime(-1) }
        assertFalse { Par.isPrime(1) }
        assertFalse { Par.isPrime(6) }
    }

}