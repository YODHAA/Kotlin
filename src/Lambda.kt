package Kotlin.Lambdas

fun main(args:Array<String>){

    val pro:(Int,Int)->Int={x,y -> x*y}
    println("3*4 is ${pro(3,2)}")

    val num= listOf(7,8,9,10,2,3,178)
//    val n=num.count({x-> x>5})
//    or
    val n=num.count{it>5}
    println("Count : "+n)


}
