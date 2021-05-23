package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.00,"PJ")
    val pedro = Funcionario("Pedro", 5000.00, "CLT")
    val maria = Funcionario("Maria", 3000.00, "CLT")

    val repositorio = Repositorio<Funcionario> ()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println(repositorio.findById(maria.nome))

    println("--------------------- findAll")
    println(repositorio.findAll())
    repositorio.findAll().forEach { println(it) }

    println("--------------------- remove")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}