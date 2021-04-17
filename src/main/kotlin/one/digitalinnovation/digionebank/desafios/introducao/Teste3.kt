package one.digitalinnovation.digionebank.desafios.introducao

fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 1
    for (i in r..readLine()!!.toInt()) {

        println("$i ${i*i} ${i*i*i}")

        r += 0
    }
}