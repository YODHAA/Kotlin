package com.hsbc.advanceKotlin

fun main(args:Array<String>){

    // var mymap= mapOf<Int,String>(1 to "A",2 to "B") // Immutable ,Fixed

    var mymap = HashMap<Int,String>()

      // HashMap<Int,String>() or  mutableMapOf<Int,String>() or hashMapOf<Int,String>  all are same
     // mutableMapOf() : - >   returns LinkedHashMap 

    mymap.put(1,"A")
    mymap.put(23,"B")

    mymap.replace(1,"Z")

    for(key in mymap.keys){
        println(mymap[key])   //  or write  ${mymap.get(key)}
    }

}
