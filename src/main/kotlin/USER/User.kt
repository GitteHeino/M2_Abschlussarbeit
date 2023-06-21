package USER

import WAREN.Produkt


open class User(
        val id: Int = 0,
        var name: String = "",
        var firstName: String = "",
        var eMail: String = "",
        var password: String = "",
            val location: String = "",
            val street_Nr: String = "",
            val plz: String = ""
) {
    private var isloggedIn: Boolean = false



    open fun managerMenu(){

    }
    fun logout() {
    }

    open fun produkt() {
    }

    fun bezahlen() {
    }

    open fun userMenu() {
        println("Dein persönliches Menü")

    }       // TODO wird in subClass überschrieben …

    override fun toString(): String {
        return "$name"
    }       // macht den eigentlichen Inhalt (des Speicherplatzes) sichtbar



}

