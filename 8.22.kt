fun isPalindrome(text: String): Boolean {
    val cleanedText = text.lowercase().replace(" ", "")
    return cleanedText == cleanedText.reversed()
}
