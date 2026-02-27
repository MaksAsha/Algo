package StringsUtils

/**
 * Checks whether the given string is a palindrome.
 *
 * A string is considered a palindrome if it reads the same
 * forward and backward, ignoring character case.
 *
 * Example:
 * Input: "Level"
 * Output: true
 *
 * @param text input string to check
 * @return true if the string is a palindrome, false otherwise
 */
fun isPalindrome(str: String): Boolean {
    val s = str.lowercase()
    val count = s.length / 2
    val length = s.length

    for (i in 0 until count) {
        if (s[i] != s[length - i - 1] ) {
            return false
        }
    }
    return true
}
