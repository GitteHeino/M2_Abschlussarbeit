package USER

import ProductList
import UserList
import WAREN.P11_BodyCare
import WAREN.P12_Gesundheit
import WAREN.P21_Lebensmittel
import WAREN.P22_Reinigungsmittel
import produktAngebotAlleKategorien

class Manager(
        id: Int,
        name: String,
        firstName: String,
        eMail: String,
        password: String,
        var shopID: Int = 1,
        var shopCity: String = "",
        var shopStreet: String,
        var shopHausNr: Int,
        val shopZIP: String = "",
        var passwordAdmin: String = ""
) : User(id, name, firstName, eMail, password) {

    init {
    }

    override fun toString(): String {
        return "$name"
    }       // macht den eigentlichen Inhalt (des Speicherplatzes) sichtbar

// TODO _________________________________________________________


    // TODO _________________________________________________________
    fun passwordAdmin() {
    }

    fun warenbestandPrüfen() {
    }

    fun managerMenu() {
        println(" Guten Morgen Manager\n")
        repeat(2) {
            println("""
                    1 Kontostand einsehen
                    2 Waren bestellen
                    3 Preise ändern
                    4 Mitarbeiter loben
                    5 Test
            """.trimIndent()
            )

            var job = readln()
            when (job) {
                "1", "Jan", "Januar" -> {
                    /*kontoStand()*/
                    println("Gestern war der Kassenbestand: ... €")
                }

                "2" -> {
                    /*warenbestellung()*/
                    warenbestellung()
                    /*println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")*/
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

    fun kontoStand() {
    }

    fun kontostandstandPrüfen() {
    }

    fun warenBestellen() {
    }

    fun warenbestellung() {
        produktAngebotAlleKategorien()
    }

    fun preisÄnderung() {

        // ProductTyp auswahl:

        println(
                """Die Warenliste. Wählen Sie zwischen 
                  P11_BodyCare = 1  
                  P12_Gesundheit = 2  
                  P21_Lebensmittel = 3  
                  P22_Reinigungsmittel = 4"""
                        .trimIndent())

        var userAuswahl = readln().toInt()
        if (userAuswahl == 1) {
            println("Kategorie BodyCare")
            for (product in ProductList.productList) {
                if (product is P11_BodyCare)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")

            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("erfolgreich ${ProductList.productList[userInput - 1].id} ${ProductList.productList[userInput - 1].name} auf $neuerPreis")


        } else if (userAuswahl == 2) {
            println("Kategorie Gesundheit")
            for (product in ProductList.productList) {
                if (product is P12_Gesundheit)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("erfolgreich ${ProductList.productList[userInput - 1].id} ${ProductList.productList[userInput - 1].name} auf $neuerPreis")


        } else if (userAuswahl == 3) {
            println("Kategorie Lebensmittel")
            for (product in ProductList.productList) {
                if (product is P21_Lebensmittel)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("erfolgreich ${ProductList.productList[userInput - 1].id} ${ProductList.productList[userInput - 1].name} auf $neuerPreis")


        } else if (userAuswahl == 4) {
            println("Kategorie Reinigungsmittel")
            for (product in ProductList.productList) {
                if (product is P22_Reinigungsmittel)  // && userAuswahl)
                    println("ID: ${product.id}\t Artikel: ${product.name.padEnd(70, ' ')}\t Preis: ${product.preis}€")
            }
            println("\nFür welchen Artikel möchten Sie den Preis ändern? Trage die ID ein:  ")
            var userInput = readln().toInt()
            println("Wie lautet der neue Preis?:  ")
            var neuerPreis = readln().toDouble()
            ProductList.productList[userInput - 1].preis = neuerPreis
            println("erfolgreich ${ProductList.productList[userInput - 1].id} ${ProductList.productList[userInput - 1].name} auf $neuerPreis")
            return
        }


        fun sonderAngebote() {
        }


//todo -----------------------------------------------
// Ü > mT/f(m)  40  Preise ändern


    }
}


