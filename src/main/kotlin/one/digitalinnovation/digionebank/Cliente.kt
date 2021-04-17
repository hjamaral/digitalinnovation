package one.digitalinnovation.digionebank

import src.main.kotlin.p.one.digitalinnovation.digionebank.Pessoa

class Cliente (
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {
    override fun login(senha: String): Boolean = "123456" == senha
    override fun login(): Boolean {
        TODO("Not yet implemented")
    }

}