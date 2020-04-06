package com.hsbc.mediumKotlin

fun main(args:Array<String>){

    var u1=User("Sam",10)
    var u2=User("Sam",10)

    println(u1.toString())

    var u3=u1.copy()

    var u4=u1.copy(name = "Saurabh")     // named Parameter follows here based on name given not the order

    println(u4)

    if(u1==u2)
        println("Equalls")
    else
        println("Not Equalls")
}

data class User(var name:String , var id:Int){

    var x:Int =10   // properties must be initialised or be abstract

}
