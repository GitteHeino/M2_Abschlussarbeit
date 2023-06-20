import WAREN.*
import USER.*
import kotlin.system.exitProcess

// Globale Variablen

fun main() {
    var produkteDatenbank = mutableListOf<Produkt>()
    var userDatenbank = mutableListOf<User>()
    var neuKunde = User()


//TODO -----Funktionen der fun main--------------------------------------------

    /*    willkommen()*/
    /*    anmeldung()*/
    /*    warteschleife()*/

    loginUseroderManager()

    /*    auswahlStart()  */      // User(), produkteDatenbank
    produktAngebotAlleKategorien()
    /*    alleProdukte()*/


//TODO -----Ende der fun maim--------------------------------------------------
}

fun loginUseroderManager() {
    println("\n\n\t===== =  shopShop - Deine Online-Drogerie  = =====\n")

    var i = 1
    while (i <= 3) {
        println("Bitte loggen sie sich ein")
        Thread.sleep(250)
        println("eMail eingeben:  ")
        var loginM = readln()
        println("Passwort (nur Zahlen und Buchstaben):  ")
        var loginP = readln()

        if (UserList.UserExist(loginM)) {
            var user = UserList.GetUserByEmail(loginM)!!

            if (loginM == user.eMail && loginP == user.password) {
                if (loginM == "cc" && loginP == "44") {         // user is Manager
                    println("2FA  Geben Sie nun Ihre ID ein:")
                    try {
                        var loginI = readln().toInt()
                        if (loginI == 0)
                            if (user.id == loginI) {        // prüft, ob zum Manager übergeben werden kann
                                val managerAccount = Manager(0, "Unbekannt", "Kiki", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17")
                                Thread.sleep(200)
                                managerAccount.managerMenu()
                            }
                    } catch (ex: Exception) {
                        println("Die ID stimmt nicht")
                    }
                } else {
                    val userAccount = Kunde(101, "Maier", "Sepp", "h", "8", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
                    Thread.sleep(200)
                    println("${userAccount.id}")
                    userAccount.userMenu()
                    return
                }


            } else {
                println("Dieser User existiert nicht in unserer Datenbank.")
                var neuKunde = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
                Thread.sleep(200)
                return
            }
        }
        i++
        if (i > 2) {
            println("Zu viele Fehlversuche. Der Login-Vorgang wird beendet.\n")
            ">>> exitProcess(0)"
        }
        false
    }
}



fun alleProdukte() {
    val warenkorb = ProductList.productList
    println("\ninsgesamt ${warenkorb.lastIndex + 1}.000 Produkte. Noch mehr gibt's auf unserer Partnerseite ...")


}        //  Anzahl der Produkte


fun auswahlStart() {
    val auswahl = readln().capitalize()
    when (auswahl) {
        "L" -> {
            val kundenAccount = Kunde(101, "Maier", "Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14")
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
}        // todo löschen/archivieren und XXX

