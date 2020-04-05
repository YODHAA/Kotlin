package com.hsbc.kotlin

fun main(args:Array<String>){

   // var x=Data()
    Data.count=50            // Object class calls like static class in Java
    Data.typeCust()
    println(Data.count)
    Data.myMethod("Saurabh")        // static method called by class name
}

open class MySuperClass {

    open fun myMethod(str:String){
        println("Inside MySupeClass myMethod call: $str")
    }
}

object Data:MySuperClass(){
    var count:Int =-1              // Behave like static variables

    fun typeCust():String {      // Behave like sttaic methods
        return "Indian"
    }

    override fun myMethod(str:String){          // currently behaves like static methods
        super.myMethod(str)
        println("Inside Data class myMethod call: $str")
    }

    init {
        // initilaise your values 
    }
}
