package Collections

/**
 * Groups words that are anagrams of each other.
 *
 * Two words are considered anagrams if they contain the same characters
 * with the same frequency, possibly in a different order.
 *
 * This method groups words by using a sorted version of each word
 * as a key. Words that produce the same key belong to the same group.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * Time Complexity: O(n * k log k), where n is the number of words
 * and k is the average length of a word.
 * Space Complexity: O(n * k)
 *
 * @param words a list of lowercase strings
 * @return a list of groups, where each group contains anagrams
 */
fun groupAnagram(arr: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()

    for (s in arr) {
        val key = s.toCharArray().sorted().joinToString("")
        map.getOrPut(key) { mutableListOf() }.add(s)
    }

    return map.values.toList()
}
