package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import src.main.kotlin.p.one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val maria = Gerente("Maria Eduarda", "xxx", 5000.00)
    println(maria.nome)
    println(maria.cpf)
    println(maria.salario)
    imprimeRelatorio2(maria)
}

fun imprimeRelatorio2(funcionario: Funcionario) = println(funcionario.toString())