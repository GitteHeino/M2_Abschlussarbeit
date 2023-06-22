import KONTO.Konto
import kotlin.system.exitProcess
import java.time.LocalDate
import USER.Kunde
import USER.Manager
import USER.User
import UserList.userList
import WAREN.*


fun datenEingabe() {        // TODO  <- kotlin.collections.mutableListOf<User>
    println("Bitte geben Sie nacheinander Name, Vorname, eMail und ein Passwort - jeweils gefolgt von ENTER ein.")
    print("Nachname:  ")
    val name = readln()

    print("Vorname:  ")
    val firstName = readln()
    print("eMail:  ")
    val eMail = readln()
    print("Passwort:  ")
    val password = readln()
    var i = 0
    while (i < 3) {
        print("Bitte wiederholen Sie das Passwort:  \n")
        var password0 = readln()
        if (password0 == password) {
            print("\t◌ ◌ ◌ ◌ ◌ ◌ ◌ ◌\n\n")
            break
        } else {
            println("Die beiden Passwörter stimmen nicht überein. Bitte wiederholen …")
        }
        i++
    }


    println("Geben Sie nun noch Ihre Adresse an:")
    print("Wohnort:  ")
    val city = readln()
    print("PLZ: ")
    val zipCode = readln()
    print("Straße:  ")
    val street = readln()
    print("Nr:  ")
    val nr = readln()

/*    var j = 1
    while (j < 2) {
        try {       // TODO Warum springt die try catch an, wenn alles richtig ist?
            print("Nr:  ")
            val nr = readln().toInt()
        } catch (ex: Exception) {
            println("Nur Ziffern von 0 - 9 sind erlaubt")
            j++
        }
    }*/

    print("Geburtstag (dd.mm.yyyy):  ")
    val geburtstag = readln()

    print("Wählen Sie nun eine Anrede:\n" + " 1 für 'Sehr geehrte Frau', 2 für 'Sehr geehrter Herr', 3 für 'hej', 4 für 'Guten Tag': ")
    val anrede = auswahlAnrede()

    var neuerKunde = Kunde(0, name, firstName, eMail, password, city, street, 1, zipCode, geburtstag, anrede, meinWarenkorb = mutableListOf<Produkt>())
    userList.add(neuerKunde)

    println("\nKontrollieren Sie bitte Ihre Angaben:")

    println("${anrede} $firstName $name \neMail: $eMail\nPasswort: ****** \n$zipCode $city \n$street $nr\n$geburtstag")
    println("\n\t◌\n\n")

    println("Alles ok? \u001b[36mj\u001b[0ma  \u001b[36mn\u001b[0mein:")
    var ok = readln().capitalize()
/*    if (ok == "J") {
        warten200()
    }*/

    warteschleife2()
    if (ok == "J") {
        println("Jetzt können Sie shopShoppen :-)")

        warten500()
        neuerKunde.userMenu()

        val anrede = readLine()?.capitalize()

        println("\nKontrollieren Sie bitte Ihre Angaben (j - ok  n - ändern:  ")
        println("$anrede $firstName $name \neMail: \n$eMail \nPasswort: ******\n\n$zipCode$city\n$street $nr\n$geburtstag")
    } else if (ok == "N") {
        print("beginnen Sie nochmal ...\n")
        datenEingabe()
    } else
        println("Good bye!")

}       // Registrierung neuerKunde

fun auswahlAnrede(anrede: String = readln()): String {
    return when (anrede) {
        "1" -> "Sehr geehrte Frau"

        "2" -> "Sehr geehrter Herr"
        "3" -> "hi"
        "4" -> "Guten Tag"
        else -> "Ungültige Auswahl"
    }
}       // Anrede auswählen

fun produktAngebotAlleKategorien() {        // todo für den Kunden
    val warenAngebot = ProductList.productList
    val leer = " "
    println("\n\t\t = = = shopShop. DER Online_DrugStore! = = =\n")
    println("Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.\n")      // "Beachten sie auch unsere Sonderangebote!"
    /*println(">>> ${warenAngebot.size}.000 Produkte im Shop!\n\n")*/
    println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")


    for (produkt in warenAngebot) {
        println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        warten100()
    }
}     //  Liste aller Produkte im shopShop


//todo Manager _________________________________________________________________________________________________________

