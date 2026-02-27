package Arrays

/**
 * Finds all duplicate numbers in the given array.
 *
 * Each duplicate value is returned only once, even if it appears multiple times.
 * The order of elements in the input array is not guaranteed.
 *
 * Example:
 * Input: [1, 2, 3, 2, 4, 1, 5]
 * Output: [1, 2]
 *
 * @param nums an array of integers that may contain duplicate values
 * @return a list of duplicated numbers (each appears only once)
 */
fun getDuplicates(array: Array<Int>): Array<Int> {
    val seen = mutableSetOf<Int>()
    val dupl = mutableSetOf<Int>()

    for (num in array) {
        if (!seen.add(num)) {  // add() возвращает false если элемент уже есть
            dupl.add(num)
        }
    }

    return dupl.toTypedArray()
}
fun getDuplicates2(array: Array<Int>): Array<Int> {

    val uniq = mutableSetOf<Int>()
    val dupl = mutableSetOf<Int>()

    for (i in array.indices) {
        if (!uniq.contains(array[i])) {
            uniq.add(array[i])
        } else {
            dupl.add(array[i])
        }
    }

    return dupl.toTypedArray()
}