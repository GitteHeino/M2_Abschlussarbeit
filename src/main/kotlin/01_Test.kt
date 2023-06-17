import WAREN.*
import USER.*
import java.lang.Exception

// txt2tab
val header = listOf("Artikel", "Preis", "Bewertung", "Anwendungsbereich", "begrenzteAbgabe")
val produkteDatenbankT = mutableListOf<Produkt>()
fun main() {

    // produkteDatenbank
    var produktKörper1 = U1_bodyCare("Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L")
    var produktKörper2 = U1_bodyCare("Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", "Men", "XL")
    var produktKörper3 = U1_bodyCare("Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", "Woman", "S")

    var produktGesund1 = U1_Gesundheit("Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", "", false)
    var produktGesund2 = U1_Gesundheit("Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false)
    var produktGesund3 = U1_Gesundheit("Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false)

    var produktLeben1 = U2_Lebensmittel("Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N")
    var produktLeben2 = U2_Lebensmittel("EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H")
    var produktLeben3 = U2_Lebensmittel("Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan", true, "H M M")

    var produktReini1 = U2_Reinigungsmittel("Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", "ja", "Nassbereich")
    var produktReini2 = U2_Reinigungsmittel("Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
    var produktReini3 = U2_Reinigungsmittel("Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", "nicht verschlucken!", "innen")

    // userDB
    val userKunde1 = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
    val userKunde2 = Kunde(102, "Niblock", "Phil", "ayulive@dot.com", "ayufirst", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07")
    val userKunde3 = Kunde(103, "Nagel", "Jenny", "nagel.je@web.de", "1234", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23")
    val userManager = Manager(0, "Unbekannt", "Kiki", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17")
    val userMitarbeiter = Mitarbeiter(11, "Bogenmacher", "Paul", "bmp", "000", "Honk")

    var produkteDatenbank = mutableListOf<Produkt>(
        produktKörper1, produktKörper2, produktKörper3,
        produktGesund1, produktGesund2, produktGesund3,
        produktLeben1, produktLeben2, produktLeben3,
        produktReini1, produktReini2, produktReini3
    )
    var userDB = mutableListOf<User>(
        userKunde1, userKunde2, userKunde3, userMitarbeiter, userManager
    )
    var userMenus = Produkt()

    var neuKunde = Kunde(100, "Mustermann", "Max", "eMail", "password", "Musterstadt", "X-Straße", 11, "12345", "hi", "11-11-2000")

//TODO -----Ende der fun maim-----------------------------------------------

    willkommen()
    auswahlStart(userDB, produkteDatenbank) //TODO  Boolean
    login(userDB)

    neuKunde.registerNeu()
/*    Shop_Drugstore()        //TODO   … der Daten für txt2tab*/

    /*    // TODO Test  import
        val mensch = Person("host", "KRAUSE", 88)
        mensch.geburtstag()
        println("\n")*/

    produkt(produkteDatenbankT) // TODO  zeigt Produkte in Tabelle


}

//TODO -----Ende der fun maim-----------------------------------------------

/*fun userMenu(userMenus: Unit) {
}*/
fun willkommen() {
/*    println(
        "shopShop - Ihr Drugstore digital um die Ecke!\n Loggen sie sich zuerst ein oder melden sie sich neu an."
    )*/
    println("shopShop - Deine Online-Drogerie\n" +
        "Bitte  L  eingeben für LogIn oder  R  für Registrierung:")
/*    Thread.sleep(1200)*/
    return
}

fun auswahlStart(userDB: MutableList<User>, produkteDatenbank: MutableList<Produkt>): Boolean {
    var auswahl = readln().capitalize().toString()
    if (auswahl == "L") {
        println("Login")
        return true
    }else
    /*register(userDB: MutableList<Kunde>)*/
    return false

        /*when (auswahl) {
        "R" -> register()
        "L" -> login(userDB)
        "P" -> produkt(produkteDatenbank)
    }*/
}

fun tabelle(produkteDatenbank: MutableList<Produkt>, produkteDatenbankT: MutableList<Produkt>) {

    /*    produkteDatenbankT.add(produktKörper1)
        produkteDatenbankT.add(produktKörper2)
        produkteDatenbankT.add(produktKörper3)*/

    val columnWidths = listOf(70, 10, 10, 30, 30)

    val headerRow = header.mapIndexed { index, header ->
        header.padEnd(columnWidths[index])
    }.joinToString(" | ")
    println(headerRow)

    val separator = columnWidths.map { "-".repeat(it) }.joinToString(" | ")
    println(separator)


    for (row in produkteDatenbank) {
        val formattedRow = listOf(
            row.name,
            row.preis.toString(),
            row.kundenRezension.toString(),
            /*                row.anwendungsbereich,        // TODO weglassen in der primären Ansicht
                            row.begrenzteAbgabe*/
        ).mapIndexed { index, value ->
            value.padEnd(columnWidths[index])
        }

        val formattedString = formattedRow.joinToString(" | ")
        println(formattedString)
    }
    println("\n\n")
}

fun login(userDB: MutableList<User>) {
    println(
        "Benutzername (eMail):"     //todo Zuerst müssen Sie sich mit Ihren Anmeldedaten einloggen.
    )
    var i = 1
    while (i <= 3) {
        var loginM = readln().toString()
        println("Passwort (nur Zahlen und Buchstaben):")
        var loginP = readln().toString()
        if (userDB.any{loginM == it.eMail && loginP == it.password}) {
            println("2FA  Geben Sie nun Ihre ID ein:")
            try {
                var loginI = readln().toInt()
                if (userDB.any { it.id == loginI })
                    manager(userDB)
            } catch (ex: Exception) {
                println("Die ID stimmt nicht")
            }
        } else if (userDB.any {
                loginM == it.eMail && it.password == loginP     // Justus
            }) {
            return
            /* myAccount()     // return: eMail des Kunden*/
        } else {
            println("Diese Kombination existiert nicht in unserer Datenbank.")
        }
        i++
        if (i > 3) {
            println("Zu viele Fehlversuche. Der Login-Vorgang wird beendet.\n")
        }
    }

}

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

fun warteschleife() {
    Thread.sleep(700)
    println("Sie werden gleich weitergeleitet zum Shop ...\n")
    Thread.sleep(300); print(".")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); print(" .")
    Thread.sleep(300); println(" .\n")
}

// TODO Fun register verlagert in Kunde.kt

fun produkt(produkteDatenbank: MutableList<Produkt>) {
    warteschleife()
    println("Hier ist shopShop. DER Online_DrugStore!")

    println(
        "Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.\n" +
                "Beachten sie auch unsere Sonderangebote!"
    )
    println(">>> ${produkteDatenbank.size}.000 Produkte im Shop!")

    tabelle(produkteDatenbank, produkteDatenbankT)
        for (produkt in produkteDatenbank){
            println("${produkt.name}, ${produkt.preis},  ${produkt.kundenRezension}")
        }
}


//TODO -----zu schreibende fun-----------------------------------------------


/*        fun logIn(){
          println("shopShop_Drugstore" +
                  "Bitte melden Sie sich mit eMail-Adresse und Passwort an." +
                  "eMail:")
            try {
            var eMailLogin = readln().toString()
            println("passwort:")
            var passwordLogin = readln().toString()

            }
            catch (e: Exception){
                println(" Ihre Anmeldedaten sind leider falsch! Bitte nochmal versuchen.")
            }
            if (eMailLogin == userKunde1.eMail){
                Kunde
            }

        }*/     // alt

/*
var listOfData = Produkt()
println("${listOfData}")
println("Unser Shop bietet das Beste aus den 2 Kategorien: Haushalt und BodyCare")
} else {
println("Sie haben Ihre eMail oder das Passwort falsch eingegeben.")
}
*/     // Einstieg in den Shop

/*fun kunde_Manager(01_Test){
    if (loginM == "cc" && loginP == "44"
    */      // Login

/*|| userDB.any { loginI == 1 && loginP == it.password
    ) {
        println("2FA  Geben Sie nun Ihre ID ein:")
        var loginI = readln().toInt()
        if (userDB.any { it.id == loginI })
            manager(userDB)
    } else (userDB.any {
        loginM == it.eMail && it.password == loginP     // Justus
    })
    register()
}*/

/*
   println(
        "${userKunde3.firstName} \n" +
                "${userKunde2.name} \n" +
                "${userKunde1.eMail} \n" +
                "${userMitarbeiter.arbeitsModell} \n" +
                "${userManager.shopID} \n" +
                "${userManager.passwordAdmin}"
    )*/     // Testausdruck userDB

