fun main() {
    // Ввод десятичного числа от пользователя
    print("Введите целое число: ")
    val decimalNumber = readLine()!!.toInt()

    // Вызов функции для конвертации в двоичную систему
    val binaryNumber = decimalToBinary(decimalNumber)

    // Вывод двоичного представления числа
    println("$decimalNumber в двоичной системе: $binaryNumber")
}

// Функция для конвертации десятичного числа в двоичную систему
fun decimalToBinary(decimal: Int): String {
    // Проверка, является ли число отрицательным
    val isNegative = decimal < 0
    // Если число отрицательное, конвертируем его модуль
    val absoluteDecimal = if (isNegative) -decimal else decimal

    // Строка для хранения двоичного представления числа
    var binary = ""

    // Повторяем цикл, пока число не станет равным 0
    var number = absoluteDecimal
    while (number > 0) {
        // Делим число на 2 и добавляем остаток к началу строки
        binary = (number % 2).toString() + binary
        // Делим число на 2 (целочисленное деление)
        number /= 2
    }

    // Если исходное число было отрицательным, дополняем двоичное представление до двух
    if (isNegative) {
        binary = twosComplement(binary)
    }

    // Возвращаем двоичное представление числа
    return binary
}

// Функция для вычисления дополнения до двух
fun twosComplement(binary: String): String {
    // Инвертируем биты в строке
    val inverted = binary.map { if (it == '0') '1' else '0' }.joinToString("")

    // Добавляем единицу к инвертированному числу
    var carry = 1
    val result = inverted.reversed().mapIndexed { index, bit ->
        if (bit == '1' && carry == 1) {
            '0'
        } else if (bit == '0' && carry == 1) {
            '1'
        } else {
            bit
        }
    }.reversed().joinToString("")

    // Возвращаем результат
    return result
}