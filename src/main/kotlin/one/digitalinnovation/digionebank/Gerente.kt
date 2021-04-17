package one.digitalinnovation.digionebank

import src.main.kotlin.p.one.digitalinnovation.digionebank.Pessoa

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.50
}