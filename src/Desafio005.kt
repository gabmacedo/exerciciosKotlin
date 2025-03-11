import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 11)
    var tentativas = 4

    while (tentativas > 0) {
        print("Tente adivinhar o número entre 1 e 10 ($tentativas tentativas restantes): ")
        val tentativa = readln().toInt()

        if (tentativa == numeroSecreto) {
            println("Parabéns! Você acertou!")
            return
        } else {
            println("Errou!")
        }
        tentativas--
    }
    println("Acabaram as tentativas! O número era $numeroSecreto.")
}
