/**
 * Check if string is Palindrome.
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
