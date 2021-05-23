package one.digitalinnovation.collections

data class Empregado(

    val nome: String,
    val salario: Double,
    val tipo: String
) {
    override fun toString(): String =
        "Nome: $nome [$salario]"
}
