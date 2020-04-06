package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    // Array Tutorials

    // Mutable and Fixed size
    var myArray = Array<Int>(5){0}  // size of 5 with the each element set to '0'

    for(element in myArray){
        println(element)
    }

    for (index in 0..myArray.size-1){
        println(myArray[index])
    }
}
