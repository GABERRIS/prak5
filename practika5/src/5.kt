import kotlin.math.sqrt

fun main() {
    // Запрашиваем число у пользователя
    print("Введите число: ")
    val number = readLine()!!.toInt()

    // Проверяем, является ли число простым
    if (isPrime(number)) {
        println("$number - простое число.")
    } else {
        println("$number - не простое число.")
    }
}


fun isPrime(number: Int): Boolean {
    // Проверяем, является ли число меньше 2.
    if (number < 2) {
        return false
    }
    // Проверяем, делится ли число на 2.
    if (number == 2) {
        return true
    }
    // Проверяем, делится ли число на 2.
    if (number % 2 == 0) {
        return false
    }
    // Проверяем, делится ли число на нечетные числа до квадратного корня из числа.
    for (i in 3..sqrt(number.toDouble()).toInt() step 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}