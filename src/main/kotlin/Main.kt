package bot
import java.util.Scanner
val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Glitch", "2023")
    remindName()
    guessAge()
    count()
    test()
    end()
}

fun greet(botName: String, createYear: String) {
    println("Hello! My name is ${botName}.")
    println("I was created in ${createYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = readln()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val mod3 = readln().toInt()
    val mod5 = readln().toInt()
    val mod7 = readln().toInt()
    val age = (mod3 * 70 + mod5 * 21 + mod7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = readln().toInt()
    for (i in 0..num) {
        println("$i!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")

    val a = "1. To repeat a statement multiple times."
    val b = "2. To decompose a program into several small subroutines."
    val c = "3. To determine the execution time of a program."
    val d = "4. To interrupt the execution of a program."

    println("Why do we use methods?")
    println("$a\n$b\n$c\n$d")

    var ans = readln().toInt()

    while (ans != 2) {
        println("Please, try again.")
        ans = readln().toInt()
    }
}

fun end() {
    println("Congratulations, have a nice day!") // Do not change this text
}