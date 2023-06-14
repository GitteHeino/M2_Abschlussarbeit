import Waren.*
import USER.*
import java.lang.Exception
import kotlin.concurrent.thread

fun main() {

    Shop_Drugstore()
    var produktDB = mutableListOf<String>()
    var produktKörper1 = U1_bodyCare("Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L")
    var produktKörper2 = U1_bodyCare(
        "Axe 3in1 Duschgel & Shampoo 250 ml",
        26.99,
        4.5,
        "Face Body Hair, 6x 250ml, dermatologisch getestet",
        "Men",
        "XL"
    )
    var produktKörper3 = U1_bodyCare(
        "Lippenstift Velvet Matt Berry Nude, 4,5 g",
        8.75,
        3.5,
        "Naturkosmetik, matt, alle Hauttypen",
        "Woman",
        "S"
    )

    var produktGesund = U1_Gesundheit(
        "Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml",
        7.95,
        4.5,
        "Hals gurgeln",
        "",
        false
    )
    var produktGesund2 = U1_Gesundheit("Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false)
    var produktGesund3 =
        U1_Gesundheit("Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false)

    var produktLeben1 = U2_Lebensmittel("Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N")
    var produktLeben2 = U2_Lebensmittel("EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H")
    var produktLeben3 = U2_Lebensmittel(
        "Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g",
        2.45,
        4.3,
        "Laktosefrei, Vegan",
        true,
        "H M M"
    )

    var produktReini1 = U2_Reinigungsmittel(
        "Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l",
        1.45,
        4.9,
        "Vorsicht! Nicht unverdünnt genießen!",
        "ja",
        "Nassbereich"
    )
    var produktReini2 = U2_Reinigungsmittel("Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
    var produktReini3 = U2_Reinigungsmittel(
        "Vileda Ultramax Bodenwischer",
        41.51,
        4.4,
        "Komplett Ultramax Set + 2 extra Bezüge",
        "nicht verschlucken!",
        "innen"
    )


    val userKunde1 = Kunde(
        101,
        "Maier",
        "Sepp",
        "maiers@gmail.com",
        "ms41",
        "Berg",
        "Zur Schmiede 11",
        "82335",
        "Sehr geehrter Herr ",
        "1951-06-14"
    )
    val userKunde2 = Kunde(
        102,
        "Niblock",
        "Phil",
        "ayulive@dot.com",
        "ayufirst",
        "Hannover",
        "Berliner Straße 211",
        "30457",
        "Guten Tag ",
        "1987-02-07"
    )
    val userKunde3 = Kunde(
        103,
        "Nagel",
        "Jenny",
        "nagel.je@web.de",
        "1234",
        "Rochlitz",
        "Kunigundentraße 54",
        "09306",
        "Sehr geehrte Frau ",
        "1967-06-23"
    )

    val userManager = Manager(
        0,
        "Unbekannt",
        "Kiki",
        "cc",    //"incognito@me.com",
        "44",   //"xsw2cde3",
        3698,
        "Leipzig",
        "Elsterstraße 75",
        "04109",
        "s8o17"
    )

    val userMitarbeiter = Mitarbeiter(11, "Bogenmacher", "Paul", "bmp", "000", "Honk")

    var userDB = mutableListOf<User>(userKunde1, userKunde2, userKunde3, userMitarbeiter, userManager)
//TODO ----------------------------------------------------
    /*    println(
            "${userKunde3.firstName} \n" +
                    "${userKunde2.name} \n" +
                    "${userKunde1.eMail} \n" +
                    "${userMitarbeiter.arbeitsModell} \n" +
                    "${userManager.shopID} \n" +
                    "${userManager.passwordAdmin}"
        )*/
//TODO ----------------------------------------------------

    login(userDB)


}


fun login(userDB: MutableList<User>) {
    println("shopShop - Deine Online-Drogerie")
    println(
        "Loggen Sie sich mit Ihren Anmeldedaten ein. ❖ KundenNummer oder Benutzername:"
    )
    try {
        var loginM = readln().toString()
        /*        println(" oder KundenNummer:")
                var loginI = readln().toInt()*/
        println("Passwort (nur Zahlen und Buchstaben):")
        var loginP = readln().toString()
        println(loginM)
        println(loginP)

        if (loginM == "cc" && loginP == "44"
        /*|| userDB.any { loginI == 1 && loginP == it.password */
        ) {
            manager(userDB)

        } else if (userDB.any {
                loginM == it.eMail && it.password == loginP /*}
            || userDB.any { loginI == it.id && loginP == it.password */
            }) {       // User mit eMail raussuchen und mit PW abgleichen

            Thread.sleep(1200)
            println("Sie werden gleich weitergeleitet zum Shop ...\n")
            Thread.sleep(300); println(".")
            Thread.sleep(300); println(". .")
            Thread.sleep(300); println(". . .")

            var listOfData = Produkt()
            println("${listOfData}")

            println(
                "Unser Shop bietet das Beste aus den 2 Kategorien: " +
                        "Haushalt und BodyCare"
            )

        }


    } catch (ex: Exception) {
        println("Die Eingabe ergab keinen Treffer in unserer KundenDatenbank")
        println("Sie haben eMail/Benutzername oder das Passwort falsch eingegeben.")
    }
}

fun manager(userDB: MutableList<User>) {
    println(
        "Guten Morgen Manager\n\n" +
                "1 Kontostand einsehen\n" +
                "2 Waren bestellen\n" +
                "3 Preise ändern\n" +
                "4 Mitarbeiter loben\n"
    )

    var job = readln()
    when (job) {
        "1", "Jan", "Januar" -> {
            /* kontoStand()*/
            println("Gestern war der Kassenbestand: ... €")
        }

        "2" -> {
            /*warenbestellung()*/
            println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")
        }

        "3" -> {
            /*warenbestellung()*/
            println("Die Preise für Waschmittel anpassen")
        }

        else -> {
            println("falsche Eingabe! 😢")
            manager(userDB)

        }
    }
}


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

        }*/

/*    fun logOut()*/

/*  fun register()*/






