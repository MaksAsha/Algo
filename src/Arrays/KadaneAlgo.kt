package Arrays

/**
 * Finds the maximum sum of a contiguous subarray using Kadane's Algorithm.
 *
 * The input array may contain both positive and negative numbers.
 * The subarray must be continuous and contain at least one element.
 *
 * Example:
 * Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: The subarray [4, -1, 2, 1] has the maximum sum = 6.
 *
 * @param nums an array of integers (may contain negative values)
 * @return the maximum sum of any contiguous subarray
 * @throws IllegalArgumentException if the array is empty
 */
fun getMaxSum(array: Array<Int>): Int {
    var currentSum = array[0]
    var maxSum = array[0]

    for (i in 1 until array.size) {
        currentSum = maxOf(array[i], currentSum + array[i])
        maxSum = maxOf(maxSum, currentSum)
        println("$currentSum $maxSum")
    }
    return maxSum
}
