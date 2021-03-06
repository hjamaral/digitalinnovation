package one.digitalinnovation.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { t, u -> println("Chave: $t - valor: $u") }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    println("---------------------")
    map2.forEach { t, u -> println("Chave: $t - valor: $u") }
}