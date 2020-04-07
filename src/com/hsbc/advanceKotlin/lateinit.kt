package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val c=Country()

    c.name="india"
    println(c.name)
    c.setup()
}

class Country {

    lateinit var name:String // initialse before use

    fun setup(){
        name="THINA"
        println("$name")
    }
}

// lateinit used with var mutable data type
// used with non-nullable data type
// initialise before use
