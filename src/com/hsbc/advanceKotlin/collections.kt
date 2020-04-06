package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    // Array Tutorials

    // Mutable and Fixed size
   // var myArray = Array<Int>(5){0}  // size of 5 with the each element set to '0'

   // var list= listOf<String>("A","B","C")  // Sequential order with Immutable,Fixed Size, Read only

    var list= mutableListOf<String>("A","B","C")
     list.add("Z")

    list.remove("A")

    list[0]="A"

    // list[2]="V"  // Cann't do this

    for(element in list){
        println(element)
    }

    for (index in 0..list.size-1){
        println(list[index])
    }
}
