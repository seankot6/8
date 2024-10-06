fun repeatString(txt: String, n: Int): String {
    if (n == 0) {
        return ""
    }
    return txt + repeatString(txt, n - 1)
}
