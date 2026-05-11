package aufg1.t1

fun calculateScore(word: String): Int {
    var score = 0
    for (c in word.toCharArray()) {
        if (c != 'a') {
            score++
        }
    }
    return score
}

fun wordScore(word: String) = word.count { it != 'a' }

fun main() {
}
