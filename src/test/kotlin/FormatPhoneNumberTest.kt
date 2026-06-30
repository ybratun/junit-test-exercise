
import PhoneFormatter.formatPhoneNumber
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FormatPhoneNumberTest {

    @Test
    fun `verify Number Is Null`(){
        val result = formatPhoneNumber(null)
            assertEquals("invalid format",result)

    }

    @Test
    fun `verify Number Is empty`(){
        val result = formatPhoneNumber("")
        assertEquals("invalid format",result)

    }

    @Test
    fun `verify Number Is more than 10 numbers`(){
        val result = formatPhoneNumber("12345678900")
        assertEquals("the number is more than 10 digits",result)

    }

    @Test
    fun `Number of 10 digits is acceptable`(){
        val result = formatPhoneNumber("1234567899")
        assertEquals("(123) 456-7899", result)

    }

    @Test
    fun `Number cannot be formatted and shows a message when non digit characters contained`(){
        val result = formatPhoneNumber("123-456-78900")
        assertEquals("the number is more than 10 digits",result)

    }

    @Test
    fun `Number less than 10 digits cannot be formatted and shows a message`(){
        val result = formatPhoneNumber("12345678")
        assertEquals("the number is less than 10 digits",result)

    }

    @Test
    fun `string with dashes and spaces should still format correctly`() {
        val result = formatPhoneNumber(" 555-867-5309 ")
        assertEquals("(555) 867-5309", result)
    }

}