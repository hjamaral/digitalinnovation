package one.digitalinnovation.digionebank

interface Logavel {
    fun login(senha:String): Boolean
    abstract fun login(): Boolean
}