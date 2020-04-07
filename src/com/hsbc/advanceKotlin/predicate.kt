package com.hsbc.advanceKotlin

fun main(args:Array<String>){


    val nums= listOf(2,3,4,5,6,7)

    val check=nums.all { x ->x>2 } // are all the elements greater than 2

    val check2=nums.any { x->x>4 }  // does any of the predicate satisfy the condition

    val count= nums.count{x-> x>4}

    val count2= nums.find{x-> x>4}

    println(check)
    println(check2)
    println(count)
    println(count2)

}
