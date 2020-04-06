package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val program = Program1()

    val myLambda:(Int,Int) -> Int = {x:Int,y:Int -> x+y}

    program.addTwoNumbers(2,7,myLambda)
}


class Program1 {


    fun addTwoNumbers(a:Int , b:Int, action: (Int,Int)-> Int) {      // Lambda Expression
        val res=action(a,b)          // sum ----> s
        println(res)
    }

}
