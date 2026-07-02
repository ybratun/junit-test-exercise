object DiscountValidator {

    /**
     * Validates a coupon code based on the following rules:
     * 1. Code must not be null or blank.
     * 2. Code must be exactly 3 specific allowed codes (case-insensitive): "SAVE10", "WELCOME20", "FREESHIP".
     * 3. The total cart amount must meet the minimum purchase requirement:
     * - "SAVE10" requires a minimum cart total of $50.00
     * - "WELCOME20" requires a minimum cart total of $100.00
     * - "FREESHIP" requires a minimum cart total of $20.00
     */
    fun validateDiscountCode(code: String?, cartTotal: Double): Boolean {
        // Rule 1: Guard against null or blank codes
        if (code.isNullOrBlank()) {
            return false
        }

        // Standardize the input to uppercase so the check is case-insensitive
        val cleanCode = code.trim().uppercase()

        // Rules 2 & 3: Check the code type and its specific minimum cart requirements
        return when (cleanCode) {
            "SAVE10" -> cartTotal >= 50.0
            "WELCOME20" -> cartTotal >= 100.0
            "FREESHIP" -> cartTotal >= 20.0
            else -> false // Unknown code
        }
    }
}