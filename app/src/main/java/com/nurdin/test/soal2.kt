package com.nurdin.test

import java.util.regex.Pattern.compile

fun main() {
    val myEmail = "nurdin27muhammad@gmail.co.id"
    val otherEmail = "nurdin.com"
    val anotherEmail = "nurdin@gmail.com"
    val emailRegex = compile(
        "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,20}" + "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,15}" +
                "(" + "\\." + "[co.id][a-zA-Z0-9\\-]" + ")+"
    )

    val isMyEmailValid = emailRegex.matcher(myEmail).matches()
    val isOtherEmailValid = emailRegex.matcher(otherEmail).matches()
    val isAnotherEmailValid = emailRegex.matcher(otherEmail).matches()

    println("Email $myEmail is $isMyEmailValid")
    println("Email $otherEmail is $isOtherEmailValid")
    println("Email $anotherEmail is $isAnotherEmailValid")
}