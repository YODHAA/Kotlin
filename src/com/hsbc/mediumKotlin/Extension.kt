package com.hsbc.mediumKotlin

fun main(args:Array<String>){

    var student=Student()
    println("Pass Status: "+student.hasPassed(57))
    println("Scholarship Status: "+student.isScholar(99))

}

fun Student.isScholar(marks: Int):Boolean{
    return marks>95
}

class Student {

     fun hasPassed(marks:Int):Boolean {

         return marks >40
     }

}
