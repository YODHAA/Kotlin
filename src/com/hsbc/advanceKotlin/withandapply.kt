package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    var person=Person()



     with(person){
         age=50
         name="XJKGHQS"
     }

    person.apply {               // it returns a reciever and can calls Class other methods
        age=50
        name="XJKGHQS"
    }.startRun()

    println("Name: ${person.name} and Age: ${person.age}")

}

class Person {
     var name:String=""
     var age:Int= -1

    fun startRun(){
        println("now I am ready To Run...")
    }

}
