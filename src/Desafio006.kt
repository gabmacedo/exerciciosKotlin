fun main() {
    print("Digite o primeiro termo da PA: ")
    val primeiroTermo = readln().toInt()

    print("Digite a razão da PA: ")
    val razao = readln().toInt()

    var soma = 0
    print("Os 10 primeiros termos da PA: ")

    for (i in 0 until 10) {
        val termo = primeiroTermo + i * razao
        print("$termo ")
        soma += termo
    }

    println("\nA soma dos termos da PA é: $soma")
}
