package Arrays

/**
 * Finds two indices of numbers in the array that add up to the target value.
 *
 * It is guaranteed that exactly one valid solution exists.
 * Each element can be used only once.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 *
 * @param nums an array of integers
 * @param target the target sum
 * @return an array containing the indices of the two numbers
 */
//Complexity O(n)
fun getIndexFromArray(array: Array<Int>, target: Int): Pair<Int, Int> {
    val map = hashMapOf<Int, Int>()

    for (i in array.indices) {
        val v = target - array[i]
        if (!map.containsKey(v)) {
            map[array[i]] = i
        } else {
            val i1 = map[v]!!
            return Pair(i1, i)
        }
    }
    return Pair(-1, -1)
}

//Complexity O(n²)
fun getIndexFromArray2(array: Array<Int>, target: Int): Pair<Int, Int> {
    val len = array.size

    for (i in 0 until len) {
        for (j in i + 1 until len) {
            if (array[i] + array[j] == target) {
                return Pair(i, j)
            }
        }
    }
    return Pair(-1, -1)
}