import kotlin.random.Random

fun main() {
    val numeros = List(20) { Random.nextInt(0, 100) }

    println("Números gerados: $numeros")

    val numerosOrdenados = numeros.sorted()
    println("Números ordenados: $numerosOrdenados")
}
