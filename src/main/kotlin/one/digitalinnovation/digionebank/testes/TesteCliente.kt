package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val jose = Cliente(
        "Jose da Silva",
        "456",
        ClienteTipo.pf,
        "0101"
    )
    println(jose)
    TesteAutenticacao().autentica(jose)
}