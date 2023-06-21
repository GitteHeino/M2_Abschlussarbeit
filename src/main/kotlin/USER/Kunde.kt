package USER

import ProductList
import ProductList.productList
import UserList.userList
import WAREN.Produkt
import main

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
        var geburtstag: String = "yyyy-mm-dd",
        var meinWarenkorb: MutableList<Produkt>

) : User(id, name, firstName, eMail, password) {


    override fun userMenu() {
        println(
                """
                    Ihr KundenKonto
                    
            Guten Tag $firstName $name. Wählen sie aus:            
                1 - Einkaufen
                2 - Warenkorb ansehen
                3 - Konto einsehen
                4 - ausloggen
            Beachten Sie auch unsere tagesaktuellen Angebote!
        """.trimIndent()
        )
        /*        userMenuAnzeige()*/       //todo kann man das auslagern in Utils?
        var userMenu = readln()
        when (userMenu) {
            "1" -> this.produkt()       // Einkauf
            "2" -> this.warenkorb()     // Warenkorb ansehen und bezahlen
            "3" -> this.userKonto()     // Kundendaten ändern
            "4" -> backM()              // ausloggen und zurück zum Anfang (fun main)
            else -> userMenu            // neue Runde
        }
    }

    fun userKonto() {
        println("Guten Tag $firstName $name\n")
        println(
                """Sie haben die Möglichkeit Ihre persönlichen Daten einzusehen und zu ändern.
        Und Sie können Ihren Kontostand (und die Zahlungsmöglichkeiten) einsehen bzw. ändern.
                1 - Kontoguthaben
                2 - persönliche Daten einsehen
                3 - zurück zum KundenKonto
                """.trimIndent()
        )

        var eingabe = readln().toInt()
        when (eingabe) {
            1 -> userGuthaben()
            2 -> anzeigenKundenEintrag(userList, eMail)
            3 -> backU()


        }
    }       // TODO löschen/archivieren || noch nicht!!


    fun warenkorb() {           // zeigt an was im Warenkorb ist
        println("\u001b[34mIhr Warenkorb enthält:\u001b[0m")
        var leer = ""
        println("\u001B[34mArtikel ${leer.padEnd(62, ' ')}\u001B[34mMenge\u001B[0m\t\t \u001B[34mPreis gesamt\u001B[0m\t")
        for (produkt in meinWarenkorb) {

            println("${produkt.name.padEnd(70, ' ')}\t${produkt.menge}\t\t\t${produkt.preis}€")
        }

        val gesamtPreis = meinWarenkorb.sumOf { it.preis * it.menge }

        println("Gesamtpreis: ${leer.padEnd(68, ' ')} $gesamtPreis€")
    }

    fun userGuthaben() {
        val startBudgetKunde = 150.0
        println("\tAktuell haben Sie ein Budget von '$startBudgetKunde€' auf Ihrem Konto.")
        val artikel = productList[3]
        var budgetKunde1 = startBudgetKunde
        println("\tNach dem Kauf beträgt ihr Budget '$budgetKunde1€'.")

    }


    fun backM() {
        println("Auf Wiedersehen!")
        main()
    }

    fun backU() {
        println("zurück zum KundenKonto")
        userMenu()
    }

    fun backToUserBestellung() {
        println("Zurück zum Menü")
        userWarenAuswahl()
    }

    /*fun meinWarenkorb() {         //todo  nicht vergessen!
        var w = readln()
        println(w)
    }*/

    /*    fun addToList(item: String) {
            meinWarenkorb.add()
        }*/

    fun userWarenAuswahl() {
        println("\u001B[34m Um einen Artikel genauer anzusehen geben Sie die ArtikelNr. ein:  \u001B[0m")
        var auswahlArtikel = readln()?.toIntOrNull()

        if (auswahlArtikel != null) {
            val selectedItem = productList.firstOrNull { it.id == auswahlArtikel }
            if (selectedItem != null) {
                println("Produkteigenschaften für: ${selectedItem.name}\t\tPreis ${selectedItem.preis}\t\t${selectedItem.kundenRezension}  ${selectedItem.merkmal}   ${selectedItem.menge}")
                println("Wieviele Teile möchten Sie kaufen?")
                var menge = readln().toInt()
                selectedItem.menge = menge
                meinWarenkorb.add(selectedItem)
            } else {
                println("Artikel nicht gefunden")
            }
        } else {
            println("Ungültige Eingabe")
        }

        /*        if (menge != null) {
                    val selectedItem = productList.firstOrNull { it.id == menge }
                    if (selectedItem != null) {
                        println("gewählte Menge ... ")
                        meinWarenkorb.add(selectedItem)
                    }*/

        print("weiter einkaufen? (j/n):  ")
        var jaNein = readln()
        if (jaNein == "j") {
            produkt()
        } else if (jaNein == "n") {
            userMenu()
        } else {
            println("falsche Eingabe!")
            userMenu()
        }


    }

    fun auswahlMenge() {


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


    override fun produkt() {        // Anzeige des Warenangebotes
        var leer = ""       // nur für formatierung
        println("unser Angebot\n\n")
        println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")
        for (produkt in ProductList.productList)
            println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        this.userWarenAuswahl()
    }

    /*    fun sterne() {
            println("Users Bewertung (* * * * *)")
        }
        */
    fun zuürckZumMenu() {
        userMenu()
    }

}


// TODO Ende der Class Kunde


//todo -----------------------------------------------
// Ü > mT/f(m)  10  CC

