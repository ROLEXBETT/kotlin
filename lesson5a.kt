class Person{
    // Attributes/characteristics/ properties of a person
    var name = "James"
    var age = 45
    var color = "dark"
    var height = 6

    //Behaviourss/actions/doables
    fun walk(){
        println("The person can walk")
    }

    fun speak(){
        println("The person can speak...")
    }

    fun sing(){
        println("The person can sing...")
    }
}

fun main (){
    //Objects is a real world thing
    // An object is intanciated/created/obtained from class
    //For us to be able to either access the properties /behaviours of a class we require to have an object

    //below we create an object
    var myObject = Person()

    //below we use the dot separator to access either the function or the properties
    myObject.walk()

    println("the age of the person is: " + myObject.age)

    

}

