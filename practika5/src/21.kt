import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter

fun main() {
    // Получаем год и месяц от пользователя
    println("Введите год:")
    val year = readLine()!!.toInt()
    println("Введите месяц (число от 1 до 12):")
    val month = readLine()!!.toInt()

    // Проверяем корректность введенных данных
    if (month !in 1..12) {
        println("Некорректный номер месяца. Пожалуйста, введите число от 1 до 12.")
        return
    }

    // Создаем объект LocalDate для первого дня месяца
    val startDate = LocalDate.of(year, Month.of(month), 1)

    // Получаем количество дней в месяце
    val daysInMonth = startDate.lengthOfMonth()

    // Выводим все даты в месяце
    println("Даты в месяце:")
    for (day in 1..daysInMonth) {
        val date = LocalDate.of(year, Month.of(month), day)
        // Форматируем дату для вывода
        val formattedDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
        println(formattedDate)
    }
}