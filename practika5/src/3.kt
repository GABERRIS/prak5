fun main() {
    // Запрашиваем у пользователя число N
    print("Введите число N: ")
    val n = readLine()!!.toInt()

    // Проверяем, что N больше 0
    if (n <= 0) {
        println("Число N должно быть больше 0.")
        return
    }

    // Используем цикл for, чтобы просуммировать числа от 1 до N
    var sum = 0
    for (i in 1..n) {
        sum += i
    }

    // Выводим результат
    println("Сумма чисел от 1 до $n равна $sum")
}