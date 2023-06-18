import WAREN.*
import USER.*
import kotlin.system.exitProcess

// Globale Variablen

fun main() {
    val header = listOf("Artikel", "Preis", "Bewertung")       // txt2tab
    val produkteDatenbankT = mutableListOf<ProductList>()       // txt2tab

    // userDB:

    /*    var login = User()
    var user = User()*/
    /*   val userKunde1 = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
    val userKunde2 = Kunde(102, "Niblock", "Phil", "ayulive@dot.com", "ayufirst", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07")
    val userKunde3 = Kunde(103, "Nagel", "Jenny", "nagel.je@web.de", "1234", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23")
    val userManager = Manager(0, "Unbekannt", "Kiki", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17")
    val userMitarbeiter11 = Mitarbeiter(11, "Bogenmacher", "Paul", "bmp", "000", "Honk")
    val userMitarbeiter12 = Mitarbeiter(12, "C", "A", "c", "4", "Honk")
*/

    /*    var userDatenbank = mutableListOf<User>()
        *//*userKunde1, userKunde2, userKunde3, userMitarbeiter11 ,userMitarbeiter12, userManager*/

    // produkteDB:
    val produkte = Produkt(0, "", 0.0, 5.0)
    /* var produkte = mutableListOf<Produkt>()*/

    // produkteDB: für txt2tab
    var produkteDatenbank = mutableListOf<Produkt>()
    /* produktKörper1,
       produktKörper2,
       produktKörper3,
       produktGesund1,
       produktGesund2,
       produktGesund3,
       produktLeben1,
       produktLeben2,
       produktLeben3,
       produktReini1,
       produktReini2,
       produktReini3*/

    // …
    /*    var userMenus = User()*/

    //
    var neuKunde = User()
    /*100, "Mustermann", "Max", "eMail", "password", "Musterstadt", "X-Straße", 11, "12345", "hi", "11-11-2000"*/

    // tempAusdruck
    println("produkteDB> ${produkteDatenbankT}\n" + "produkte> ${produkte}\n" + "header> $header\n\n")


//TODO -----Ende der Variablenerstellung fun main------------------------------

    willkommen()
    auswahlStart()        // User(), produkteDatenbank
    input()
    warteschleife()
    produkt()
    alleProdukte()


//TODO -----Ende der fun maim--------------------------------------------------


    fun willkommen() {
        /*    println(
                "shopShop - Ihr Drugstore digital um die Ecke!\n Loggen sie sich zuerst ein oder melden sie sich neu an."
            )*/
        println("shopShop - Deine Online-Drogerie\n" +
                "Bitte  L  eingeben für LogIn oder  R  für Registrierung:")
        Thread.sleep(1200)

        /*return*/
    }

    fun auswahlStart(/*userDB: MutableList<User>, produkteDatenbank: MutableList<Produkt>*/) {
        var auswahl = readln().capitalize().toString()
        when (auswahl) {
            "L" -> println("logIn  ")

            "R" -> println("  signUp")
        }
    }

    fun anmeldung() {
        var login = User()

    }

    /*fun login(user: MutableList<UserDB>) {
        println(
                "Benutzername (eMail):"     //todo Zuerst müssen Sie sich mit Ihren Anmeldedaten einloggen.
        )
        var i = 1
        while (i <= 3) {
            var loginM = readln().toString()
            println("Passwort (nur Zahlen und Buchstaben):")
            var loginP = readln().toString()
            *//*        if (userDB.any { loginM == it.eMail && loginP == it.password }) {*//*
            if (loginM == "cc" && loginP == "44") {
                println("2FA  Geben Sie nun Ihre ID ein:")
                try {
                    var loginI = readln().toInt()
                    if(loginI == 0 )
                    *//*if (userDatenbank.any { it.id == loginI })*//*
                        manager(User())
                } catch (ex: Exception) {
                    println("Die ID stimmt nicht")
                }
            } else *//*if (userDatenbank.any {
                        loginM == it.eMail && it.password == loginP     // Justus
                    }) {
                println("yes!")
                true
                *//**//* myAccount()     // return: eMail des Kunden*//**//*
            } else {
                println("Diese Kombination existiert nicht in unserer Datenbank.")
            }*//*
            i++
            if (i > 2) {
                println("Zu viele Fehlversuche. Der Login-Vorgang wird beendet.\n")
                exitProcess(0)
            }
            false
        }
    }*/



    fun myAccount(kunde: Kunde) {
        /*TODO("hier beginnt der Account des Kunden")*/
        println("hier beginnt der Account des Kunden")
        /*userMenu(userDB: MutableList<User>)*/
        /*    userMenus()*/
        kunde.produkt()

        /*    warenkorb()*/
    }       //todo  >>> in Class USER

    fun manager(userDB: MutableList<User>) {
        println("       Guten Morgen Manager\n")
        repeat(5) {
            println(
                    "1 Kontostand einsehen\n" +
                            "2 Waren bestellen\n" +
                            "3 Preise ändern\n" +
                            "4 Mitarbeiter loben\n"
            )

            var job = readln()
            when (job) {
                "1", "Konto", "Millionär" -> {
                    /* kontoStand()*/
                    println("Gestern war der Kassenbestand: ... €")
                }

                "2" -> {
                    /*warenbestellung()*/
                    println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")
                }

                "3" -> {
                    /*preisÄnderung()*/
                    println("Die Preise für Waschmittel anpassen")
                }

                else -> {
                    println("falsche Eingabe! 😢")
                    return

                }
            }
        }
    }       //todo  >>> in Class Manager


}


