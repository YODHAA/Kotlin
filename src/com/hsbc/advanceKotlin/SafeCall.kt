package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val name:String? = null      // assign null value to var type

    println(name?.length)

    println(name?.let {"($name.length)"})

    println(name?.length ?: -1 )

    println(name!!.length)       // throws the NullPointerException if not Found any value

}
