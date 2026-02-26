/**
 * Compress String
 */
fun compressString(str: String): String {
    val sb = StringBuilder()
    var count = 1

    for (i in 1 until str.length) {
        if (str[i] == str[i - 1]) {
            count++
        } else {
            sb.append(str[i - 1]).append(count)
            count = 1
        }
    }
    sb.append(str.last()).append(count) // добавляем последнюю группу

    return if (sb.length < str.length) sb.toString() else str
}

fun compressString2(str: String): String {
    val sb = StringBuilder()
    var last: Char? = null
    var count = 0
    val maxLength = str.length

    for (index in 0..<maxLength) {
        if (index == 0) {
            last = str[index]
            count++
        } else if (index == maxLength - 1) {
            if (str[index] == last) {
                count++
                sb.append(last).append(count)
            } else {
                sb.append(last).append(count)
                sb.append(str[index]).append(1)
            }
        } else {
            if (str[index] == last) {
                count++
            } else {
                sb.append(last).append(count)
                count = 1
                last = str[index]
            }
        }
    }

    return if (sb.count() < str.length) {
        sb.toString()
    } else {
        str
    }

}