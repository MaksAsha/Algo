package Arrays

/**
 * Prints numbers from 1 to n following the FizzBuzz rules.
 *
 * For each number in the range:
 * - Prints "Fizz" if the number is divisible by 3
 * - Prints "Buzz" if the number is divisible by 5
 * - Prints "FizzBuzz" if the number is divisible by both 3 and 5
 * - Otherwise, prints the number itself
 *
 * Example:
 * Input: 15
 * Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 *
 * @param n the upper bound of the sequence (inclusive)
 */
fun showFizzBuzz(num: Int) {
    for (i in 1..num) {
        when {
            i % 15 == 0 -> { print("FizzBuzz") }
            i % 3 == 0 -> { print("Fizz") }
            i % 5 == 0 -> { print("Buzz") }
            else -> { print(i) }
        }

        if (i != num) {
            print(", ")
        }
    }
}
