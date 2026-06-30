object PhoneFormatter {

    /**
     * Formats a 10-digit string into (XXX) XXX-XXXX format.
     * Non-digit characters are ignored.
     * Returns an empty string if the input is invalid or doesn't have exactly 10 digits.
     */
    fun formatPhoneNumber(rawInput: String?): String {
        // 1. Handle null or empty inputs immediately
        if (rawInput.isNullOrBlank()) {
            return "invalid format"
        }

        // 2. Filter out anything that isn't a number (e.g., spaces, dashes, letters)
        val digitsOnly = rawInput.filter { it.isDigit() }

        // 3. Validate that we have exactly 10 digits left
        if (digitsOnly.length > 10) {
            return "the number is more than 10 digits"
        } else if (digitsOnly.length < 10) {
            return "the number is less than 10 digits"
        }

        // 4. Extract parts and format using Kotlin string templates
        val areaCode = digitsOnly.substring(0, 3)
        val prefix = digitsOnly.substring(3, 6)
        val lineNum = digitsOnly.substring(6, 10)

        return "($areaCode) $prefix-$lineNum"
    }
}