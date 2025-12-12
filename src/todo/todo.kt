package todo

import java.io.File
import javax.swing.JOptionPane

/*
Simple Todol List**/


fun main() {
    println("Todo App") //title
    println("===============================")
    println("This is a simple TODO CLI application.")

    do {
        println("Enter Option:\n" +
                "1. View Todos \n" +
                "2. Add A Task\n" +
                "3. Remove a Task\n" +
                "4. Exit")
        val input = readln()
        val inp = input.toInt()


        val file  = File("todo_list.txt")

        when (inp){
            1 ->{
                try {
                    val todoTasks : String = file.readText()
                    println(todoTasks)
                }catch (e : Exception){
//                    JOptionPane.showMessageDialog(null,e.message)
                    println("Failed to display Tasks: ${e.message}")
                }

            }
            2->{
                if (!file.exists()){
                    println("File not found!")
                    println("Creating an empty file now. Try again!")
                    file.createNewFile()
                }else{
                print("Type your task: ")
                val taskName : String = readln()
                val countItems = file.readLines().count()
                val plusOne  = countItems + 1
                file.appendText("$plusOne.$taskName \n")
                println("$taskName 🎉")
            }
                }
            3->{
                println("Select the number of the task you want to remove:")
                val rem = readln().toInt() - 1
                val lines = file.readLines()

                val item = lines[rem-1]


//                println(allTask)
                val removeLine = lines.filterIndexed{ index, _ -> index+1 != rem }
//                lines.forEachIndexed{index,task ->
//                    val i: Int  = 1 + index
//                    println("$i.$task")
//                }

                file.writeText(removeLine.joinToString("\n"))


                println("Item $item has been removed ✅ successfully")


            }
        }



    }while (inp != 4)


}
