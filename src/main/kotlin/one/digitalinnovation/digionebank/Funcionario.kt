package one.digitalinnovation.digionebank

import src.main.kotlin.p.one.digitalinnovation.digionebank.Pessoa

abstract class Funcionario (
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = "" +
            "Nome: $nome " +
            "CPF: $cpf " +
            "Salario: $salario " +
            "Auxilio: ${calculoAuxilio()}"
}