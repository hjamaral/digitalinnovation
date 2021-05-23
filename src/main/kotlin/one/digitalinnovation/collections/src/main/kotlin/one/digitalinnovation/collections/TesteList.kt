package one.digitalinnovation.collections

import java.io.StringBufferInputStream

fun main() {
    val joao = Funcionario("João", 2000.00,"PJ")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "CLT")

    val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach {println(it)}
    println("--------------------- find")
    println(funcionarios.find { it.nome == "Maria" })

    println("--------------------- sortedBy")
    funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("--------------------- groupBy")
    funcionarios
        .groupBy { it.tipo }
        .forEach{println(it)}


}

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipo: String
    ) {
    override fun toString(): String =
        "Nome: $nome [$salario]"
}