object PasswordValidator {

    /**
     * Validates a password based on security requirements:
     * 1. Must be at least 8 characters long.
     * 2. Cannot be null.
     * 3. Must contain at least one digit (0-9).
     * 4. Must contain at least one uppercase letter.
     */
    fun isValidPassword(password: String?): Boolean {
        // Edge case: handle null input safely using Kotlin's smart casting
        if (password == null) {
            return false
        }

        // Rule 1: Check length
        if (password.length < 8) {
            return false
        }

        var hasDigit = false
        var hasUppercase = false

        // Loop through characters using Kotlin's standard library character checks
        for (ch in password) {
            if (ch.isDigit()) {
                hasDigit = true
            } else if (ch.isUpperCase()) {
                hasUppercase = true
            }

            // Optimization: Stop checking early if both conditions are met
            if (hasDigit && hasUppercase) {
                return true
            }
        }

        return false
    }
}