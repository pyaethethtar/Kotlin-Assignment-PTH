package com.example.kotlinassignmentpth

import java.util.*

fun main(){

    val scanner = Scanner(System.`in`)

    do {
        print("Please enter palindrome number: ")
        var input = scanner.next()

        var output : String = ""
        for (i in input.length - 1 downTo 0) {
            output = output + input.get(i)
        }

        if (input.equals(output)) {
            println("The text you entered is Palindrome and you pass the test.")
        } else {
            println("You fail!, Please try with other text...")
        }
    }while (!(input.equals(output)))

}