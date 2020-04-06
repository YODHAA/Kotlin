package com.hsbc.mediumKotlin

abstract class Person1{     // you cannot create instance of abstract class
      abstract var name:String
     abstract fun eat()             // abstract properties are open by default
    open fun getHeight(){
                              // A open function ready to be overridden
    }
    fun gotSchool(){}           // A normal function : public and final by default
}

class Indian1 :Person1(){
    override var name:String="Saurabh"
    override fun eat(){

    }
}

interface X {
    var name:String

}
