package com.hsbc.kotlin

fun main(args:Array<String>){

    var student=Students("Saurabh",10)

    println(student.id)
}

class Students constructor(var _name: String){

    var name:String="dummy"
    var id:Int =-1
    init {
        this.name=_name
        println("Student has got the name as: $name")
    }

    constructor(n: String, id:Int):this(n){
         this.id=id
        // body for the secondary constructor
    }

}
