package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    //var myset= setOf<Int>(2,30,4,-5,6,7,8,99) // immutable read only , unique element

    var myset = mutableSetOf<Int>(1,1,1,2,3,4,4,5)      // in sequence output is printed not in hashSetOf()

    myset.remove(4)
    myset.add(100)

    for(element in myset){
        println(element)
    }

}
