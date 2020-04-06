package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val program = Program()

    program.addTwoNumbers(2,7)

    program.addTwoNumbers(2,7,object :MyInterface{
        override fun execute(sum: Int) {
           println("Sum by Inteface: "+sum)
        }
    })

    val myLambda:(Int) -> Unit = {s:Int -> println(s)}

    program.addTwoNumbers(2,7,myLambda)
},

interface MyInterface{

    fun execute(sum:Int)
}

class Program {


    fun addTwoNumbers(a:Int , b:Int, action: (Int)-> Unit) {      // Lambda Expression
        val sum=a+b
         action(sum)              // sum ----> s
    }


    fun addTwoNumbers(a:Int , b:Int,action: MyInterface) { // using Interface way to call in OOP's
        val sum=a+b
        action.execute(sum)
        //println(sum)
    }

    fun addTwoNumbers(a:Int , b:Int) {      // simple way call
        val sum=a+b
       // println(sum)
    }
}
