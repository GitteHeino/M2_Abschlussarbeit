package USER

class Kunde(
        id: Int,
        name: String,
        firstName: String,
        eMail: String,
        password: String,
        /*    val id: Int = 0,*/
        val city: String,
        val street_Nr: String,
        val plz: String,
        var anrede: String = "Hej!",     // List<String> = listOf("Sehr geehrte Frau ", "Sehr geehrter Herr ", "Guten Tag ")
        var geburtstag: String = "yyyy-mm-dd"
) : User(id, name, firstName, eMail, password) {

    init {
        fun userMenu() {

        }

    }
}