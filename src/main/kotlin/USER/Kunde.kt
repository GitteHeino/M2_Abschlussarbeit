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
        password: String,
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
            val selectedItem = productList.firstOrNull { it.id== auswahlArtikel }
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
            println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        this.userWarenAuswahl()
    }

    fun sterne() {
        println("Users Bewertung (* * * * *)")
    }






}


// TODO Ende der Class Kunde


//todo -----------------------------------------------
// Ü > mT/f(m)  10  CC

