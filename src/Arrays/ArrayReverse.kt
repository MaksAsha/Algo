package Arrays

/**
 * Reverses the given array in place.
 *
 * This method modifies the original array without creating a new one.
 * It does not use built-in reverse utilities.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: [5, 4, 3, 2, 1]
 *
 * Input: [1, 2, 3, 4]
 * Output: [4, 3, 2, 1]
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param nums the array to be reversed
 */
fun reverseArray2(array: Array<Int>): Array<Int> {
    val count = array.size / 2

    for (i in 0 until count) {
        val temp = array[i]
        array[i] = array[(array.size - i - 1)]
        array[array.size - i - 1] = temp
    }

    return array
}

fun reverseArray(array: Array<Int>): Array<Int> {
    var left = 0
    var right = array.size - 1

    while (left < right) {
        val temp = array[left]
        array[left] = array[right]
        array[right] = temp
        left++
        right--
    }

    return array
}