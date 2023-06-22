import kotlin.system.exitProcess
import java.time.LocalDate
import USER.Kunde
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
            print("\t◌\n\n")
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

    var j = 1
    while (j < 2) {
        try {       // TODO Warum springt die try catch an, wenn alles richtig ist?
            print("Nr:  ")
            val nr = readln().toInt()
        } catch (ex: Exception) {
            println("Nur Ziffern von 0 - 9 sind erlaubt")
            j++
        }
    }

    print("Geburtstag (dd.mm.yyyy):  ")
    val geburtstag = readln()


    print("Wählen Sie nun eine Anrede:\n" + " 1 für 'Sehr geehrte Frau', 2 für 'Sehr geehrter Herr', 3 für 'hej', 4 für 'Guten Tag': ")
    val anrede = auswahlAnrede()


    var neuerKunde = Kunde(0, name, firstName, eMail, password, city, street, 1, zipCode, geburtstag, anrede, meinWarenkorb = mutableListOf<Produkt>())
    userList.add(neuerKunde)


/*        when (anrede) {
            "1" -> {
                print("Sehr geehrte Frau ")
                *//*ergebnisListe.add("Sehr geehrte Frau")*//*
            }

            "2" -> {
                print("Sehr geehrter Herr ")
                *//*ergebnisListe.add("Sehr geehrter Herr")*//*
            }

            "3" -> {
                print("hej ")
                *//*userDB.add("hi")*//*
            }

            "4" -> {
                print("Guten Tag ")
                *//*ergebnisListe.add("Guten Tag")*//*
            }

            else -> {
                println("Ungültige Auswahl")
            }
        }*/



    println("\nKontrollieren Sie bitte Ihre Angaben:")

    println("${anrede} $firstName $name  \neMail: $eMail | \nPasswort: ****** | \n$zipCode $city \n$street $nr\n$geburtstag")
    println("\n\t◌\t◌\n\n")

    println("Alles ok? J/N:")
    var ok = readln().capitalize()
    if (ok == "J") {
        warten200()

    }


    warteschleife()
    if (ok == "J") {
        println("Jetzt können Sie shopShoppen :-)")
        /*            userKonto()*/
        /*            exitProcess(5)*/
        warten500()
        neuerKunde.userMenu()




        val anrede = readLine()?.capitalize()

        /*val ausgewehlteAnrede = auswahlAnrede()*/

        println("\nKontrollieren Sie bitte Ihre Angaben (j - ok  n - ändern:  ")
        println("$anrede $firstName $name \neMail: \n$eMail \nPasswort: ******\n\n$zipCode$city\n$street $nr\n$geburtstag")
    } else if (ok == "N") {
        datenEingabe()
    } else
        println("Good bye!")

}       // Registrierung neuerKunde
 fun auswahlAnrede(anrede: String = readln()): String {
     return when (anrede) {
         "1" -> "Sehr geehrte Frau "
         "2" -> "Sehr geehrter Herr "
         "3" -> "hi "
         "4" -> "Guten Tag "
         else -> "Ungültige Auswahl "
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


}       // Methode zum eintragen neuer Artikel i.d.Kat. Reigungsmittel

//todo _________________________________________________________________________________________________________________

fun changePreis(neuerPreis: Double) {
    println("Geben sie master-Passwort ein")
    var input = readln()

    if (input == "master123") {
        /*        this.preis = neuerPreis*/
    } else {
        println("Authorisierung fehlgeschlagen.")
    }
}       //todo  für Manager  Preis ändern

fun warteschleife() {
    Thread.sleep(700)
    print("Sie werden gleich weitergeleitet zum Shop  . ")
    Thread.sleep(300); print(".")
    Thread.sleep(300); print(" .")
    /*    Thread.sleep(300); print(" .")
        Thread.sleep(300); print(" .")*/
    Thread.sleep(300); print(" .")
    Thread.sleep(800); println("\n")
}       //todo  für überall

fun warten50() {
    Thread.sleep(50)
}

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
}

//todo _________________________________________________________________________________________________________________
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
}       //todo löschen/archivieren

//todo _________________________________________________________________________________________________________________

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

//todo _________________________________________________________________________________________________________________

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

/*fun shopKonto() {

}*/

