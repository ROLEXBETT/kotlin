fun main(args: Array<String>) {
    //functions with parameters
    //parameters are inputs that get passed as argumwnts when invokung a function
    //NB : For parameters to work you must specify their data types
    fun greeting (name : String) {
        println("Hello $name , Hope you had a good day?")
    }
    //when the function is invoked ,you pass a given name as an argument
    greeting("Rolex")

    print("======================")
    // Below is an example of a function that is able to calculate the BMI of a person
    fun BMI (weight : Double, height : Double){
        val answer = weight / (height * height)

        println("The BMI of the person is:" + answer)
    }
    BMI(69.5, 1.73)
    BMI(58.7, 1.89)

    print("======================")

    // Create a function that accepts parameters and checks whether a given number is odd or even
    fun checkOddOrEven(number: Int) {
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
    
    checkOddOrEven(7) 
    }
}