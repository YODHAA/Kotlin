// make a common class file for Kotlin methods
@file:JvmName("MyCustomKotlinFileName")

package com.hsbc.kotlin

import com.hsbc.java.first

fun main(args:Array<String>){

    var area= first.getArea(3,5)
    System.out.println("Area: "+area)

    // named parameters in kotlin
    var vol= volume(b=4,l=5)
    System.out.println("Voume: "+vol)
}

// java call form here method
fun add(a:Int,b:Int):Int {
    return a+b
}


// for remote java calls for not having one parameter
@JvmOverloads
fun volume(l:Int , b: Int , h:Int=10):Int{
    return l*b*h
}
