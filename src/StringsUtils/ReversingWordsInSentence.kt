package StringsUtils

/**
 * Reverses the order of words in a sentence.
 *
 * Words in the sentence are separated by single spaces.
 * There are no leading, trailing, or extra spaces.
 *
 * Example:
 * Input: "Hello world Kotlin"
 * Output: "Kotlin world Hello"
 *
 * @param text input sentence
 * @return sentence with reversed word order
 */
fun reversingWordsInSentence(str: String): String {
    return str.split(" ").reversed().joinToString(" ")
}

fun reversingWordsInSentence2(str: String): String {
    val words = str.split(" ")
    val sb = StringBuilder()

    for (word in words.asReversed()) {
        sb.append(word).append(" ")
    }
    return sb.trim().toString()
}