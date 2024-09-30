fun main() {
    // Запрашиваем у пользователя две строки
    println("Введите первую строку:")
    val str1 = readLine()!!.toLowerCase() // Преобразуем в нижний регистр

    println("Введите вторую строку:")
    val str2 = readLine()!!.toLowerCase() // Преобразуем в нижний регистр

    // Проверяем, являются ли строки анаграммами
    if (anogr(str1, str2)) {
        println("Строки являются анаграммами.")
    } else {
        println("Строки не являются анаграммами.")
    }
}


fun anogr(str1: String, str2: String): Boolean {
    // Проверяем, одинаковой ли длины строки
    if (str1.length != str2.length) {
        return false
    }

    // Создаем два массива символов
    val sim1 = str1.toCharArray()
    val sim2 = str2.toCharArray()

    // Сортируем массивы символов
    sim1.sort()
    sim2.sort()

    // Сравниваем отсортированные массивы
    return sim1.contentEquals(sim2)
}