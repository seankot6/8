fun findMinMax(array: IntArray): Pair<Int, Int> {
    if (array.isEmpty()) {
        return Pair(0, 0)
    }
    var min = array[0]
    var max = array[0]
    for (element in array) {
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
    }
    return Pair(min, max)
}