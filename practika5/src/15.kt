

fun main() {
    // Запрашиваем у пользователя строку
    println("Введите строку:")
    val inputString = readLine()!!

    // Проверяем, является ли строка палиндромом
    if (isPalindrome(inputString)) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
}

fun isPalindrome(str: String): Boolean {
    // Удаляем пробелы и приводим строку к нижнему регистру
    val cleanedString = str.replace(" ", "").toLowerCase()

    // Сравниваем строку с её обращением
    return cleanedString == cleanedString.reversed()
}