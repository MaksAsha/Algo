package Arrays

/**
 * Finds the missing number in an array containing numbers from 1 to n.
 *
 * The array contains all numbers from 1 to n except one missing value.
 * The order of elements is not guaranteed.
 *
 * This method avoids sorting to achieve linear time complexity.
 * It calculates the expected sum using the formula: n * (n + 1) / 2,
 * and compares it with the actual sum of the array elements.
 *
 * Example:
 * Input: [3, 1, 4, 5]
 * Output: 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param nums an array of integers from 1 to n with exactly one missing number
 * @return the missing number in the range from 1 to n
 */
fun findMissingNumber(array: Array<Int>): Int {

    val maxN = array.size + 1
    val sum = maxN * (maxN + 1) / 2
    val res = sum - array.sum()

    return res
}