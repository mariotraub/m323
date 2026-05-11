package aufg1

fun calculateScore(word: String): Int {
    var score = 0
    for (c in word.toCharArray()) {
        if (c != 'a') {
            score++
        }
    }
    return score
}

fun wordScore(word: String): Int {
    return word.filter { it != 'a'}.length
}

fun main() {
}