fun eingabeWarenP11() {
    println("Machen Sie alle Angaben zum neuen Artikel:  ")
    print("Artikel-ID:  ")
    var id = readln().toInt()

    print("Name:  ")
    var name = readln()

    print("Preis:  ")
    var preis = readln().toDouble()

    print("Rezension:  ")
    var kundenRezension = readln().toDouble()

    print("Zusatzinfos:  ")
    var merkmal = readln()

    print("Menge:  ")
    var menge = readln().toInt()

    print("Zielgruppe:  ")
    var who = readln()

    print("Produktgröße:  ")
    var size = readln()

    println("\n\tHinzugefügter Artikel:")
    var neuesProdukt = P11_BodyCare(id, name, preis, kundenRezension, merkmal, menge, who, size)
    ProductList.productList.add(neuesProdukt)
    /*    println(ProductList.productList[id])*/
    println("ID: ${neuesProdukt.id}   Artikel: ${neuesProdukt.name}   Preis: ${neuesProdukt.preis}   Bewertung: ${neuesProdukt.kundenRezension}   Produkteigenschaften: ${neuesProdukt.merkmal}   ${neuesProdukt.who}   Größe: ${neuesProdukt.size}")
    Thread.sleep(2000)

}       // Methode zum eintragen neuer Artikel i.d.Kat. BodyCare

fun eingabeWarenP12() {
    println("Machen Sie alle Angaben zum neuen Artikel:")
    print("Artikel-ID:  ")
    var id = readln().toInt()

    print("Name:  ")
    var name = readln()

    print("Preis:  ")
    var preis = readln().toDouble()

    print("Rezension:  ")
    var kundenRezension = readln().toDouble()

    print("Zusatzinfos:  ")
    var merkmal = readln()

    print("Antzahl:  ")
    var menge = readln().toInt()


    print("Anwendung (Text  max. 1.000 Zeichen):  ")
    var anwendungsBereich = readln()


    print("begrenzte Abgabe (ja/nein):  ")
    var begrenzteAbgabe = readln()
    /*    when (begrenzteAbgabe) {
                   "j" -> begrenzteAbgabe == "ja"
                    "n" -> begrenzteAbgabe == "nein"
        }*/

    print("\tHinzugefügter Artikel  :")
    var neuesProdukt = P12_Gesundheit(id, name, preis, kundenRezension, merkmal, menge, anwendungsBereich, begrenzteAbgabe)
    ProductList.productList.add(neuesProdukt)
    /*    println(ProductList.productList)*/
    println("ID: ${neuesProdukt.id}   Artikel: ${neuesProdukt.name}   Preis: ${neuesProdukt.preis}   Bewertung: ${neuesProdukt.kundenRezension}   Produkteigenschaften: ${neuesProdukt.merkmal}   Anwemndung: ${neuesProdukt.anwendungsBereich}   Abgabe begrenzt: ${neuesProdukt.begrenzteAbgabe}")
    Thread.sleep(2000)

}       // Methode zum eintragen neuer Artikel i.d.Kat. Gesundheit

fun eingabeWarenP21() {
    println("Machen Sie alle Angaben zum neuen Artikel:")
    print("Artikel-ID:  ")
    var id = readln().toInt()

    print("Name:  ")
    var name = readln()

    print("Preis:  ")
    var preis = readln().toDouble()

    print("Rezension:  ")
    var kundenRezension = readln().toDouble()

    print("Zusatzinfos:  ")
    var merkmal = readln()

    print("Antzahl:  ")
    var menge = readln().toInt()

    print("bio (ja/nein):  ")
    var bio = readln()
    /*    when (bio) {
            "j" -> bio == "ja"
            "n" -> bio == "nein"
        }*/

    println("Lebensmittel-Ampel")
    print("Bedeutung: F = Fett  S = Salz  Z = Zucker in den Stärken N-niedrig M-mittel H-hoch")
    print("Bedeutung: N - niedrig   M - mittel  H - hoch  (Werte für F S Z eingeben):  ")
    var feSaZu = readln().capitalize()

    println("\tHinzugefügter Artikel:")
    var neuesProdukt = P21_Lebensmittel(id, name, preis, kundenRezension, merkmal, menge, bio, feSaZu)
    ProductList.productList.add(neuesProdukt)
    /*    println(ProductList.productList)*/
    println("ID: ${neuesProdukt.id}   Artikel: ${neuesProdukt.name}   Preis: ${neuesProdukt.preis}   Bewertung: ${neuesProdukt.kundenRezension}   ProdEigensch…   Bio: ${neuesProdukt.bio}   Lebensmittel-Ampel: ${neuesProdukt.feSaZu}")
    Thread.sleep(2000)

}       // Methode zum eintragen neuer Artikel i.d.Kat. Lebensmittel

