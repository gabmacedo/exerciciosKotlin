/** Faça um programa que leia as duas notas de um aluno em uma
matéria e mostre na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 **/

fun main() {
    print("Nota 1: ")
    val nota1 = readln().toDouble()

    print("Nota 2: ")
    val nota2 = readln().toDouble()

    val media = (nota1 + nota2)/2

    println("A média entre $nota1 e $nota2 é igual a = $media")
}