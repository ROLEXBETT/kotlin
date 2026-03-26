fun main(args: Array<String>) {
    // Arrays
    // An array is a collection of items that are related  in nature
    // To access an item of an array we use the index starting from index zero
    // To create an array ,we use the arrayOf function/method

    val numbers = arrayOf(25,54, 54, 32, 74, 31)

    println(numbers.contentToString())
    // accessing items of an array by use of index
    println("item on index three is : " + numbers[3])
}

