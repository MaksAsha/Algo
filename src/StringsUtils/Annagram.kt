package StringsUtils

/**
 * Checks whether two strings are anagrams of each other.
 *
 * Two strings are considered anagrams if they contain the same characters
 * in the same frequency but in a different order.
 * Character case is ignored.
 *
 * Example:
 * Input: "Listen", "Silent"
 * Output: true
 *
 * @param s1 the first input string
 * @param s2 the second input string
 * @return true if the strings are anagrams, false otherwise
 */
fun isAnagram(s1: String, s2: String): Boolean {
    val map1 = HashMap<Char, Int>()
    val map2 = HashMap<Char, Int>()

    val s11 = s1.lowercase()
    val s22 = s2.lowercase()

    val length1 = s11.length
    val length2 = s22.length

    if (length1 != length2) return false

    for (index1 in 0 until length1) {
        map1[s11[index1]] = map1.getOrDefault(s11[index1], 0) + 1
    }

    for (index2 in 0 until length2) {
        map2[s22[index2]] = map2.getOrDefault(s22[index2], 0) + 1
    }

    if (map1.size != map2.size) return false

    for (key1 in map1.keys) {
        if (map1[key1] != map2[key1]) return false
    }

    return true
}

fun isAnagramImproved(s1: String, s2: String): Boolean {
    val s11 = s1.lowercase()
    val s22 = s2.lowercase()

    if (s11.length != s22.length) return false

    val map = HashMap<Char, Int>()

    for (i in s1.indices) {
        map[s11[i]] = map.getOrDefault(s11[i], 0) + 1
        map[s22[i]] = map.getOrDefault(s22[i], 0) - 1
    }

    return map.values.all { it == 0 }
}
