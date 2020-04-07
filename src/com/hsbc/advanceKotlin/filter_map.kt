package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    val myNumm : List<Int> = listOf(1,2,3,4,4,9)

    val filter_res = myNumm.filter { v -> v<3 }

    for(num in filter_res){
        println(num)
    }

    val map_num = myNumm.map { num -> num *num }

    for(num in map_num){
        println(num)
    }

    var nums=myNumm.filter { v->v <3 }.map { v -> v*v }

    for(num in nums){
        println(num)
    }
    class Person(var age:Int , var name:String){

    }


    var people= listOf<Person>(Person(1,"A"),Person(2,"B"),Person(3,"Z"))
    var names= people.filter { person -> person.name.startsWith("A") }.map { x ->x.name }

    for(num in names){
        println(num)
    }


}
