import Kotlin.Function.*


fun main(args:Array<String>){
    println("hello World")
    var_decl()
    if_s()
    say()
    println("4*3 is ${triple(55)}")
    println(args)
}

fun if_s() {
   val temp=20
    val feel:String
    if(temp <10)
        feel="cold"
    else if(temp >20)
        feel="warm"
    else
        feel="okk"

    println(" Feel: "+ "$feel")

    for(a in (10 downTo 1))
        print("$a\t")
    val ints= intArrayOf(4,3,2,1,0)
    println()
    for((index,value) in ints.withIndex())
        println("$index \t $value")
    println()
}

fun var_decl() {
    val a=12.3e5
    val b=123456
    var c=64
    println("$a $b $c");

}
