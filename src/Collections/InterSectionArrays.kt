package Collections

/**
 * Finds the intersection of two arrays.
 *
 * The intersection contains only elements that appear in both arrays.
 * Each element in the result is unique, regardless of how many times
 * it appears in the input arrays.
 *
 * Example:
 * Input: [1, 2, 2, 3, 4], [2, 2, 3, 5]
 * Output: [2, 3]
 *
 * Input: [1, 2, 3], [4, 5, 6]
 * Output: []
 *
 * Input: [1, 1, 1], [1, 1]
 * Output: [1]
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n)
 *
 * @param nums1 the first input array
 * @param nums2 the second input array
 * @return an array containing unique common elements
 */
fun intersect(nums1: IntArray, nums2: IntArray): IntArray {

    val (small, large) =
        if (nums1.size < nums2.size)
            nums1 to nums2
        else
            nums2 to nums1

    val set = large.toHashSet()
    val result = HashSet<Int>()

    for (num in small) {
        if (num in set) {
            result.add(num)
        }
    }

    return result.toIntArray()
}

fun intersect2(nums1: IntArray, nums2: IntArray): IntArray {
    return nums1.toHashSet()
        .intersect(nums2.toHashSet())
        .toIntArray()
}
