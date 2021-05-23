package one.digitalinnovation.collections

fun main() {
    val joao = Empregado("João", 2000.00,"PJ")
    val pedro = Empregado("Pedro", 5000.00, "CLT")
    val maria = Empregado("Maria", 3000.00, "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val empresa = funcionarios1.union(funcionarios2)
    empresa.forEach { println(it) }

    println("--------------------")
    val funcionarios3 = setOf(joao, pedro,maria)
    val empresaSubtract = funcionarios3.subtract(funcionarios2)
    empresaSubtract.forEach { println(it) }

    println("--------------------")
    val empresaIntersect = funcionarios3.intersect(funcionarios2)
    funcionarios3.forEach { println(it) }
}
