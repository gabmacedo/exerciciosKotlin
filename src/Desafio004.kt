import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 6)

    print("Tente adivinhar o número entre 1 e 5: ")
    val tentativa = readln().toInt()

    if (tentativa == numeroSecreto) {
        println("Parabéns! Você acertou!")
    } else {
        println("Errou! O número era $numeroSecreto.")
    }
}
