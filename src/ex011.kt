/** Faça um programa que leia o ano de nascimento de uma pessoa,
calcule a idade dela e depois mostre se ela pode ou não votar. **/

import java.time.LocalDate

fun main() {
    print("Digite o ano de nascimento: ")
    val data = readln().toInt()

    val calc = LocalDate.now().year - data

    if (calc >= 18) {
        println("Sua idade é $calc e você pode votar!")
    } else {
        println("Sua idade é $calc e você não pode votar!")
    }

}