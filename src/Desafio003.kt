import kotlin.random.Random

fun main() {
    val opcoes = listOf("Pedra", "Papel", "Tesoura")

    print("Escolha (0) Pedra, (1) Papel, (2) Tesoura: ")
    val jogador = readln().toInt()

    if (jogador !in 0..2) {
        println("Opção inválida!")
        return
    }

    val computador = Random.nextInt(0, 3)

    println("Você escolheu: ${opcoes[jogador]}")
    println("Computador escolheu: ${opcoes[computador]}")

    val resultado = when {
        jogador == computador -> "Empate!"
        (jogador == 0 && computador == 2) ||
                (jogador == 1 && computador == 0) ||
                (jogador == 2 && computador == 1) -> "Você venceu!"
        else -> "Computador venceu!"
    }

    println(resultado)
}
