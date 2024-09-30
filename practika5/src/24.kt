fun main() {
    // Определение исходной матрицы
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

    // Вывод исходной матрицы
    println("Исходная матрица:")
    printMatrix(matrix)

    // Транспонирование матрицы
    val transposedMatrix = transpose(matrix)

    // Вывод транспонированной матрицы
    println("\nТранспонированная матрица:")
    printMatrix(transposedMatrix)
}

// Функция для транспонирования матрицы
fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    // Определение размеров исходной матрицы
    val rows = matrix.size
    val cols = matrix[0].size

    // Создание новой матрицы с переставленными размерами
    val transposed = Array(cols) { IntArray(rows) }

    // Перестановка элементов матрицы
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            transposed[j][i] = matrix[i][j]
        }
    }

    // Возврат транспонированной матрицы
    return transposed
}

// Функция для вывода матрицы на экран
fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        for (element in row) {
            print("$element ")
        }
        println()
    }
}