//by use of for loop, create an array of 7 counties and loop through them.
//research on functions without parameters in kotlin
//Assignment 1. Create a For loop to print year from 2000 to 2025 2. Create a For loop to print from 100 to 1
//Assignment 1. Create a while loop to print from -20 to +20 2. Create a while loop to print all EVEN years from 2000 to 2025.

fun main() {
    // Create an array of 7 counties
    val counties = arrayOf( "Nairobi", "Mombasa","Kisumu", "Nakuru", "Eldoret", "Nyeri", "Machakos")
    // Loop through the array using a for loop
    for (county in counties) {
        println(county)
    }

     println("======================")
     // Create a For loop to print year from 2000 to 2025
     for (year in 2000..2025) {
        println(year)
     }

     println("======================")
     //Create a For loop to print from 100 to 1
         
    for (num in 100 downTo 1) {
        println(num)
    }

    println("======================")
    // Create a while loop to print from -20 to +20
     var num = -20

    while (num <= 20) {
        println(num)
        num++
    }

    println("======================")
    //Create a while loop to print all EVEN years from 2000 to 2025
     var year = 2000

    while (year <= 2025) {
        if (year % 2 == 0) {
            println(year)
        }
        year++
    }

    println("======================")
    // var year = 2000

    while (year <= 2025) {
        println(year)
        year += 2
    }

}


println("======================")
//research on functions without parameters in kotlin -> A function without parameters is a function that does not take any input values when called.
