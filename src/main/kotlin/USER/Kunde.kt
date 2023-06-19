package USER

import ProductList
import ProductList.productList
import UserList
import UserList.userList
import produktAngebotAlleKategorien
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



    var meinWarenkorb: MutableList<Kunde> = mutableListOf<Kunde>(
    )


    fun userKonto() {
        println("Das Konto des Users")
        println("Sie haben die Möglichkeit Ihre persönlichen Daten einzusehen und zu ändern.\n" +
                "Sie können auch Ihre Bestellung und Ihren Kontostand einsehen\n" +
                "1 - aktuelles Guthaben\n" +
                "2 - Konto\n" +
                "3 - persönliche Daten einsehen")
        var eingabe = readln().toInt()
        when (eingabe) {
            1 -> meinWarenkorb()
            2 -> userGuthaben()
            3 -> anzeigenKundenEintrag(userList, eMail)


        }
    }       // TODO löschen/archivieren || noch nicht!!


    override fun userMenu() {
        println(
                """
            Guten Tag, , wählen sie aus:
                1 - Einkaufen
                2 - Warenkorb ansehen
                3 - Konto einsehen
                4 - ausloggen
        """.trimIndent()
        )
        var userMenu = readln().toInt()
        when (userMenu) {
            1 -> this.produkt()
            2 -> this.userWarenAuswahl()
            3 -> this.userKonto()
            4 -> back()
        }
    }

    fun back() {
        println("Zurück zum Menü")
        backToUserBestellung()
        println("Auf Wiedersehen!")

    }

    fun backToUserBestellung() {
        println("Zurück zum Menü")
        userWarenAuswahl()
    }

    fun meinWarenkorb() {
        var w = readln()
        println(w)
    }

    /*    fun addToList(item: String) {
            meinWarenkorb.add()
        }*/

    fun userWarenAuswahl() {
        println("\u001B[34m Um einen Artikel genauer anzusehen geben Sie die dreistellige ArtikelNr. ein:  \u001B[0m")
        var auswahlArtikel = readln()?.toIntOrNull()

        if (auswahlArtikel != null) {
            val selectedItem = productList.firstOrNull { it.nr == auswahlArtikel }
            if (selectedItem != null) {
                /*                println("ArtikelNr: ${selectedItem.nr} \nName: ${selectedItem.name} \nPreis: ${selectedItem.preis}\n" +
                                        "Bewertung: ${selectedItem.kundenRezension}\nMerkmal: ${selectedItem.warenAngebot} ${selectedItem}\n")*/
                println(" Merkmal   $selectedItem")

            } else {
                println("Artikel nicht gefunden")
            }
        } else {
            println("Ungültige Eingabe")
        }
        auswahlMenge()
        /*        backToUserBestellung()*/


    }

    fun auswahlMenge() {
        println("Wieviele Teile möchten Sie kaufen?")
        var menge = readln().toInt()
        println("${meinWarenkorb}")
        back()
    }

    private fun anzeigenKundenEintrag(userList: List<User>, eMail: String) {
        val gefundeneEinträge = userList.filter { user -> user is Kunde && user.eMail == eMail } as List<Kunde>

        if (gefundeneEinträge.isNotEmpty()) {
            for (kunde in gefundeneEinträge) {
                println("Name: ${kunde.name}")
                println("Vorname: ${kunde.firstName}")
                println("eMail: ${kunde.eMail}")
                println("Passwort: ${kunde.password}")
                println("Stadt: ${kunde.city}")
                println("Straße: ${kunde.street}")
                println("Hausnummer: ${kunde.nr}")
                println("PLZ: ${kunde.zipCode}")
                println("Anrede: ${kunde.anrede}")
                println("Geburtstag: ${kunde.geburtstag}")
                println("------------------------")
            }
        } else {
            println("Kein Kunde mit der angegebenen E-Mail-Adresse gefunden.")
        }
    }


    fun userGuthaben() {
        val startBudgetClient = 150.0
        println("\tAktuell haben Sie ein Budget von '$startBudgetClient€' auf Ihrem Konto.")
        val artikel = productList[3]
        var budgetKunde1 = startBudgetClient
        println("\tNach dem Kauf beträgt ihr Budget '$budgetKunde1€'.")

    }

    override fun produkt() {
        var leer = ""
        println("unser Angebot\n\n")
        println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")
        for (produkt in ProductList.productList)
            println("${produkt.nr}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        this.userWarenAuswahl()
    }

    fun sterne() {
        println("Users Bewertung (* * * * *)")
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
    }       // TODO löschen/archivieren

    open fun datenEingabe() {        // TODO  <- kotlin.collections.mutableListOf<User>
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

        print("Geburtstag (dd.mm.yyyy):  ")
        geburtstag = readln().toString()



        print("Wählen Sie nun eine Anrede:\n" + " 1 für 'Sehr geehrte Frau', 2 für 'Sehr geehrter Herr', 3 für 'hej', 4 für 'Guten Tag': ")
        val anrede = readln()

        fun auswahlAnrede() {
            when (anrede) {
                "1" -> {
                    print("Sehr geehrte Frau ")
                    /*ergebnisListe.add("Sehr geehrte Frau")*/
                }

                "2" -> {
                    print("Sehr geehrter Herr ")
                    /*ergebnisListe.add("Sehr geehrter Herr")*/
                }

                "3" -> {
                    print("hej ")
                    /*userDB.add("hi")*/
                }

                "4" -> {
                    print("Guten Tag ")
                    /*ergebnisListe.add("Guten Tag")*/
                }

                else -> {
                    println("Ungültige Auswahl")
                }
            }
        }


        println("\nKontrollieren Sie bitte Ihre Angaben:")
        auswahlAnrede().toString()
        println("$firstName $name \neMail: $eMail \nPasswort: ****** \n$zipCode\t$city \n$street $nr \n$geburtstag") // TODO  <- ${auswahlAnrede()}
        println("\n\n\t◌\t◌\n\n")

        println("Alles ok? J/N:")
        var ok = readln().capitalize().toString()
        if (ok == "J") {
            println("Jetzt können Sie shopShoppen :-)")     //TODO  springt zu Zeile 63 WARUM ???

            produktAngebotAlleKategorien()


        } else if (ok == "N") {
            datenEingabe()
        } else
            println("Good bye!")
        exitProcess(1)
    }       // TodO Zeile 87: Abkürzung (?? gibt es die noch ?) rausnehmen, wenn fertig!


}


// TODO Ende der Class Kunde


//todo -----------------------------------------------
// Ü > mT/f(m)  10  CC

