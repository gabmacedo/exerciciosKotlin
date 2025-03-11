fun main() {
    var a = 1
    var b = 1

    print("Sequência de Fibonacci: $a $b ")

    for (i in 3..10) {
        val proximo = a + b
        print("$proximo ")
        a = b
        b = proximo
    }
}
