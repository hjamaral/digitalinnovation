package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.00,"PJ")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "CLT")

    println("--------------------- mutableListOf")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("--------------------- add")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("--------------------- remove")
    funcionarios.remove(pedro)
    funcionarios.forEach { println(it) }

    println("--------------------- mutableSetOf")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("--------------------- add")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("--------------------- remove")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }
}