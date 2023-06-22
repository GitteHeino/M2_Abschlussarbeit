import WAREN.*
import USER.*
import kotlin.system.exitProcess

// Globale Variablen

fun main() {
    var produkteDatenbank = mutableListOf<Produkt>()
    var userDatenbank = mutableListOf<User>()
    var neuKunde = User()


//TODO -----Funktionen der fun main--------------------------------------------

    willkommen()        // StartScreen mit preselection NeukundenRegistrierung
    produktAngebotAlleKategorien()      // das Warenangebot
    loginUseroderManager()      // Auswahl, ob Zugang für Kunde oder ShopManager


//TODO -----Ende der fun maim--------------------------------------------------
}


fun willkommen(){
    println("\t\t\tWillkommen im shopShop!\n\n")
    println("Neu hier?  \u001B[36mj\u001B[0ma  \u001B[36mn\u001B[0mein:  ")
    var neuerKunde = readln()
    if (neuerKunde == "j") {
        datenEingabe()
    }else
        return
}        // StartScreen mit preselection NeukundenRegistrierung

fun loginUseroderManager() {
    println("\n\n\t===== =  shopShop - Deine Online-Drogerie  = =====\n")

    var i = 1
    while (i <= 3) {
        println("Bitte loggen sie sich ein")
        Thread.sleep(250)
        print("eMail eingeben:  ")
        var loginM = readln()
        print("Passwort (nur Zahlen und Buchstaben):  ")
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
                                val managerAccount = user
                                Thread.sleep(200)
                                managerAccount.managerMenu()
                            }
                    } catch (ex: Exception) {
                        println("Die ID stimmt nicht")
                    }
                } else {
                    val userAccount = user
                    Thread.sleep(200)
                    println("${userAccount.id}")
                    warteschleife()
                    userAccount.userMenu()
                    return
                }


            } else {
                println("Dieser User existiert nicht in unserer Datenbank.")
                var neuKunde = user
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
}      // Auswahl, ob Zugang für Kunde oder ShopManager
