fun main() {
    println(
        "Hello! My name is DICT_Bot.\n" +
                "Please, remind me your name."
    )
    val name = readln()
    println("What a great name you have, $name!")
    println(
        "Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7."
    )
    val remainder3 = readln().toInt()
    val remainder5 = readln().toInt()
    val remainder7 = readln().toInt()
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println("Your age is $age!")
    println("Now I will prove to you that I can count to any number you want.")
    val n = readln().toInt()
    for (i in 0..n + 1) {
        println("$i!")
        if (i == n) break
    }
    println(
        "Let's test your programming knowledge.\n" +
                "Why do we use methods?\n" +
                "1. To repeat a statement multiple times.\n" +
                "2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n" +
                "4. To interrupt the execution of a program."
    )
    while(true){
        val answer = readln().toInt()
        if (answer == 2) {
            println(
                "Completed, have a nice day!\n" +
                        "Congratulations, have a nice day!"
            )
            break
        }else{
            println("Please, try again.")
        }
    }
}