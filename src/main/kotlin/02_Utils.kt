import USER.Kunde
import kotlin.system.exitProcess


fun datenEingabe() {        // TODO  <- kotlin.collections.mutableListOf<User>
    println("Bitte geben Sie nacheinander Name, Vorname, eMail und ein Passwort - jeweils gefolgt von ENTER ein.")
    print("Nachname:  ")
    val name = readln()
    print("Vorname:  ")
    val firstName = readln()
    print("eMail:  ")
    val eMail = readln()
    print("Passwort:  ")
    var i = 0
    while (i < 3) {
        var password0 = readln().toString()
        print("Bitte wiederholen Sie das Passwort:  \n")
        val password = readln().toString()
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
    val city = readln().toString()
    print("PLZ: ")
    val zipCode = readln().toString()
    print("Straße:  ")
    val street = readln().toString()

    var j = 1
    /*while (j < 2) {*/
    try {       // TODO Warum springt die try catch an, wenn alles richtig ist?
        print("Nr:  ")
        val nr = readln().toInt()
    } catch (ex: Exception) {
        println("Nur Ziffern von 0 - 9 sind erlaubt")
        j++
    }

    print("Geburtstag (dd.mm.yyyy):  ")
    val geburtstag = readln().toString()



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
}       //todo  für Registrierung neuerKunde

fun produktAngebotAlleKategorien() {        // todo für den Kunden
    val warenAngebot = ProductList.productList
    val leer = " "
    println("\n\t\t = = = shopShop. DER Online_DrugStore! = = =\n")
    println("Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.\n")      // "Beachten sie auch unsere Sonderangebote!"
    /*println(">>> ${warenAngebot.size}.000 Produkte im Shop!\n\n")*/
    println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")


    for (produkt in warenAngebot) {
        println("${produkt.id}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        Thread.sleep(200)
    }
}     //  Liste der Produkte

//todo _________________________________________________________________________________________________________________

fun changePreis(neuerPreis: Double){
    println("Geben sie master-Passwort ein")
    var input = readln()

    if (input == "master123"){
/*        this.preis = neuerPreis*/
    }
    else {
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