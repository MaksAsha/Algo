package StringsUtils

import kotlin.text.iterator

/**
 * Finds the index of the first non-repeating character in a string.
 *
 * A non-repeating character is a character that appears exactly once
 * in the given string.
 *
 * Example:
 * Input: "leetcode"
 * Output: 0
 *
 * Input: "aabb"
 * Output: -1
 *
 * @param text input string to analyze
 * @return index of the first unique character, or -1 if none exists
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
