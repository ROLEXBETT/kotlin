// Create a function that accepts parameter that is able to do the convertion of degree celcius into farenhe... 
// Create a function that is able to calculate the compound interest of a person.
// Research on inherintance in kotlin. Come up with an example of a program


fun convertCelsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}

fun main() {
    val tempCelsius = 25.0
    val tempFahrenheit = convertCelsiusToFahrenheit(tempCelsius)

    println("$tempCelsius°C is equal to $tempFahrenheit°F")
}

print("======================")

fun calculateCompoundInterest(
    principal: Double,
    rate: Double,
    time: Double,
    n: Int
): Double {
    return principal * Math.pow((1 + rate / n), (n * time))
}

fun main() {
    val principal = 10000.0   // initial amount
    val rate = 0.05          // 5% interest
    val time = 2.0           // 2 years
    val n = 4                // compounded quarterly

    val amount = calculateCompoundInterest(principal, rate, time, n)

    println("Final Amount: $amount")
}

print("======================")
//Inheritance is a concept where one class (child/subclass) can inherit properties and functions from another class (parent/superclass).

//Important Rules in Kotlin:
// Classes are final by default (cannot be inherited)
// Use the keyword open to allow inheritance
// Use : to inherit a class
// Use override to change parent behavior
// It helps you reuse code and organize programs better.


// Parent class
open class Animal {
    open fun makeSound() {
        println("Animal makes a sound")
    }
}

// Child class
class Dog : Animal() {
    override fun makeSound() {
        println("Dog barks")
    }
}

// Another child class
class Cat : Animal() {
    override fun makeSound() {
        println("Cat meows")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()

    dog.makeSound()
    cat.makeSound()
}