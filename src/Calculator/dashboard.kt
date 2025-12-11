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



    do {
        println("Enter Option:\n" +
                "1. Addition \n" +
                "2. Subtraction\n" +
                "3. Division\n" +
                "4. Exit")
        val input = readln()
        val inp = input.toInt()

        if (inp == 1){
            println("Addition Operations")
            println("================================")
            print("Enter Number 1: ")
            val num1 = readln().toDouble()
            print("Enter Numbers 2: ")
            val num2= readln().toDouble()
            val rst = add(num1,num2)
            println("The result of $num1 + $num2 = $rst")
            Thread.sleep(1000L)
        }else if (inp == 2){
            println("Subtraction Operations")
            println("================================")
            print("Enter Number 1: ")
            val num1 = readln().toDouble()
            print("Enter Numbers 2: ")
            val num2= readln().toDouble()
            val rst = sub(num1,num2)
            println("The result of $num1 - $num2 = $rst")
            Thread.sleep(1000L)
        }
        else if (inp == 3){
            println("Division Operations")
            println("================================")
            print("Enter Number 1: ")
            val num1 = readln().toDouble()
            print("Enter Numbers 2: ")
            val num2= readln().toDouble()
            val rst = division(num1,num2)
            println("The result of $num1 / $num2 = $rst")
            Thread.sleep(1000L)
        }else{

            println("Thank you for using this Calculator!!!")
            Thread.sleep(100L)
        }


    }while (inp != 4)




}

