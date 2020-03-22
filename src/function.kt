package Kotlin.Function

fun say(){
    println("Hello Saurabh")
}

fun triple(x:Int):Int {
    return x*3
}

fun solve(a:Double,b:Double,c:Double): Pair<Double,Double>{
    fun cal():Double{
        return b*b - 4*a*c
    }

    val root=Math.sqrt(cal())
    return Pair( (-b+root)/(2*a) , (-b-root)/(2*a))
}
