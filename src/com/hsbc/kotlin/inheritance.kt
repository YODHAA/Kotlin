package com.hsbc.kotlin

fun main(args:Array<String>){

    var dog=Dog()
    dog.breed="labra"
    dog.color="black"
    dog.bark()
    dog.eat()
    print(dog.color)

    var animal=Animal()
    animal.color="White"
    animal.eat()

  }

open class Animal {
    open var color:String =" "

   open fun eat(){
        println("Animal EAT")
    }
}

class Dog :Animal(){
    var breed: String =""
    override  var color:String ="Black"
    fun bark(){
        println("Dog Bark")
    }
   override fun eat(){
       super<Animal>.eat()
      println(" Dog Eat")
    }
}

class cat:Animal(){
    var age:Int =-1
    fun meow(){
        println("CAt Meow")
    }
    override fun eat(){
        super.eat()
        println(" CAT Eat")
    }

}
