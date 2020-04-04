package com.hsbc.kotlin

class TestClass{

    // c d : internal and public in nature
    // a b : private and protected in nature
    fun tetsing(){
        var person=Person()
        println(person.c)
    }
}

open class Person{
    private val a=1
    protected val b=2
    internal val c=3
    val d=10                 // by default public
}

class Indian:Person() {

    // b c d visible here
    fun test(){
        println(d)
    }

}
