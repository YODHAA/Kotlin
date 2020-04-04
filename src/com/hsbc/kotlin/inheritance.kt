package com.hsbc.kotlin

fun main(args:Array<String>){

    var dog=Dog("black","pug")
    print(dog.color)


  }

open class Animal constructor(color: String) {
    // super
    init {
        println(" From Animal init: $color")
    }
}

class Dog(var color:String , var breed:String) :Animal(color){

    // derived
     init {
         println(" From dog init: $color and $breed")
     }
}


