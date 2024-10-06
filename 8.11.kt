fun evaluateEquation(equation: String): Int {
    val parts = equation.split("+")
    return parts[0].toInt() + parts[1].toInt()
}