package com.nurdin.test

fun main() {
    for (i in 1..25){
        if ( i%15 == 0) {
            println("Hello World")}
        else if(i%5 == 0) {
            println("World")}
        else if(i%3 == 0){
            println("Hello")}
        else {
            println(i)
        }

    }
}