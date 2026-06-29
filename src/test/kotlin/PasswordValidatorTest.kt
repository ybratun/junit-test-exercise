import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class PasswordValidatorTest {

    @Test
    fun `valid password should return true`() {
        assertTrue(PasswordValidator.isValidPassword("ValidP4ssword"))
    }

    @Test
    fun `empty password should return false`() {
        assertFalse(PasswordValidator.isValidPassword(null))
    }

    @Test
    fun `too short password should return false`() {
        assertFalse(PasswordValidator.isValidPassword("qwerty"))
    }

    @Test
    fun `password without digit should return false`() {
        assertFalse(PasswordValidator.isValidPassword("ValidPPssword"))
    }

    @Test
    fun `password without upper case should return false`() {
        assertFalse(PasswordValidator.isValidPassword("1alid34ssword"))
    }

    @Test
    fun `password exclusively with empty spaces should return false`() {
        assertFalse(PasswordValidator.isValidPassword("        "))
    }
}