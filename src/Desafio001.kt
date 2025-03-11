/** Escreva um programa para calcular a redução do tempo
de vida de um fumante. Pergunte a quantidade de cigarros fumados
por dias e quantos anos ele já fumou. Considere que um fumante
perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
um fumante perderá e exiba o total em dias. **/

fun main() {
    print("Quantos cigarros você fuma por dia: ")
    val cigarrosDia = readln().toInt()

    print("Quantos anos você já fumou: ")
    val anosFumando = readln().toInt()

    val minutosPerdidosPorDia = cigarrosDia * 10
    val minutosPorAno = minutosPerdidosPorDia * 365 * anosFumando

    val diasPerdidos = minutosPorAno / 1440

    println("Você perdeu um total de $diasPerdidos dias de vida devido ao cigarro.")
}