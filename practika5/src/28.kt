fun main() {
    // Запрашиваем у пользователя количество чисел
    print("Введите количество чисел: ")
    val n = readLine()!!.toInt()

    // Создаем список для хранения чисел
    val numbers = mutableListOf<Int>()

    // Считываем числа с консоли
    println("Введите $n чисел:")
    for (i in 1..n) {
        print("Число $i: ")
        numbers.add(readLine()!!.toInt())
    }

    // Сортируем список чисел по возрастанию
    numbers.sort()

    // Выводим отсортированные числа
    println("Отсортированные числа:")
    for (number in numbers) {
        print("$number ")
    }
}