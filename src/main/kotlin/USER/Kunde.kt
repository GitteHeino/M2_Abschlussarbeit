package USER

import ProductList
import ProductList.productList
import UserList.userList
import WAREN.Produkt
import alleProdukte
import main

import warten200
import warten2000
import warten500
import java.util.*

class Kunde(
        id: Int,
        name: String,
        firstName: String,
        eMail: String,
        password: String,
        var city: String,
        street: String,
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


        var userMenu = readln()
        when (userMenu) {
            "1" -> this.produkt()       // Einkauf
            "2" -> this.warenkorb()     // Warenkorb ansehen und bezahlen
            "3" -> this.userKonto()     // Kundendaten ändern
            "4" -> backM()              // ausloggen und zurück zum Anfang (fun main)
            /*            "5" -> getProducByNumber(id: Int)*/
            else -> userMenu            // neue Runde
        }
    }       // des Users eigene shopShop-Page (Einkauf()

//todo _________________________________________________________________________________________________________________

    fun userKonto() {
        println("\n\n\t\t\t \u001B[7m persönlicher Bereich \u001B[0m  $firstName $name\n")
        warten200()
        println("""Sie haben die Möglichkeit Ihre persönlichen Daten einzusehen und zu ändern. Und Sie können Ihren Kontostand
(und die Zahlungsmöglichkeiten) einsehen bzw. ändern.

        1 - Kontoguthaben
        2 - persönliche Daten einsehen
        3 - zurück zum KundenKonto
                 """.trimIndent()
        )

        var eingabe = readln().toInt()
        when (eingabe) {
            1 -> userGuthaben()
            2 -> anzeigenKundenEintrag(userList)
            3 -> backUM()


        }
    }       // des Users persönlicher Bereich

//todo _________________________________________________________________________________________________________________

    fun warenkorb() {
        println("\n\n\u001b[34mIhr Warenkorb enthält:\u001b[0m\n  ")
        var leer = ""
        println("\u001B[34mArtikel ${leer.padEnd(62, ' ')}\u001B[34mMenge\u001B[0m\t\t\u001B[34mPreis gesamt\u001B[0m")
        for (produkt in meinWarenkorb) {

            println("${produkt.name.padEnd(70, ' ')}\t${produkt.menge}\t\t\t${produkt.preis}€")
        }

        val gesamtPreis = meinWarenkorb.sumOf { it.preis * it.menge }
        val number = gesamtPreis
        val formattedNumber = String.format(Locale.ENGLISH, "%.2f", number)

        println("Gesamtpreis: ${leer.padEnd(68, ' ')} $formattedNumber€\n\n")
        backUM()
    }       // zeigt an was im Warenkorb ist

    fun userGuthaben() {

        val startBudgetKunde = 150.000
        val number = startBudgetKunde
        val formattedNumber = String.format(Locale.ENGLISH, "%.2f", number)
        println("\tAktuell haben Sie ein Budget von \u001b[43m $startBudgetKunde € \u001b[0m auf Ihrem Konto.\n")

        println("Wieviel möchten Sie auf Ihr Konto einzahlen?:  ")
        var kundenKontoEinzahlung = readln().toDouble() + startBudgetKunde

        var budgetKunde = startBudgetKunde
        println("\tSie haben nun ein Budget von \u001b[44;1m $kundenKontoEinzahlung € \u001b[0m für Ihre Einkäufe.")
        println("Siw können nun \u001B[34;1m\u001B[0minkaufen (e) oder \u001B[34;1m\u001B[0murück zum persönlichen bereich (z):  ")
        val select = readln()
        when(select){
            "z" -> backUK()
            "e" -> backUM()
        }
        warten2000()

    }       // Kontostand sehen und bearbeiten

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


        println("weiter einkaufen? (j/n):  ")
        var jaNein = readln()
        if (jaNein == "j") {
            this.produkt()
        } else if (jaNein == "n") {
            userMenu()
        } else {
            print("falsche Eingabe!")
            userMenu()
        }


    }       // Einkauf (in den Warenkorb)

//todo _________________________________________________________________________________________________________________

    fun backM() {
        println("Auf Wiedersehen!")
        warten2000()
        main()          // zurück auf die fun main. alles auf Anfang
    }       // zurück zum Start

    fun backUM() {
        println("\nzurück zum KundenMenu")
        userMenu()          // zurück zur shopShop-Zone
    }       // zum KundenMenu (eigene shopShop-Page)

    fun backUK() {
        println("\nzurück zum KundenKonto")
        userKonto()          // zurück zum persönlichen Bereich
    }       // zum persönlichen Bereich des Kunden

    private fun anzeigenKundenEintrag(userList: MutableList<User>) {
        println("Bitte geben Sie zur sicheren Identifikation hier Ihre eMail-Adresse an:  ")
        var gesuchteEmail = readln().toString()
        var k = userList.find { it.eMail == gesuchteEmail }
        if (k != null) {

            println("Name: ${k.name}")
            println("Vorname: ${k.firstName}")
            println("eMail: ${k.eMail}")
            println("Passwort: ******\t\t\t Passwort ändern (\u001b[4mj\u001b[0ma  \u001b[4mn\u001b[0mein  \u001b[4mz\u001b[0murück):  ")     // \u001b[4m
            var pwÄndern = readln()
            when (pwÄndern) {
                "j" -> println(" Passwort neu:")
                "n" -> println(" Passwort nicht ändern.")
                "z" -> backUK()
            }

            warten500()
            backUM()
        } else {
            println("Kein Kunde mit der angegebenen eMail-Adresse gefunden.")
            warten500()
            backUK()
        }
    }       // Anzeige der Kundendaten aus Liste

    override fun produkt() {        // Anzeige des Warenangebotes
        var leer = ""       // nur für formatierung
        println("unser Angebot\n")
        println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t \u001B[34mBewertung\u001B[0m")
        for (produkt in ProductList.productList)
            println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        alleProdukte()     // Ad
        this.userWarenAuswahl()
    }

//todo _________________________________________________________________________________________________________________

    /*
        fun backToUserBestellung() {
            println("Zurück zum Menü")
            userWarenAuswahl()
        }
    */

    /*    fun addToList(item: String) {
            meinWarenkorb.add()
}*/

    /*    fun auswahlMenge() {


    }*/

    /*    fun sterne() {
            println("Users Bewertung (* * * * *)")
        }
        */

    /*    fun zuürckZumKundenMenu() {
        userMenu()
    }*/

    /*    fun bezahlung(){

    }*/

}
// TODO Ende der Class Kunde

//todo _________________________________________________________________________________________________________________

