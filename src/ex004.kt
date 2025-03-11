/** Desenvolva um algoritmo que leia dois números inteiros emostre o somatório entre eles.
Ex:Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13. **/

fun main() {
    print("Digite um valor: ")
    val n1 = readln().toInt()

    print("Digite um valor: ")
    val n2 = readln().toInt()

    val soma = n1 + n2

    println("A soma entre $n1 e $n2 é igual a $soma.")
}
