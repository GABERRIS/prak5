import kotlin.random.Random

fun main() {
    // Цикл for, который повторяется 10 раз
    for (i in 1..10) {
        // Генерация случайного числа от 1 до 100 (включительно)
        val randomNumber = Random.nextInt(1, 101)
        // Вывод сгенерированного числа
        println("Случайное число $i: $randomNumber")
    }
}