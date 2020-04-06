
package com.hsbc.basicKotlin

data class Person(var name:String, var age:Int){
    init{
        println("my name is $name and my age is $age")
    }
}

fun main (args:Array<String>){

    var h= Person("saurabh", 25)
    h.name="sahil"
    h.age=35
    println("my name is ${h.name} ad age is : ${h.age}")

    var h1= Person("saurabh", 25)
    println(h==h1)

    var h2=h.copy()
    println(h2)
    println(h2==h)

}
