//
class Circle{
    //properties
    var radius = 7
    var pie = 3.142

    //Behaviours
    fun circleArea(){
        val areaOfCircle = pie * radius * radius
        println("The area of the circle is: " + areaOfCircle)
    }
    fun circleCircumfrence (){
        val circleCircumfrence = 2 * pie * radius

    println("The circumfrence of the circlr is: " + circleCircumfrence)
    }
}

//create a class for a rectangle and find the area as well as the perimeter of the rectangle
class Rectangle(){
    //properties
    var length = 15
    var width = 13

    //Behaviours
    fun calculateArea(): Double {
        return length * width
    }

    // Function to calculate Perimeter: 2 * (Length + Width)
    fun calculatePerimeter(): Double {
        return 2 * (length + width)
}

}

fun main (){
    //below is our object
    var myCircle = Circle()

    myCircle.circleArea()

    val area = myRectangle.calculateArea()
    val perimeter = myRectangle.calculatePerimeter()

    println("Area: $area")
    println("Perimeter: $perimeter")
}