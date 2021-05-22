package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 3
    values[2] = 8
    values[3] = 2
    values[4] = 5

    for (valor in values) {
        println(valor)
    }

    println("--------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("--------------------")
    for (ind in values.indices) {
        println(values[ind])
    }

    println("--------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
}