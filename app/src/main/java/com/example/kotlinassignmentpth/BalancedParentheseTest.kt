package com.example.kotlinassignmentpth

import java.util.*

fun main(){

    var openCurlyCount : Int = 0
    var openSquareCount : Int = 0
    var openRoundCount : Int = 0
    var closeCurlyCount : Int = 0
    var closeSquareCount : Int = 0
    var closeRoundCount : Int = 0
    val scanner = Scanner(System.`in`)

    print("Please enter the parentheses => ")
    val input = scanner.next()

    for (i in input.indices){
        when(input.get(i)){
            '{' -> openCurlyCount++
            '[' -> openSquareCount++
            '(' -> openRoundCount++
            '}' -> closeCurlyCount++
            ']' -> closeSquareCount++
            ')' -> closeRoundCount++
            else -> println("It's not all parentheses!")
        }
    }

    if (openCurlyCount==closeCurlyCount && openSquareCount==closeSquareCount && openRoundCount==closeRoundCount){
        println("It’s balanced. Pair of { = $openCurlyCount, Pair of [ = $openSquareCount, Pair of ( = $openRoundCount")
    }
    else{
        println(" It’s not balanced.")
    }


}