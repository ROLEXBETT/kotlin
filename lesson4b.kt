fun main() {
    // Below is a function that is able to add two numbers
    fun addition() {
        val number1 =10
        val number2 = 20
        val  sum = number1 + number2

        print("The sum of the numbers is: $sum")
    }
    addition()
    println("======================")
    //create a function that is able to multiply three numbers
     fun multiplication(){
        val num1 = 15
        val num2 = 18
        val num3 = 19
        val product = num1 * num2 * num3

        print("The product of the numbers is: $product")

     }
     multiplication()

     println("======================")

//      // given two numbers create a funvction that is able to find the largest and the smallest of the numbers
//      fun find() {
//     val num1 = 15
//     val num2 = 42

//     // Invoking the functions
//     val max = findLargest(num1, num2)
//     val min = findSmallest(num1, num2)

// }


    println("======================")

    // given 179 minutes, create afunction that is able to convert the said minutes into hours and to show the remainder of the minutes
    fun time() {
        val minutes = 179
        val hours = minutes / 60
        val minutesRemain = minutes % 60

        println("$hours hour(s) $minutesRemain minute(s)")
    }

    fun main() {
        time()
    }
}