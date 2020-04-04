import java.math.BigInteger

fun main(args:Array<String>){

    println(fib(5,BigInteger("1"),BigInteger("0")))
}

fun fib(n:Int , a:BigInteger,b:BigInteger): BigInteger{

    if(n==0)
        return b
    else{
        return fib(n-1,a+b,a)
    }
}