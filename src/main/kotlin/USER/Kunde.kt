package USER


import ProductList
import ProductList.productList
import UserList.userList
import WAREN.Produkt
import main

import warten200
import warten2000
import warten500
import warteschleife
import java.util.*

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

//todo _________________________________________________________________________________________________________________

    override fun userMenu() {
        println("\n\n\t\t\t \u001b[7m KUNDENKONTO \u001b[0m")
        warten500()
        println("""                   
            
            Guten Tag $firstName $name. Wählen sie aus: 
                       
                1 - Einkaufen
                2 - Warenkorb ansehen
                3 - persönliche Daten einsehen
                4 - ausloggen
        """.trimIndent()
            /*Beachten Sie auch unsere tagesaktuellen Angebote!*/
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

//todo _________________________________________________________________________________________________________________

    fun userKonto() {
        println("\n\n\t\t\t \u001B[7m persönlicher Bereich \u001B[0m  $firstName $name\n")
        warten200()
        println("""Sie haben die Möglichkeit Ihre persönlichen 
Daten einzusehen und zu ändern. Und Sie können Ihren Kontostand
(und die Zahlungsmöglichkeiten) einsehen bzw. ändern.

        1 - Kontoguthaben
        2 - persönliche Daten einsehen
        3 - zurück zum KundenKonto
                 """.trimIndent()
        )

        var eingabe = readln().toInt()
        when (eingabe) {
            1 -> userGuthaben()
            2 -> anzeigenKundenEintrag(userList, eMail)
            3 -> backUM()


        }
    }       // TODO löschen/archivieren || noch nicht!!

//todo _________________________________________________________________________________________________________________

    fun warenkorb() {           // zeigt an was im Warenkorb ist
        println("\n\n\u001b[34mIhr Warenkorb enthält:\u001b[0m\n  ")
        var leer = ""
        println("\u001B[34mArtikel ${leer.padEnd(62, ' ')}\u001B[34mMenge\u001B[0m\t\t\u001B[34mPreis gesamt\u001B[0m")
        for (produkt in meinWarenkorb) {

            println("${produkt.name.padEnd(70, ' ')}\t${produkt.menge}\t\t\t${produkt.preis}€")
        }

        val gesamtPreis = meinWarenkorb.sumOf { it.preis * it.menge }
        val number = gesamtPreis
        val formattedNumber = String.format(Locale.ENGLISH,"%.2f", number)

        println("Gesamtpreis: ${leer.padEnd(68, ' ')} $formattedNumber€\n\n")
        backUM()
    }

    fun userGuthaben() {

        val startBudgetKunde = 150.0
        println("Wieviel möchten Sie auf Ihr Konto einzahlen?:  ")
        var kundenKontoEinzahlung = readln().toDouble() + startBudgetKunde
        println("\tAktuell haben Sie ein Budget von '$startBudgetKunde€' auf Ihrem Konto.")
        print("kundenKontoEinzahlung:  ")
        var budgetKunde = startBudgetKunde
        println("\tNach der Überweisung beträgt ihr Budget '$kundenKontoEinzahlung€'.")
        println("Siw können nun einkaufen (e) oder zurück zum persönlichen bereich (z):  ")
        val select = readln()
        while (select == "e"){
            backUM()
        }
        warten2000()

    }

    fun bezahlung(){

    }

    fun userWarenAuswahl() {
        print("\n\u001B[34mUm einen Artikel genauer anzusehen geben Sie die ArtikelNr. ein:  \u001B[0m\n")
        var auswahlArtikel = readln()?.toIntOrNull()

        if (auswahlArtikel != null) {
            val selectedItem = productList.firstOrNull { it.id == auswahlArtikel }
            if (selectedItem != null) {
                println("Produkteigenschaften für: ${selectedItem.name}\t\tPreis ${selectedItem.preis}\t\t${selectedItem.kundenRezension}  ${selectedItem.merkmal}")
                print("Wie viele Teile möchten Sie kaufen? (Zahl eingeben):  ")
                var menge = readln().toInt()
                selectedItem.menge = menge
                meinWarenkorb.add(selectedItem)
            } else {
                println("Artikel nicht gefunden")
                userWarenAuswahl()
            }
        } else {
            println("Ungültige Eingabe")
            userWarenAuswahl()
        }

        /*        if (menge != null) {
                    val selectedItem = productList.firstOrNull { it.id == menge }
                    if (selectedItem != null) {
                        println("gewählte Menge ... ")
                        meinWarenkorb.add(selectedItem)
                    }*/

        println("weiter einkaufen? (j/n):  ")
        var jaNein = readln()
        if (jaNein == "j") {
            produkt()
        } else if (jaNein == "n") {
            userMenu()
        } else {
            print("falsche Eingabe!")
            userMenu()
        }


    }

//todo _________________________________________________________________________________________________________________

    fun backM() {
        println("Auf Wiedersehen!")
        warten2000()
        main()          // zurück auf die fun main. alles auf Anfang
    }

    fun backUM() {
        println("zurück zum KundenKonto")
        userMenu()          // zurück zur shopShop-Zone
    }

    fun backUK() {
        println("zurück zum KundenKonto")
        userKonto()          // zurück zum persönlichen Bereich
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
        warten2000()
        backUM()
    }

    override fun produkt() {        // Anzeige des Warenangebotes
        var leer = ""       // nur für formatierung
        println("unser Angebot\n")
        println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t \u001B[34mBewertung\u001B[0m")
        for (produkt in ProductList.productList)
            println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        this.userWarenAuswahl()
    }

//todo _________________________________________________________________________________________________________________

    fun backToUserBestellung() {
        println("Zurück zum Menü")
        userWarenAuswahl()
    }


/*  fun meinWarenkorb() {         //todo  nicht vergessen!
        var w = readln()
        println(w)
}*/

/*    fun addToList(item: String) {
            meinWarenkorb.add()
}*/

    fun auswahlMenge() {


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
//todo _________________________________________________________________________________________________________________
// Ü > mT/f(m)  10  CC

