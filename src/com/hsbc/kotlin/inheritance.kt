package com.hsbc.kotlin

fun main(args:Array<String>){

    var dog=Dog("black","pug")
    print(dog.color)


  }

open class Animal {
    // super
    var color:String=" "

    constructor(color: String){
        this.color=color
        println(" From Animal : $color")
    }
}

class Dog:Animal{

      var breed:String="Red"
    // derived

    constructor(color: String , breed:String): super(color){
        this.breed=breed
        println(" From Dog :  $color and $breed")
    }
}


