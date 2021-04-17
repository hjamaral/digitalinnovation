package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import src.main.kotlin.p.one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val hernane = Analista("Hernane Amaral", "123", 10000.00)
    println(hernane.nome)
    println(hernane.cpf)
    println(hernane.salario)
    imprimeRelatorio(hernane)
}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())