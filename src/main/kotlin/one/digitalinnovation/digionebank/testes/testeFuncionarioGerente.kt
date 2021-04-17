package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Eduarda", "xxx", 5000.00, "123" )
    println(maria.nome)
    println(maria.cpf)
    println(maria.salario)

    TesteAutenticacao().autentica(maria)
}