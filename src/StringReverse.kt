/**
 * String reverse.
 */
fun stringReverse(str: String): String {
    val sb = StringBuilder()
    val len = str.length
    for(i in 0..< len) {
        sb.append(str[len - 1 - i])
    }
    return sb.toString()
}

/**
 * String reversed. Optimized by memory O(1) instead of O(2)
 */
fun stringReverse2(str: String): String {
    val chars = str.toCharArray()
    var left = 0
    var right = chars.size - 1
    while (left < right) {
        val temp = chars[left]
        chars[left] = chars[right]
        chars[right] = temp
        left++
        right--
    }
    return String(chars)
}