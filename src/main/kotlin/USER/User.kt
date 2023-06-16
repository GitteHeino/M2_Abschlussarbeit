package USER

open class User(
    val id: Int = 0,
    val name: String = "",
    val firstName: String = "",
    val eMail: String = "",
    val password: String = ""
/*    val location: String = "",
    val street_Nr: String = "",
    val plz: String = ""*/
) {


    // TODO _________________________________________________________
    fun login() {
    }

    fun logout() {
    }

    fun produkt() {
    }

    fun bezahlen() {
    }

    open fun userMenu() {
        println("Dein persönliches Menü")

    }


}
