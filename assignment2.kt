// 1. Using if statements or when statement, create a program to find if given year is leap or not 2. Using if statements check if a given number is ODD or Even
//  // Research on the looping structures in kotlin, how to create an array in kotlin

fun main() {
    val year = 2024

    if (year % 400 == 0) {
        println("$year is a leap year.")
    } else if (year % 100 == 0) {
        println("$year is not a leap year.")
    } else if (year % 4 == 0) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}

fun main() {
    val year = 2026
    
    when {
        year % 400 == 0 -> println("$year is a leap year.")
        year % 100 == 0 -> println("$year is not a leap year.")
        year % 4 == 0 -> println("$year is a leap year.")
        else -> println("$year is not a leap year.")
    }
}

fun main() {
    val number = 7

    if (number % 2 == 0) {
        println("$number is Even")
    } else {
        println("$number is Odd")
    }
}

fun main() {
    val number = 7

    when (number % 2) {
        0 -> println("$number is Even")
        else -> println("$number is Odd")
    }
}