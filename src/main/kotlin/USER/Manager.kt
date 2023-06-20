package USER

import ProductList
import WAREN.P11_BodyCare
import WAREN.P12_Gesundheit
import WAREN.P21_Lebensmittel
import WAREN.P22_Reinigungsmittel
import eingabeWarenP11
import eingabeWarenP12
import eingabeWarenP21
import eingabeWarenP22

class Manager(id: Int, name: String, firstName: String, eMail: String, password: String, var shopID: Int = 1, var shopCity: String = "", var shopStreet: String, var shopHausNr: Int, val shopZIP: String = "", var passwordAdmin: String = "") : User(id, name, firstName, eMail, password) {

    init {
    }

    override fun toString(): String {
        return "$name"
    }       // macht den eigentlichen Inhalt (des Speicherplatzes) sichtbar

//todo -----------------------------------------------------------------------------------------------------------------

    fun passwordAdmin() {
    }

    fun warenbestandPrüfen() {
    }

    fun kontoStand() {
    }

//todo -----------------------------------------------------------------------------------------------------------------


    fun managerMenu() {
        println(" Guten Morgen Manager\n")
        repeat(2) {
            println("""
                1 Kontostand einsehen
                2 neue Waren ins Sortiment
                3 Preise ändern
                4 Mitarbeiter loben
                5 Test
            """.trimIndent())

            var job = readln()
            when (job) {
                "1", "Jan", "Januar" -> {/*kontoStand()*/
                    println("Gestern war der Kassenbestand: ... €")
                }

                "2" -> {
                    neueWarenInsSortiment()
                    println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")
                }

                "3" -> {
                    //preisÄnderung()
                    preisÄnderung()
                }

                else -> {
                    println("falsche Eingabe! 😢")
                    return
                }
            }
        }
    }

    fun neueWarenInsSortiment() {
        println("In welcher Kategorie sollen neue Waren aufgenommen werden?\n")
        println("""Wählen Sie zwischen 
                  P11_BodyCare = 1  
                  P12_Gesundheit = 2  
                  P21_Lebensmittel = 3  
                  P22_Reinigungsmittel = 4""".trimIndent())
        var userAuswahl = readln().toInt()

        if (userAuswahl == 1) {
            println("Kategorie BodyCare")
            eingabeWarenP11()
            for (product in ProductList.productList) {
                if (product is P11_BodyCare) println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
                backNA()
            }

        } else if (userAuswahl == 2) {
            println("Kategorie Gesundheit")
            eingabeWarenP12()
            for (product in ProductList.productList) {
                if (product is P11_BodyCare) println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
                backNA()
            }

        } else if (userAuswahl == 3) {
            println("Kategorie Lebensmittel")
            eingabeWarenP21()
            for (product in ProductList.productList) {
                if (product is P11_BodyCare) println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
                backNA()
            }

        } else if (userAuswahl == 4) {
            println("Kategorie Reinigungsmittel")
            eingabeWarenP22()
            for (product in ProductList.productList) {
                if (product is P11_BodyCare) println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
                backNA()
            }
        }
    }


    fun preisÄnderung() {

        // ProductTyp auswahl:

        println("""Die Warenliste. Wählen Sie zwischen 
                  P11_BodyCare = 1  
                  P12_Gesundheit = 2  
                  P21_Lebensmittel = 3  
                  P22_Reinigungsmittel = 4""".trimIndent())

        var userAuswahl = readln().toInt()
        if (userAuswahl == 1) {
            println("Kategorie BodyCare")
            for (product in ProductList.productList) {
                if (product is P11_BodyCare)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${
                        product.name.padEnd(70, ' ')
                    }\t Preis: ${product.preis}€")

            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Alter Preis für ${ProductList.productList[userInput - 1].name}  ArtikelNummer: ${ProductList.productList[userInput - 1].id}    \u001B[34m${ProductList.productList[userInput - 1].preis}€.\u001B[0m")
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("Sie haben erfolgreich für ${ProductList.productList[userInput - 1].name}  mit der ArtikelNummer: ${ProductList.productList[userInput - 1].id}  den Preis auf jetzt:  \u001b[31m$neuerPreis€ \u001B[0mgesetzt. \uD83D\uDE00\n")
            backNP()


        } else if (userAuswahl == 2) {
            println("Kategorie Gesundheit")
            for (product in ProductList.productList) {
                if (product is P12_Gesundheit)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${
                        product.name.padEnd(70, ' ')
                    }\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Alter Preis für ${ProductList.productList[userInput - 1].name}  ArtikelNummer: ${ProductList.productList[userInput - 1].id}    \u001B[34m${ProductList.productList[userInput - 1].preis}€.\u001B[0m")
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("Sie haben erfolgreich für ${ProductList.productList[userInput - 1].name}  mit der ArtikelNummer: ${ProductList.productList[userInput - 1].id}  den Preis auf jetzt:  \u001b[31m$neuerPreis€ gesetzt. 😀\u001B[0m\n\n")
            backNP()


        } else if (userAuswahl == 3) {
            println("Kategorie Lebensmittel")
            for (product in ProductList.productList) {
                if (product is P21_Lebensmittel)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${
                        product.name.padEnd(70, ' ')
                    }\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Alter Preis für ${ProductList.productList[userInput - 1].name}  ArtikelNummer: ${ProductList.productList[userInput - 1].id}    \u001B[34m${ProductList.productList[userInput - 1].preis}€.\u001B[0m")
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("Sie haben erfolgreich für ${ProductList.productList[userInput - 1].name}  mit der ArtikelNummer: ${ProductList.productList[userInput - 1].id}  den Preis auf jetzt:  \u001b[31m$neuerPreis€ gesetzt. 😀\u001B[0m\n\n")
            backNP()


        } else if (userAuswahl == 4) {
            println("Kategorie Reinigungsmittel")
            for (product in ProductList.productList) {
                if (product is P22_Reinigungsmittel)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${
                        product.name.padEnd(70, ' ')
                    }\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Alter Preis für ${ProductList.productList[userInput - 1].name}  ArtikelNummer: ${ProductList.productList[userInput - 1].id}    \u001B[34m${ProductList.productList[userInput - 1].preis}€.\u001B[0m")
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("Sie haben erfolgreich für ${ProductList.productList[userInput - 1].name}  mit der ArtikelNummer: ${ProductList.productList[userInput - 1].id}  den Preis auf jetzt:  \u001b[31m$neuerPreis€ gesetzt. 😀\u001B[0m\n\n")
            backNP()
        }


    }


    fun sonderAngebote() {
    }


    fun backM() {
        println("Zurück zum managerMenu")
        Thread.sleep(1500)
        managerMenu()
    }

    fun backNA() {
        println("weitere Artikel hinzufügen (j/n)?:  ")
        Thread.sleep(1500)
        var jaNein = readln()
        when (jaNein) {
            "j" -> neueWarenInsSortiment()
            "n" -> managerMenu()
        }
    }
    fun backNP() {
        println("Preise für weitere Artikel ändern (j/n)?:  ")
        Thread.sleep(1500)
        var jaNein = readln()
        when (jaNein) {
            "j" -> preisÄnderung()
            "n" -> managerMenu()
        }
    }



}


//todo -----------------------------------------------------------------------------------------------------------------