fun eingabeWarenP22() {
    println("Machen Sie alle Angaben zum neuen Artikel:")
    print("Artikel-ID:  ")
    var id = readln().toInt()

    print("Name:  ")
    var name = readln()

    print("Preis:  ")
    var preis = readln().toDouble()

    print("Rezension:  ")
    var kundenRezension = readln().toDouble()

    print("Zusatzinfos:  ")
    var merkmal = readln()

    print("Anzahl:  ")
    var menge = readln().toInt()

    print("Artikel ist gefährlich? (ja/nein):  ")
    var gefährlich = readln()

    print("Verwendung innen oder außen:  ")
    var innenAußen = readln()

    println("\tHinzugefügter Artikel:")
    var neuesProdukt = P22_Reinigungsmittel(id, name, preis, kundenRezension, merkmal, menge, gefährlich, innenAußen)
    ProductList.productList.add(neuesProdukt)
    /*    println(ProductList.productList)*/
    println("ID: ${neuesProdukt.id}   Artikel: ${neuesProdukt.name}   Preis: ${neuesProdukt.preis}   Berwertung: ${neuesProdukt.kundenRezension}  ProdEigensch…  Gefährdung: ${neuesProdukt.gefährlich}   Anwendungsbereich: ${neuesProdukt.innenAußen}")
    Thread.sleep(2000)


}       // Methode zum eintragen neuer Artikel i.d.Kat. Reinigungsmittel


    /*fun changePreis(neuerPreis: Double) {
    println("Geben sie master-Passwort ein")
    var input = readln()

    if (input == "master123") {
              this.preis = neuerPreis
    } else {
        println("Authorisierung fehlgeschlagen.")
    }
}*/       //todo   Preis ändern


//todo Kunde ___________________________________________________________________________________________________________


/*
    fun backToUserBestellung() {
        println("Zurück zum Menü")
        userWarenAuswahl()
    }
*/      // zurück zum KundenMenu / Start Warenangebot

/*    fun addToList(item: String) {
        meinWarenkorb.add()
}*/     // Artikel zum Warenkorb hinzufügen

/*    fun sterne() {
        println("Users Bewertung (* * * * *)")
    }
    */      // Bewertung durch kunden

/*    fun bezahlung(){

}*/


//todo allgemein _______________________________________________________________________________________________________

fun warteschleife() {
    Thread.sleep(300)
    print("Sie werden gleich weitergeleitet zum Shop  . ")
    Thread.sleep(300); print(".")
    Thread.sleep(300); print(" .")
    /*    Thread.sleep(300); print(" .")
        Thread.sleep(300); print(" .")*/
    Thread.sleep(300); print(" .")
    Thread.sleep(800); println("\n")
}       // großer PausenScreen ....

fun warteschleife2() {
    Thread.sleep(450)
}       // kleiner PausenScreen ....

fun warten50() {
    Thread.sleep(50)
}       // Pause in ms

fun warten100() {
    Thread.sleep(100)
}

fun warten200() {
    Thread.sleep(200)
}

fun warten500() {
    Thread.sleep(500)
}

fun warten1000() {
    Thread.sleep(1000)
}

fun warten2000() {
    Thread.sleep(2000)
}

fun date() {
    val now = LocalDate.now()
//    val nowWithTime = LocalDateTime.now()
//    println(nowWithTime)
    println(now)
}       // Datumsintegration

fun alleProdukte() {
    val warenkorb = ProductList.productList
    println("\ninsgesamt ${warenkorb.lastIndex + 1}.000 Produkte. Noch mehr gibt's auf unserer Partnerseite ...")


}        //  Anzahl der Produkte

//todo löschen/archivieren ProductList.kt ______________________________________________________________________________


    /*    fun getProducByCheapest(id: Int): Produkt? {

    val auswählen = readln().toInt()
    for (produkt in productList){
        if(produkt.preis ...){
            return produkt
        }
    }
    return null
}*/     // nach dem (billigsten …) selectieren

    /*    fun produktAngebotAlleKategorien() {
    val warenAngebot = ProductList.productList
    val leer = " "
    println("\n\t\t = = = shopShop. DER Online_DrugStore! = = =\n")
    println("Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.\n")      // "Beachten sie auch unsere Sonderangebote!"
            // println(">>> ${warenAngebot.size}.000 Produkte im Shop!\n\n")
    println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")


    for (produkt in warenAngebot) {
        println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        Thread.sleep(200)
    }
}*/     // alle Artikel im shopShop

            /*    println("Was möchten Sie sich näher ansehen? Geben Sie hierzu die angezeigte Nr. ein:  ")
val auswählen = readln().toInt()
if(auswählen == produkt.nr)*/
            // Was möchten Sie sich näher ansehen?



