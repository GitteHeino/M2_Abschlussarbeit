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

}
    fun userKonto() {
        println("Das Konto des Users")
    }

    fun userGuthaben() {
        println("Das Guthaben des Users")
    }

    fun userBestellung() {
        println("Users Bestellung")
    }

    fun sterne() {
        println("Users Bewertung (* * * * *)")
    }

    override fun userMenu() {
        println("""
            wählen sie aus:
                1 - Einkaufen
                2 - Konto einsehen
                3 - Guthaben
                4 - Bestellung ansehen
        """.trimIndent())
        var userMenu = readln().toInt()
        when (userMenu) {
            1 -> produkt()
            2 -> userKonto()
            3 -> userGuthaben()
            4 -> userBestellung()
        }


    }

}