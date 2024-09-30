fun main() {
    // Получаем два целых числа от пользователя
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    // Вызываем функцию для вычисления НОД
    val gcd = findGCD(num1, num2)

    // Выводим результат
    println("НОД $num1 и $num2 равен $gcd")
}


fun findGCD(a: Int, b: Int): Int {
    // Базовый случай: если одно из чисел равно 0, НОД равен другому числу
    if (b == 0) {
        return a
    }
    // Рекурсивно вызываем функцию с остатком от деления
    return findGCD(b, a % b)
}