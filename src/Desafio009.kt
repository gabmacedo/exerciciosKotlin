fun fibonacci(n: Int) {
    var a = 1
    var b = 1

    print("Fibonacci($n): $a >> $b")

    for (i in 3..n) {
        val proximo = a + b
        print(" >> $proximo")
        a = b
        b = proximo
    }
    println(" >> FIM")
}

fun main() {
    print("Quantos termos da sequência Fibonacci deseja ver? ")
    val termos = readln().toInt()
    fibonacci(termos)
}
