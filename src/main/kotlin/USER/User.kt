package USER


open class User(
        val id: Int = 0,
        var name: String = "",
        var firstName: String = "",
        var eMail: String = "",
        var password: String = ""
        /*    val location: String = "",
            val street_Nr: String = "",
            val plz: String = ""*/
) {


    // TODO _________________________________________________________
    fun login() {
    }

    fun logout() {
    }

    open fun produkt() {
    }

    fun bezahlen() {
    }

    open fun userMenu() {
        println("Dein persönliches Menü")

    }

}

