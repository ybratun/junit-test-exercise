
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertTrue

class RandomNumberGenerator {

    @Test
    fun verifyTrueIsAlwaysTrue(){
        assertTrue(true == true)
    }

    @Test
    fun `getRandom returns value between 0 and 100` (){
        val random = getRandom(100)
        assertTrue(random in 0 .. 100)
    }

    @Test
    fun `getRandom throw an exception when negative value is passed`() {
        assertThrows<IllegalArgumentException> {
            getRandom(-1)
        }
    }

    @Test
    fun `getRandom throws an exception when 0 is passed`() {
        assertThrows<IllegalArgumentException> {
            getRandom(0)
        }
    }

    @Test
    fun `getRandom throws an error when higher than max value passed` (){
        val random = getRandom(100)
        assertFalse(random in 0 .. 1)
    }
}