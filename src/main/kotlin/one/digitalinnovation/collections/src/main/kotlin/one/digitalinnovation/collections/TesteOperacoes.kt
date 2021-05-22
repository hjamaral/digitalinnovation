package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 1550.0, 5000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("---------------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salario: ${salarios.average()}")

    println("---------------------")
    val salarioFiltrado1 = salarios.filter { it > 1100.0 }
    println(salarioFiltrado1)

    println("---------------------")
    println(salarios.count { it in 1000.0..4000.0 })

    println("---------------------")
    println(salarios.find { it == 5000.0 })
    println(salarios.find { it == 3000.0 })

    println("---------------------")
    println(salarios.any { it == 1500.00 })
}