//todo Shop_DrugStore.kt _______________________________________________________________________________________________

/*import WAREN.P12_Gesundheit
import WAREN.P11_BodyCare
import WAREN.P21_Lebensmittel
import WAREN.P22_Reinigungsmittel*/

/*class KONTO.Shop_Drugstore() {

    *//*    init {
    * }*//*

    *//*fun willkommen() {
        println("shopShop - Ihr Drugstore digital um die Ecke!")
        Thread.sleep(1000)
    }*//*

    *//*    fun Produkt() {
            var produktDB = mutableListOf<String>()
            var produktKörper1 = P11_BodyCare(111, "Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L")
            var produktKörper2 = P11_BodyCare(112, "Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", "Men", "XL")
            var produktKörper3 = P11_BodyCare(113, "Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", "Woman", "S")

            var produktGesund = P12_Gesundheit(121, "Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", "", false)
            var produktGesund2 = P12_Gesundheit(122, "Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false)
            var produktGesund3 = P12_Gesundheit(123, "Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false)
            var produktGesund4 = P12_Gesundheit(124, "Test ", 7.95, 4.9, "Hals gurgeln", "", true)

            var produktLeben1 = P21_Lebensmittel(211, "Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", "ja", "H H N")
            var produktLeben2 = P21_Lebensmittel(212, "EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", "nein", " H H H")
            var produktLeben3 = P21_Lebensmittel(213, "Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan", "nein", "H M M")

            var produktReini1 = P22_Reinigungsmittel(221, "Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", "ja", "Nassbereich")
            var produktReini2 = P22_Reinigungsmittel(222, "Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
            var produktReini3 = P22_Reinigungsmittel(223, "Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", "nicht verschlucken!", "innen")
            println(produktDB.addAll(mutableListOf()))
        }*//*

    *//*    fun login()

        fun register()*//*

}*/


//todo löschen/archivieren Konto.kt ____________________________________________________________________________________

    /*fun shopkonto() {
        println("am $datum beträgt Ihr Guthaben: $kontostand")
    }*/

    /*    fun einzahlen(kundenKontoEinzahlung: Double) {
date()
print("wie viel möchten Sie einzahlen? (Betrag in € z.B. 100.0):  ")
var einzahlung = readln()
kontostand = kontostand + einzahlung

}
}*/

    /*fun date() {
val now = LocalDate.now()
//    val nowWithTime = LocalDateTime.now()
//    println(nowWithTime)
println(now)
}*/

            /*
val birthday = LocalDate.of(2000,1,1)
println(birthday)
val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")*/

    /*class Kontoo(val inhaber: String) {
    var kontostand: Double = 0.0
    val zahlungseingaenge: MutableList<Double> = mutableListOf()

    fun einzahlen(betrag: Double) {
        kontostand += betrag
        zahlungseingaenge.add(betrag)
    }

    fun bezahlen(rechnungsBetrag: Double) {
        kontostand -= rechnungsBetrag
    }
}*/

    /*object KundenKonto {
    private val konten: MutableMap<String, Konto> = mutableMapOf()

    fun kontoErstellen(kundenname: String) {
        konten[kundenname] = Konto(kundenname)
    }

    fun kontoLoeschen(kundenname: String) {
        konten.remove(kundenname)
    }

    fun kontoVorhanden(kundenname: String): Boolean {
        return konten.containsKey(kundenname)
    }

    fun konto(kundenname: String): Konto? {
        return konten[kundenname]
    }
}*/

            // oder:

    /*object ShopKonto {
    private val konto: Konto = Konto("Shop-Inhaber")

    fun konto(): Konto {
        return konto
    }
}*/

    /*fun main(){

// Kundenkonto erstellen
    KundenKonto.kontoErstellen("Max Mustermann")

// Einzahlung auf Kundenkonto
    val konto = KundenKonto.konto("Max Mustermann")
    konto?.einzahlen(100.0)


// Überprüfen des Kontostands des Shop-Inhabers
    val shopInhaberKonto = ShopKonto.konto()
    println("Kontostand des Shop-Inhabers: ${shopInhaberKonto.kontostand}")

// Löschen des Kundenkontos
    KundenKonto.kontoLoeschen("Max Mustermann")

}*/



