package src.main.kotlin.p

class Pessoa(
        val nome: String = "Hernane",
        val cpf: String = "123.456.789-01"
)

fun main() {
    val eu = Pessoa()
    println(eu.nome)
    println(eu.cpf)
}