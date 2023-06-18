package USER

import WAREN.Produkt


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
    private var isloggedIn: Boolean = false


    fun login(inputUsername: String?, inputPassword: String?): Boolean {
        if (inputUsername == name && inputPassword == password) {
            isloggedIn = true
            return true
        }
        return false
    }


    // TODO _________________________________________________________
/*    fun login() {
    }*/


    fun login(user: MutableList<User>) {
            println(
                    "Benutzername (eMail):"     //todo Zuerst müssen Sie sich mit Ihren Anmeldedaten einloggen.
            )
            var i = 1
            while (i <= 3) {
                var loginM = readln().toString()
                println("Passwort (nur Zahlen und Buchstaben):")
                var loginP = readln().toString()
                        if (loginM == eMail && loginP == password) {
            if (loginM == "cc" && loginP == "44") {
                println("2FA  Geben Sie nun Ihre ID ein:")
                try {
                    var loginI = readln().toInt()
                    if(loginI == 0 )
                    if (id == loginI )
                        "\uF8FF\uF8FF\uF8FF >> Manager()"
                } catch (ex: Exception) {
                    println("Die ID stimmt nicht")
                }
            } else if (loginM == eMail && password == loginP)    // Justus
                println("yes!")
                true
                 ">> myAccount() "    // return: eMail des Kunden
            } else {
                println("Diese Kombination existiert nicht in unserer Datenbank.")
            }
            i++
            if (i > 2) {
                println("Zu viele Fehlversuche. Der Login-Vorgang wird beendet.\n")
                ">>> exitProcess(0)"
            }
            false
        }
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


/*    val kunde = mutableListOf<Kunde>()
    val manager= mutableListOf<Manager>()
    val mitarbeiter = mutableListOf<Mitarbeiter>()*/


/*
    val userKunde1 = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
    val userKunde2 = Kunde(102, "Niblock", "Phil", "ayulive@dot.com", "ayufirst", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07")
    val userKunde3 = Kunde(103, "Nagel", "Jenny", "nagel.je@web.de", "1234", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23")
*/






}

