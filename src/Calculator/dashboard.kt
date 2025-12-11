package Calculator

/**
 * This is a simple calculator CLI Application
 * its purpose is to do simple Divisions,Addition and Subtraction operations
 * */
fun main(){
    println("Calculator") //title
    println("===============================")
    println("\n")
    println("This is a simple Calculator CLI application.")

    println("Enter Option:" +
            "\n 1. Addition \n" +
            "2. Subtraction\n" +
            "3. Division\n" +
            "4. Exit")
    val input = readln()
    val result = input.toInt()

    println(result)




}

// Function to add 2 numbers
fun add(num1 : Double ,num2 : Double  ) : Double {
    val result =  num1 + num2;
    return result
}

fun sub(num1 : Double ,num2 : Double  ) : Double {
    val result =  num1 -  num2;
    return result
}

fun division(num1 : Double ,num2 : Double  ) : Double {
    val result =  num1 % num2;
    return result
}