package com.nurdin.test

import java.util.*

fun main(strings: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Masukkan String : ")
    val inputString: String = scanner.nextLine()

    if (palingdrome(inputString)) {
        println("$inputString adalah Palingdrome")
    } else {
        println("$inputString Bukan Palingdrome")
    }
}

fun palingdrome(inputStr: String): Boolean {
    val string = StringBuilder(inputStr)
    val reverseStr = string.reverse().toString()

    return inputStr.equals(reverseStr, ignoreCase = true)
}
