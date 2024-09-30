fun main() {
    // Запрашиваем у пользователя число
    print("Введите число: ")
    val number = readLine()!!.toInt()

    // Проверяем, что число неотрицательное
    if (number < 0) {
        println("Факториал не определен для отрицательных чисел.")
    } else {
        // Вычисляем факториал
        val factorial = factorial(number)

        // Выводим результат
        println("Факториал $number равен $factorial")
    }
}

// Рекурсивная функция для вычисления факториала
fun factorial(n: Int): Long {
    // Базовый случай: факториал 0 равен 1
    if (n == 0) {
        return 1
    } else {
        // Рекурсивный шаг: факториал n равен n  факториал (n-1)
        return n * factorial(n - 1)
    }
}