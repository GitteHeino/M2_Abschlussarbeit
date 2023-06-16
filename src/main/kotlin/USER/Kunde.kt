package USER

import kotlin.system.exitProcess

class Kunde(id: Int, name: String, firstName: String, eMail: String, password: String,/*    val id: Int = 0,*/
            val city: String, val street: String, val nr: Int, val zipCode: String, var anrede: String = "Hej!",     // List<String> = listOf("Sehr geehrte Frau ", "Sehr geehrter Herr ", "Guten Tag ")
            var geburtstag: String = "yyyy-mm-dd") : User(id, name, firstName, eMail, password) {

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

    fun registerNeu() {
        println("Möchten Sie einen neuen Account anlegen? j/n:")
        var neuerAccount = readln().toString()
        /*        while (neuerAccount == "j") {*/
        /*        if (neuerAccount == "n") {
        exitProcess(0)*/
        when (neuerAccount) {
            "j" -> datenEingabe()
            "n" -> exitProcess(0)
        }

        var versuche = 0
        var userLoggedIn = false
        while (versuche < 3 && !userLoggedIn) {
            println("geben sie ihr Passwort ein:")
            var pw = readln()
            if (pw == "guest123") {
                userLoggedIn = true
            } else {
                println("Falsches Passwort. Versuch sie es noch einmal")
                versuche++ // versuche = versuche + 1
            }
        } // Ende der Schleife

        if (versuche == 3) {
            println("Kein Zugriff, Programm wird geschlossen")
        }
        if (userLoggedIn) {
            datenEingabe()      //appStarten()
        }
    }


    fun datenEingabe() {
        var i = 0
        while(i < 3) {
            println("Bitte geben Sie nacheinander Name, Vorname, eMail und ein Passwort - jeweils gefolgt von ENTER ein:")
            var name = readln().toString()
            var firstName = readln().toString()
            var eMail = readln().toString()
            var password0 = readln().toString()
            println("Bitte wiederholen Sie das Passwort:")
            var password = readln().toString()
            if (password0 !== password) {
                println("Die beiden Passwörter stimmen nicht überein. Bitte wiederholen")
            }
        }






        println("Geben Sie nun noch Ihre Adresse an: Ort:")
        var city = readln().toString()
        println("Straße")
        var street = readln().toString()
        println("Nr")
        var nr = readln().toInt()
        println("PLZ")
        var zipCode = readln().toString()
        println("wählen sie nun eine Anrede:\n" + " 1  für \'SGF\', 2  für \'SGH\', 3  für \'hi\', 4  für \'GutenTag\'")
        var anrede = readln().toInt()
        when (anrede) {
            1 -> println("Sehr geehrte Frau")
            2 -> println("Sehr geehrter Herr")
            3 -> println("hi")
            4 -> println("Guten Tag")
        }/*        println("Sie werden nun zum shop weitergeleitet. Einen Moment")
                warteschleife()*/
        println("Geburtstag (yyyy-mm-dd)")
        val geburtstag = readln().toString()

        println("Kontrollieren Sie bitte Ihre Angaben:")
        println("$name, $firstName, \n$eMail, ******, \n$city,$street, $nr, $zipCode, \n$anrede, $geburtstag")
        println("Alles ok? J/N:")
        val ok = readln().capitalize().toString()
        if (ok == "j") {/*            warteschleife(02_Utils. Utils)*/
            println("Sie können nun shopShoppen :-)")
        }

        /*        while (neuerAccount == "n") println("Good bye!")*/
        exitProcess(2)
    }
}




