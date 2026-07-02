
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Test
import kotlin.test.assertTrue

class DscountValidatorTest {

    @Test
    fun `verify when code is null should return false`() {
        assertFalse(DiscountValidator.validateDiscountCode(null, 100.3))
    }

    @Test
    fun `verify when code is empty should return false`() {
        assertFalse(DiscountValidator.validateDiscountCode("", 100.3))
    }

    // Positive
    @Test
    fun `verify when SAVE10`() {
        assertTrue(DiscountValidator.validateDiscountCode("SAVE10", 101.3))
    }

    @Test
    fun `verify when WELCOME20`() {
        assertTrue(DiscountValidator.validateDiscountCode("WELCOME20", 100.3))
    }

    @Test
    fun `verify when FREESHIP`() {
        assertTrue(DiscountValidator.validateDiscountCode("FREESHIP", 100.3))
    }

    @Test
    fun `verify when code is not known should return false`() {
        assertFalse(DiscountValidator.validateDiscountCode("save20", 100.3))
    }

    // when code formatting differs from expected that it will be pretified
    @Test
    fun `verify when save10 received true`() {
        assertTrue(DiscountValidator.validateDiscountCode("save10", 100.3))
    }

}