fun findMax(array: IntArray): Int {
    if (array.isEmpty()) {
        return 0
    }
    var max = array[0]
    for (element in array) {
        if (element > max) {
            max = element
        }
    }
    return max
}