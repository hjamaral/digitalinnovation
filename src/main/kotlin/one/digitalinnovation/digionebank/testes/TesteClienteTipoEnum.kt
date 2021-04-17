package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("1 - ${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("2 - ${it.name} - ${it.descricao}")
    }

    val clientePF = ClienteTipo.pf
    println("3 - ${clientePF.name} - ${clientePF.descricao}")
}