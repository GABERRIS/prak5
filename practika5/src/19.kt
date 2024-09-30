fun main() {
    // Массив, который нужно отсортировать
    val numbers = arrayOf(52, 18, 93, 27, 45)

    // Сортировка массива методом пузырька
    for (i in 0 until numbers.size - 1) {
        // Сравнение соседних элементов
        for (j in 0 until numbers.size - i - 1) {
            // Если текущий элемент больше следующего, меняем их местами
            if (numbers[j] > numbers[j + 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    // Вывод отсортированного массива
    println("Отсортированный массив: ${numbers.joinToString(", ")}")
}