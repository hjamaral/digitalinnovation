package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta {
    val agencia: String = "1"
    val numero: String ="1"
    lateinit var saldo: BigDecimal

    fun deposito(valor: BigDecimal) {
        saldo += valor
    }

    fun saque(valor: BigDecimal) {
        saldo -= valor
    }
}
