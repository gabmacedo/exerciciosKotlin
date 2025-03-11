/** Desenvolva um programa que leia uma distância em metros e
mostre os valores relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm **/

fun main() {
    print("Digite uma distância em metros: ")
    val distancia = readln().toDouble()

    val convKm = distancia / 1000
    val convHm = distancia / 100
    val convDam = distancia / 10
    val convDm = distancia * 10
    val convCm = distancia * 100
    val convMm = distancia * 1000

    println("""
        A distancia de $distancia corresponde a: 
        ${"%.5f".format(convKm)} Km
        ${"%.5f".format(convHm)} Hm
        ${"%.5f".format(convDam)} Dam
        ${"%.5f".format(convDm)} Dm
        ${"%.5f".format(convCm)} Cm
        ${"%.5f".format(convMm)} Mm
        """.trimIndent())


}