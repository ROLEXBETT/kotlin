fun main() {
    // for loop  -> it is used to execute a block of code / statements a number of times till a condition is met

    for(number  in 1..10){
        println("The count is : $number")
    }

    println("======================")

    //create a for loop 

    
        for (number in 50..65)
        println("count : $number")

         println("======================")
    
        //research on how to implement on the for loop by use of steps
        for (x in 20..40 step  2){
            println(x)
        }

    println("======================")
    //below we find the odd number in the given range
     for (x in 20..40){
        if (x %2 !=0){
            println(x)
        }
     }
      println("======================")

     //by use of a for loop , generate the multiplication table for 5 from 1 to 5.
    
    val number = 5

    for (i in 1..5) {
        println("$number x $i = ${number * i} ")
    }
     println("======================")

     for (a in 1..5) {
        val prod = a * 5
        println("5 * $a = $prod")
    }

    println("======================")
    //create a program that is able to find the factorial of number 5
    var factorial = 1

    for (i in 1..5){
        val number = 5

        factorial *= i 
        println("Factorial of 5 is $factorial")
    }
}

//check on the difference btw local variables and global variables