/** Faça um algoritmo que leia quanto dinheiro uma pessoa tem na
carteira (em R$) e mostre quantos dólares ela pode comprar.
Considere US$1,00 = R$3,45. **/

fun main() {
    print("Qual valor na carteira: ")
    val dinheiro = readln().toFloat()

    val dolar = 3.45

    val conversao = (dinheiro * dolar)

    println("Você pode comprar %.2f doláres.".format(conversao))
}