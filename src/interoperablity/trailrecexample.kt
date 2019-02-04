package interoperablity

import java.math.BigInteger

fun main(args: Array<String>) {

    println("Fib Valus is " + fibonic(10000, BigInteger("1"), BigInteger("0")))

}


tailrec fun fibonic(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    if (n == 0)
        return b
    else
        return fibonic(n - 1, a + b, a);

}