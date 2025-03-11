fun main() {
    print("Digite o primeiro segmento: ")
    val a = readln().toDouble()

    print("Digite o segundo segmento: ")
    val b = readln().toDouble()

    print("Digite o terceiro segmento: ")
    val c = readln().toDouble()

    if (a + b > c && a + c > b && b + c > a) {
        println("Os segmentos formam um triângulo!")

        val tipo = when {
            a == b && b == c -> "EQUILÁTERO"
            a == b || a == c || b == c -> "ISÓSCELES"
            else -> "ESCALENO"
        }

        println("Tipo de triângulo: $tipo")
    } else {
        println("Os segmentos NÃO formam um triângulo!")
    }
}
