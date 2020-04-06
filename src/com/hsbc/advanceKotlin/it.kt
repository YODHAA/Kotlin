package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val program=Program4()

    program.reverse("hello") { it.reversed()}    // for one parameter

}

class Program4 {

    fun reverse(str:String,myFunc:(String) -> String){

         var x=myFunc(str)
        println(x)
    }

}
