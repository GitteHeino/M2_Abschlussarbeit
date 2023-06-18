package USER

import kotlin.system.exitProcess

class Kunde(
    id: Int,
    name: String,
    firstName: String,
    eMail: String,
    password: String,/*    var id: Int = 0,*/
    var city: String,
    var street: String,
    var nr: Int,
    var zipCode: String,
    var anrede: String = "Hej!",     // List<String> = listOf("Sehr geehrte Frau ", "Sehr geehrter Herr ", "Guten Tag ")
    var geburtstag: String = "yyyy-mm-dd"
) : User(id, name, firstName, eMail, password) {

    init {
    }

/*
    val userKunde1 = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
    val userKunde2 = Kunde(102, "Niblock", "Phil", "ayulive@dot.com", "ayufirst", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07")
    val userKunde3 = Kunde(103, "Nagel", "Jenny", "nagel.je@web.de", "1234", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23")
*/

/*
    var neuKunde = Kunde(100, "Mustermann", "Max", "eMail", "password", "Musterstadt", "X-Straße", 11, "12345", "hi", "11-11-2000")
*/








    fun userKonto() {
        println("Das Konto des Users")
        back()
    }

    fun back() {
        println("Zurück zum Menü")
        var back = readln()
        userMenu()
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
        println(
            """
            wählen sie aus:
                1 - Einkaufen
                2 - Konto einsehen
                3 - Guthaben
                4 - Bestellung ansehen
        """.trimIndent()
        )
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
            "N" -> exitProcess(0)       // TODO ersetzen mit back()
        }

        /*        var versuche = 0
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
                    *//*            datenEingabe()      //appStarten()*//*
        }*/
    }

    fun datenEingabe() {        // TODO  <- kotlin.collections.mutableListOf<User>
        userMenu()
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

        print("Wählen Sie nun eine Anrede:\n" + " 1 für 'SGF', 2 für 'SGH', 3 für 'hej', 4 für 'Guten Tag': ")
        val anrede = readln()

        fun auswahlAnrede() {
            when (anrede) {
                "1" -> {
                    println("Sehr geehrte Frau ")
                    /*ergebnisListe.add("Sehr geehrte Frau")*/
                }

                "2" -> {
                    println("Sehr geehrter Herr ")
                    /*ergebnisListe.add("Sehr geehrter Herr")*/
                }

                "3" -> {
                    println("hej ")
                    /*userDB.add("hi")*/
                }

                "4" -> {
                    println("Guten Tag ")
                    /*ergebnisListe.add("Guten Tag")*/
                }

                else -> {
                    println("Ungültige Auswahl")
                }
            }
        }


        println("\nKontrollieren Sie bitte Ihre Angaben:")
        println("$firstName, $name,  \neMail: $eMail, \nPasswort: ******,\n$city,\n$street, $nr,\n$zipCode,\n$geburtstag") // TODO  <- ${auswahlAnrede()}
        auswahlAnrede().toString()
        println("\n\t◌\t◌\n\n")

        println("Alles ok? J/N:")
        var ok = readln().capitalize().toString()
        if (ok == "J") {/*            warteschleife(02_Utils. Utils)
                      println("Sie werden nun zum shop weitergeleitet. Einen Moment")
                            warteschleife()*/
            println("Jetzt können Sie shopShoppen :-)")     //TODO  springt zu Zeile 63 WARUM ???
            userMenu()
            exitProcess(5)


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
        } else {
            println("Good bye!")
            exitProcess(1)
        }
    }       // TODO Zeile 87: Abkürzung rausnehmen, wenn fertig!


}       // TODO Ende der Class Kunde



//todo -----------------------------------------------
// Ü > mT/f(m)  10  CC

