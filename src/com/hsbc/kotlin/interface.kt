package com.hsbc.kotlin

fun main(args:Array<String>){

   // var obj = MyInterface       // you cannot create an interface on an instance
     var x=Button()
     x.onTouch()
    x.onclick()

}

interface MyInterface  {
      var name:String         // Properties in interface are abstract by default

    abstract fun onTouch()   // No body for abtract function and abstract are open in nature

    fun onclick(){           // Normal Method are public and open by default NOT FINAL
          println("MyInteface  :Onclick  method call ")
    }
}

interface MySecondInterafce{

    fun onTouch(){
        println("MySecondInteface  :Ontouch  method call ")
    }

    fun onclick(){
        println("MySecondInteface  :Onclick  method call ")
    }
}

class Button : MyInterface,MySecondInterafce {

   override var name:String="XYZ"

    override fun onTouch() {
       super.onTouch()                   // MySecondInterface method called as MyInterface method is abstract while its normal
    }

    override fun onclick() {
        super<MySecondInterafce>.onclick()        // or overide it with own logic here
    }

}
