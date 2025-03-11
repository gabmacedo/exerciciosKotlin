/** Crie um algoritmo que leia um número real e mostre na tela o
seu dobro e a sua terça parte.
Ex:

Digite um
número:
3.5 O
dobro de
3.5 é 7.0
A terça parte de 3.5 é 1.16666 **/

fun main() {
    print("Digite um numero: ")
    val num = readln().toDouble()

    val dobro = num * 2
    val tercaParte = num / 3

    println("O dobro de $num é %.2f".format(dobro))
    println("A terça parte de $num é %.2f".format(tercaParte))
}