fun willkommen() {
    println(
            "shopShop - Ihr Drugstore digital um die Ecke!\n Loggen sie sich zuerst ein oder melden sie sich neu an."
    )

    println("shopShop - Deine Online-Drogerie\n" +
            "Bitte  L  eingeben für LogIn oder  R  für Registrierung:")
    Thread.sleep(1200)

    return
}

fun auswahlStart() {        // userDB: User, produkteDatenbank: MutableList<Produkt>
    var auswahl = readln().capitalize().toString()
    /*    when (auswahl) {
            "L" -> println("logIn  ");
            "R" -> println("  signUp")
            "M" -> println("Manager")
        }*/

    when (auswahl) {
        "L" -> {
            val kundenAccount = Kunde()
            kundenAccount.userBestellung()
        }

        "M" -> {

            val managerAccount = Manager()
                    managerAccount.warenbestandPrüfen()

        }

        else -> {
            println("Ungültige Eingabe")
            exitProcess(1)
        }
    }
}



fun input() {
    println("eMail")
    val inputEmail = readLine()
    println("password")
    val inputPassword = readLine()

    val loggedInUser = UserList.userList.find { user ->
        user.login(inputEmail, inputPassword)
    }
    if (loggedInUser != null) {
        println("Login erfolgreich: ${loggedInUser.firstName}")
    } else {
        println("Login fehlgeschlagen")
    }
}


fun warteschleife() {
    Thread.sleep(700)
    print("Sie werden gleich weitergeleitet zum Shop  . ")
    Thread.sleep(300); print(".")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(800); println("\n")
}

fun produkt() {
    val warenAngebot = ProductList.productList
    val leer = " "
    println("\n\t\t = = = shopShop. DER Online_DrugStore! = = =\n")
    println("Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.")      // "Beachten sie auch unsere Sonderangebote!"
    println(">>> ${warenAngebot.size}.000 Produkte im Shop!\n\n")
    println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")


    for (produkt in warenAngebot) {
        println("${produkt.nr}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
        Thread.sleep(200)


    }
}

fun alleProdukte() {
    val warenkorb = ProductList.productList
    println("\ninsgesamt ${warenkorb.lastIndex + 1}.000 Produkte. Noch mehr gibt's auf unserer Partnerseite ...")


}








