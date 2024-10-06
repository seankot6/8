
// 41. Количество гласных в строке
fun countVowels(text: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'y')
    var count = 0
    for (char in text.lowercase()) {
        if (char in vowels) {
            count++
        }
    }
    return count
}
