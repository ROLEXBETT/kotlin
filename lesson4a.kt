fun main() {
    // Functions  they are block of statements that perform a given task
    //it is introduced by the use of the fun keyword followed by the name of the function ,parenthesis and the body of the function come last which is intoduced by the use of the curly braces
    fun sayHello (){
        println("Hello there, Hope you are having a good day?")
    }
    //below we invoke/call our function 
    sayHello()


    println("======================")
    
    fun main() {
    // This is the invocation (calling the function)
    greetUser("Adventurer")
}

// This is the function definition
fun greetUser(name: String) {
    println("Hello, $name! Welcome to Kotlin.")
}
}