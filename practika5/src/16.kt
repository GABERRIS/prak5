fun main() {
    // Ввод начального и конечного значений
    val i = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    // Инициализация суммы квадратов
    var sumOfSquares = 0

    // Цикл от I до N
    for (j in i..n) {
        // Квадрат текущего числа
        val square = j * j

                // Добавление квадрата к сумме
                sumOfSquares += square
    }

    // Вывод суммы квадратов
    println("Сумма квадратов от $i до $n: $sumOfSquares")
}