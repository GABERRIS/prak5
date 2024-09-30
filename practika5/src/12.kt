import java.util.Scanner

fun main() {
    // Создаем объект Scanner для считывания ввода с консоли
    val scanner = Scanner(System.`in`)

    // Запрашиваем у пользователя начальное число
    print("Введите начальное число: ")
    val startNumber = scanner.nextInt()

    // Запрашиваем у пользователя шаг последовательности
    print("Введите шаг: ")
    val step = scanner.nextInt()

    // Запрашиваем у пользователя количество элементов в последовательности
    print("Введите количество элементов: ")
    val count = scanner.nextInt()

    // Выводим заголовок
    println("Числовая последовательность:")

    // Генерируем последовательность и выводим ее
    var currentNumber = startNumber
    for (i in 1..count) {
        print("$currentNumber ")
        currentNumber += step
    }
    println()
}