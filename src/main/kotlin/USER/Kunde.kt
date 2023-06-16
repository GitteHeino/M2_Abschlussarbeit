package USER

import kotlin.system.exitProcess

class Kunde(id: Int, name: String, firstName: String, eMail: String, password: String,/*    var id: Int = 0,*/
            var city: String, var street: String, var nr: Int, var zipCode: String, var anrede: String = "Hej!",     // List<String> = listOf("Sehr geehrte Frau ", "Sehr geehrter Herr ", "Guten Tag ")
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

    override fun produkt() {
        println("Hier ist für heute Schluß")
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
        println("Möchten Sie einen neuen Account anlegen? j/n:  ")
        var neuerAccount = readln().capitalize().toString()
        /*        while (neuerAccount == "j") {*/
        /*        if (neuerAccount == "n") {
        exitProcess(0)*/
        when (neuerAccount) {
            "J" -> datenEingabe()
            "N" -> exitProcess(0)
        }

        var versuche = 0
        var userLoggedIn = false
        while (versuche < 3 && !userLoggedIn) {
            println("geben sie ihr Passwort ein:  ")
            var pw = readln()
            if (pw == "guest123") {
                userLoggedIn = true
            } else {
                println("Falsches Passwort. Versuchen Sie es noch einmal")
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


    fun datenEingabe() {        // TODO  <- kotlin.collections.mutableListOf<User>
        println("Bitte geben Sie nacheinander Name, Vorname, eMail und ein Passwort - jeweils gefolgt von ENTER ein.")
        print("Nachname:  ")
        name = readln().toString()
        print("Vorname:  ")
        firstName = readln().toString()
        print("eMail:  ")
        eMail = readln().toString()
        print("Passwort:  ")
        var i = 0
        while (i < 3) {
            var password0 = readln().toString()
            print("Bitte wiederholen Sie das Passwort:  \n")
            password = readln().toString()
            if (password0 == password) {
                print("\t◌\n\n")
                break
            } else {
                println("Die beiden Passwörter stimmen nicht überein. Bitte wiederholen …")
            }
            i++
        }


        println("Geben Sie nun noch Ihre Adresse an:")
        print("Wohnort:  ")
        city = readln().toString()
        print("PLZ: ")
        zipCode = readln().toString()
        print("Straße:  ")
        street = readln().toString()

        var j = 1
        /*while (j < 2) {*/
        try {       // TODO Warum springt die try catch an, wenn alles richtig ist?
            print("Nr:  ")
            nr = readln().toInt()
        } catch (ex: Exception) {
            println("Nur Ziffern von 0 - 9 sind erlaubt")
            j++
        }

        /*  }*/


        print("Geburtstag (dd.mm.yyyy):  ")
        geburtstag = readln().toString()

        /*            print("wählen sie nun eine Anrede:\n" + " 1  für \'SGF\', 2  für \'SGH\', 3  für \'hi\', 4  für \'GutenTag\':  ")
                    anrede = readln()
                    when (anrede) {
                        "1" -> println("Sehr geehrte Frau")
                        "2" -> println("Sehr geehrter Herr")
                        "3" -> println("hi")
                        "4" -> println("Guten Tag")*/

        print("Wählen Sie nun eine Anrede:\n" + " 1 für 'SGF', 2 für 'SGH', 3 für 'hi', 4 für 'Guten Tag': ")
        val anrede = readln()

        fun auswahlAnrede() {
            when (anrede) {
                "1" -> {
                    println("Sehr geehrte Frau")
                    /*ergebnisListe.add("Sehr geehrte Frau")*/
                }

                "2" -> {
                    println("Sehr geehrter Herr")
                    /*ergebnisListe.add("Sehr geehrter Herr")*/
                }

                "3" -> {
                    println("hi")
                    /*userDB.add("hi")*/
                }

                "4" -> {
                    println("Guten Tag")
                    /*ergebnisListe.add("Guten Tag")*/
                }

                else -> {
                    println("Ungültige Auswahl")
                }
            }
        }


        println("\nKontrollieren Sie bitte Ihre Angaben:")
        println("$firstName, $name,  eMail: \n$eMail, Passwort: ******,\n$city,\n$street, $nr,\n$zipCode,\n$geburtstag")        // TODO  <- ${auswahlAnrede()}



        println("Alles ok? J/N:")
        var ok = readln().capitalize().toString()
        if (ok == "J") {/*            warteschleife(02_Utils. Utils)
                      println("Sie werden nun zum shop weitergeleitet. Einen Moment")
                            warteschleife()*/
            println("Jetzt können Sie shopShoppen :-)")     //TODO  springt zu Zeile 63 WARUM ???
           produkt()



            /*
        fun auswahlAnrede(anrede: String): String {
            return when (anrede) {
                "1" -> "Sehr geehrte Frau"
                "2" -> "Sehr geehrter Herr"
                "3" -> "hi"
                "4" -> "Guten Tag"
                else -> "Ungültige Auswahl"
            }
        }

        val anrede = readLine()?.trim()

        val ausgewehlteAnrede = auswahlAnrede(anrede)

        println("\nKontrollieren Sie bitte Ihre Angaben:")
        println("$firstName, $name,  eMail: \n$eMail, Passwort: ******,\n$city,\n$street, $nr,\n$zipCode,$ausgewehlteAnrede,\n$geburtstag")
        exitProcess(2)
        */
        }
        else {
            println("Good bye!")
            exitProcess(1)
        }
    }
}





