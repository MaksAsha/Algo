/**
 * Get first non-repeatable character.
 */
fun getFirstNonRepeatableSymbol(str: String): Int {
    val map = mutableMapOf<Char, Int>()

    for (char in str) {
        map[char] = map.getOrDefault(char, 0) + 1
    }

    for (i in str.indices) {
        if (map[str[i]] == 1) {
            return i
        }
    }
    return -1
}
