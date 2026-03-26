fun main() {
    print("Enter your points: ")
    val points = 450

    if (points in 0..100) {
        println("You do not qualify")
    } 
    else if (points in 101..400) {
        println("You win a Smartphone")
    } 
    else if (points in 401..1000) {
        println("You win a Laptop")
    } 
    else if (points > 1000) {
        println("You win a Trip to Canada")
    } 
    else {
        println("Invalid input")
    }
}