//todo löschen/archivieren _____________________________________________________________________________________________

    /*fun registerNeu() {
    println("Möchten Sie einen neuen Account anlegen? j/n:  ")
    var neuerAccount = readln().capitalize().toString()
    while (neuerAccount == "j") {
        if (neuerAccount == "n") {
            exitProcess(0)
            when (neuerAccount) {
                "J" -> datenEingabe()
                "N" -> exitProcess(0)       // TODO ersetzen mit back()
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

            }
        }
    }
}
*/

    /*fun shopKonto() {

}*/

    /*fun login(){
    println("shopShop - Deine Online-Drogerie")
    println("Loggen Sie sich mit Ihren Anmeldedaten ein. ▷▷ " +
            "eMail oder Benutzername:")

    try {
        var loginM = readln().toString()
        println("Passwort (nur Zahlen und Buchstaben):")
        var loginP = readln().toString()
        println(loginM + loginP)
        if (userDB.any { it.eMail == loginM }) {       // User mit eMail raussuchen und mit PW abgleichen
            println("Hallo!")
            println(loginM + loginP)

            var listOfData = Produkt()
            println(listOfData)

            println(
                "Unser Shop bietet das Beste aus den 2 Kategorien: " +
                        "Haushalt und BodyCare"
            )

        }
    } catch (ex: Exception) {
        println("Sie haben eMail/Benutzername oder das Passwort falsch eingegeben.")
    }*/       //todo löschen/archivieren

    /*fun userMenuAnzeige(){
   println(
            """
            Bitte wählen sie aus:

                1 - Einkaufen
                2 - Warenkorb ansehen
                3 - Konto einsehen
                4 - ausloggen
            Beachten Sie auch unsere tagesaktuellen Angebote!
        """.trimIndent()
    )
    var userMenu = readln().toInt()
    when (userMenu) {
        1 -> this.produkt()
        2 -> this.userWarenAuswahl()
        3 -> this.userKonto()
        4 -> backM()
    }
}*/     //todo wie diese fun ausserhalb userMenu()



//todo println()'s _____________________________________________________________________________________________________


            /*println("\nKontrollieren Sie bitte Ihre Angaben:")
auswahlAnrede().toString()
println("$firstName $name \neMail: $eMail \nPasswort: ****** \n$zipCode\t$city \n$street $nr \n$geburtstag") // TODO  <- ${auswahlAnrede()}
println("\n\n\t◌\t◌\n\n")*/

            /*println("Alles ok? J/N:")
var ok = readln().capitalize().toString()
if (ok == "J") {
println("Jetzt können Sie shopShoppen :-)")     //TODO

produktAngebotAlleKategorien()


} else if (ok == "N") {
datenEingabe()
} else
println("Good bye!")
exitProcess(1)
}       // TodO Zeile 87: Abkürzung (?? gibt es die noch ?) rausnehmen, wenn fertig!*/

            // (\u001b[4mj\u001b[0ma  \u001b[4mn\u001b[0mein)*/             // Abfrage ( ja/nein ) unterstrichen




//todo fun.main ________________________________________________________________________________________________________

//    anmeldung()
//    warteschleife()
//    auswahlStart()      // User(), produkteDatenbank
//    alleProdukte()


    /*fun auswahlStart() {
    var warenkorb = mutableListOf<Produkt>()
    val auswahl = readln().capitalize()
    when (auswahl) {
        "L" -> {
            val kundenAccount = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14", warenkorb)
            kundenAccount.userMenu()

        }

        "R" -> {
            val kundenAccount = datenEingabe()
        }


        "M" -> {

            val managerAccount = Manager(0, "Unbekannt", "Kiki", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17")
            managerAccount.managerMenu()

        }

        else -> {
            println("Ungültige Eingabe")
            exitProcess(1)
        }
    }
} */       //


            // Variante

   /* fun alleProdukte() {
    val warenkorb = mutableListOf( ProductList.productList, " ", "Heute frisch eingetroffen: Toilettenpapier und Nudeln! Greifen Sie zu …")
    println("\ninsgesamt ${warenkorb.lastIndex + 1}.000 Produkte. Noch mehr gibt's auf unserer Partnerseite ...")*/



//todo User.kt _________________________________________________________________________________________________________


    /*fun logout() {
}*/

    /*
fun bezahlen() {
}*/
