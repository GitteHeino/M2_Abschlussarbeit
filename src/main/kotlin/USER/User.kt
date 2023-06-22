package USER

import WAREN.Produkt


open class User(
        val id: Int = 0,
        var name: String = "",
        var firstName: String = "",
        var eMail: String = "",
        var password: String = "",
        val location: String = "",
        val street: String = "",
        val plz: String = ""
) {
    private var isloggedIn: Boolean = false


    open fun managerMenu() {

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

    companion object {
        fun userList(i: Int, name: String, firstName: String, eMail: String, password: String, city: String, street: String, i1: Int, zipCode: String, geburtstag: String, anrede: String, meinWarenkorb: MutableList<Produkt>) {

        }
    }


}