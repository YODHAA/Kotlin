package Kotlin.Nullability.com.hsbc.basicKotlin

import java.util.*


fun main(args:Array<String>){

    nullability()
    bitrthday()
}

fun bitrthday() {

    println("Enter Year of Birth: ")
    val yearx = readLine()!!.toInt()
    val yeard = Calendar.getInstance().get(Calendar.YEAR)

    val age = yeard - yearx
    println("age: $age")

}

fun nullability() {

    var y:String ? =null
     val len:Int? = y?.length ?: -1
    println(len)

}
