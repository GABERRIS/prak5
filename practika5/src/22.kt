import kotlin.random.Random

fun main() {
    // Генерируем случайное число от 1 до 100
    val secretNumber = Random.nextInt(1, 101)

    println("Добро пожаловать в игру 'Угадай число'!")
    println("Я загадал число от 1 до 100. Попробуй угадать его.")

    var guesses = 0 // Инициализируем счетчик попыток
    var guessed = false // Инициализируем флаг, указывающий на правильный ответ

    while (!guessed) {
        println("Введите ваше число: ")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Пожалуйста, введите корректное число.")
            continue
        }

        guesses++ // Увеличиваем счетчик попыток

        if (guess < secretNumber) {
            println("Слишком мало! Попробуй еще раз.")
        } else if (guess > secretNumber) {
            println("Слишком много! Попробуй еще раз.")
        } else {
            guessed = true // Устанавливаем флаг в true, если число угадано
            println("Правильно! Ты угадал число за $guesses попыток.")
        }
    }
}