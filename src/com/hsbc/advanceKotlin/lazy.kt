package com.hsbc.advanceKotlin

val pi:Float ? by lazy {
    3.14f
}

fun main(args:Array<String>){

    println("A")

    val x=pi*2*3   // loaded in cache once used

    println("B")
}
