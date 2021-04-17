package src.main.kotlin.p.one.digitalinnovation.digionebank

class Pessoa(
    var nome: String = "Hernane",
    var cpf: String = "123.456.789-01"

    //Constructor()
    //fun pessoaInfo() = "$nome e $cpf"
)

fun main() {
    val eu = Pessoa()
    eu.cpf = "123"

    println(eu)
    println(eu.nome)
    println(eu.cpf)
    //println(eu.pessoaInfo())
}