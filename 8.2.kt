fun maxMinDifference(list: List<Int>): Int {
    if (list.isEmpty()) {
        return 0
    }
    val max = list.maxOrNull() ?: 0
    val min = list.minOrNull() ?: 0
    return max - min
}
