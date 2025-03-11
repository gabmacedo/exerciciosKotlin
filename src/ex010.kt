/** Escreva um programa que pergunte a velocidade de um carro.
Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
cada Km acima da velocidade permitida. **/

fun main() {
    print("Qual a velocidade do carro (em Km/h): ")
    val velocidade = readln().toInt()

    if (velocidade > 80) {
        val multa = (velocidade - 80) * 5
        println("Você foi multado! O valor da multa é $multa.")
    } else {
        println("Você esta á dentro da velocidade permitida. Não foi Multado")
    }

}