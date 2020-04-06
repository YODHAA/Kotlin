package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val program=Program3()

    var res=0
    program.addTwoNumber(2,7){x,y ->res=x+y }
    println(res)
}

class Program3 {

    fun addTwoNumber(a:Int,b:Int,action:(Int,Int)->Unit){

        action(a,b)
    }
}
