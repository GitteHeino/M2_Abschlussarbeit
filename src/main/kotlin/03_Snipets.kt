import USER.*
import java.lang.Exception

/*
fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}*/

/*
fun wordsInText(){
    val suchWort = "Und"
    val text = "Manchmal geschieht es in tiefer Nacht, " +
            "Daß der Wind wie ein Kind erwacht, " +
            "Und er kommt die Allee allein " +
            "Leise, leise ins Dorf herein. " +
            "Und er tastet bis an den Teich, " +
            "Und dann horcht er herum: " +
            "Und die Häuser sind alle bleich, " +
            "Und die Eichen sind stumm … " +
            "\n"
    val wortListe = text.split(' ').toMutableList()
    if (suchWort in wortListe) {
        wortListe.retainAll(listOf(suchWort))
        println("Das Wort ist ${wortListe.size} mal im text")
    }*/   // Beispiel Wörter im Text: Zählen wie oft ein Wort im Text vorkommt

/*fun warenAngebot() {

    var movies: MutableList<String> = mutableListOf("Midsommar", "Dune", "Mulholland Drive", "Interstellar")
    var prices: MutableList<Double> = mutableListOf(4.99, 5.99, 2.99, 7.99)

    verkaufen(1, movies, prices, 50.0)
    verkaufen(2, movies, prices, 60.0)
    addMovie(movies, prices, "The Batman", 19.99)
    verkaufen(3, movies, prices, 60.0)

}*/   // Warenangebot (T13)

/*  fun printRandomZahl(){
    println(randomZahlInt())

    fun randomZahlInt(): Int{
    var zahlenListe: IntRange = (1..10)
    var zahl = zahlenListe.random()
    return zahl
}
}*/   // Random Zahl (Int / Double)

/*fun rundung(zahl: Double, nachkommastellen: Int = 2): Double {

        Hiermit implementieren wir endlich unsere Rundungsfunktion!
        Diese Rundungsfunktion basiert auf folgende Funktionsweise:
            1 Nachkommastelle: mal 10 rechnen, runden, geteilt durch 10     (faktor: 10)
            2 Nachkommastellen: mal 100 rechnen, runden, geteilt durch 100  (faktor: 10 * 10 = 100)
            3 Nachkommastellen: mal 1000, usw..                             (faktor: 10 * 10 * 10 = 1000)
        D.h die Anzahl der Nachkommastellen ist verbunden mit dem Faktor den wir benötigen.
        Der Faktor errechnet sich mit einer Potenz von 10 hoch der Anzahl der Nachkommastellen.

        Die Funktion benutzt 2 Parameter:
            - zahl: das ist die Zahl die wir runden möchten
            - nachkommastellen: das gibt an, auf wieviele Nachkommastellen möchten wir runden

        Als Rückgabewert gibt die Funktion die gerundete Zahl zurück.
    val faktor = 10.0.pow(nachkommastellen)

    var gerundeteZahl = zahl * faktor
    gerundeteZahl = round(gerundeteZahl)
    gerundeteZahl /= faktor         // gerundeteZahl = gerundeteZahl / faktor

    return gerundeteZahl
}*/   // implementieren der Rundungsfunktion!

/*fun changePreis(neuerPreis: Double){
    println("Geben sie master-Passwort ein")
    var input = readln()

    if (input == "master123"){
        this.preis = neuerPreis
    }
    else {
        println("Authorisierung fehlgeschlagen.")
    }
}*/     // ändern Preis mit PW


/*private val s = "Loggen Sie sich mit Ihren Anmeldedaten ein"*/

/*    println("Geben sie ihren Username ein:")
    val user = readln()

    var isUserLoggedIn: Boolean = passwortAbfrage(user)

    if (isUserLoggedIn) {
        println("Hallo, $user")
    }
}

    fun passwortAbfrage(userName: String,anzahlVersuche: Int){



*//*    fun passwortAbfrage(userName: String, anzahlVersuche: Int = 1): Boolean{*//*

        if (userName in userAccounts.keys){ // in == userAccounts.contains(userName)  && anzahlVersuche <= 3
            val userPW: String = userAccounts[userName]!!

            println("Geben sie ihr Passwort ein: ")
            val pw = readln()

            if (pw == userPW){
                return //true
            } else {
                return passwortAbfrage(userName, anzahlVersuche + 1)
            }
        }
        else {
            return //false
        }
    }*/

/*if (userDB.any {
    loginM == it.eMail && it.password == loginP}
            || userDB.any { loginI == it.id && loginP == it.password
}) */      // User mit eMail raussuchen und mit PW abgleichen


/*fun main() {
    login()
}
        fun login() {
    var i = 1
    while (i < 4) {
            println("Loggen Sie sich mit Ihren Anmeldedaten ein.\nBenutzername (eMail):"
            )
            *//*repeat(3) {*//*
            var loginM = readln().toString()
            println("Passwort (nur Zahlen und Buchstaben):")
            var loginP = readln().toString()
            if (loginM == "cc" && loginP == "44"
            ) {
                println("2FA  Geben Sie nun Ihre ID ein:")
                try {
                    var loginI = readln().toInt()
                    if (userDB.any { it.id == loginI })
                        *//*manager(userDB)*//*
                } catch (ex: Exception) {
                    println("Die ID stimmt nicht")
                }
            } else if (userDB.any {
                        loginM == it.eMail && it.password == loginP     // Justus
                    }) {
                *//*myAccount() *//*    // return: eMail des Kunden
            } else {
                println("Diese Kombination existiert nicht in unserer Datenbank.")
            }
            return

    }

}*/




/*fun myAccount() {
    *//*TODO("hier beginnt der Account des Kunden")*//*
    println("hier beginnt der Account des Kunden")
    *//*    warenkorb()*//*
}

fun manager(userDB: MutableList<User>) {
    println(" Guten Morgen Manager\n")
    repeat(10) {
        println(
                "1 Kontostand einsehen\n" +
                        "2 Waren bestellen\n" +
                        "3 Preise ändern\n" +
                        "4 Mitarbeiter loben\n"
        )

        var job = readln()
        when (job) {
            "1", "Jan", "Januar" -> {
                *//* kontoStand()*//*
                println("Gestern war der Kassenbestand: ... €")
            }

            "2" -> {
                *//*warenbestellung()*//*
                println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")
            }

            "3" -> {
                *//*preisÄnderung()*//*
                println("Die Preise für Waschmittel anpassen")
            }

            else -> {
                println("falsche Eingabe! 😢")
                return

            }
        }
    }
}

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

fun register() {
    println("Möchten Sie einen neuen Account anlegen? j/n:")
    var neuerAccount = readln().toString()
    while (neuerAccount == "j") {
        println("Sie werden nun zum shop weitergeleitet. Einen Moment")
        warteschleife()
        while (neuerAccount == "n")
            println("Good bye!")
        break
        break
    }
}*/



/*
fun normalizeStringLength(str: String, nc-chars: Int = 20) : String {
    return if (str. length < nr_chars) str.padEnd (nr_chars, padChar:
    else if (str.length > nr_chars)
        str.substring(0, nr_chars) else str

}*/     // Text in tabellarischer Form
