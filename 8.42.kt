
fun findFirstIndex(array: IntArray, element: Int): Int {
    for (i in array.indices) {
        if (array[i] == element) {
            return i
        }
    }
    return -1
}