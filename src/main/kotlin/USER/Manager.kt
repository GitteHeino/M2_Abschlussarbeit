package USER

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

// TODO _________________________________________________________


    // TODO _________________________________________________________
    fun passwordAdmin() {
    }

    fun warenbestandPrüfen() {
    }

    fun managerMenu() {
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
                    /*kontoStand()*/
                    println("Gestern war der Kassenbestand: ... €")
                }

                "2" -> {
                    /*warenbestellung()*/
                    println("Ihre Bestellung bitte bis 9:00 Uhr anmelden.")
                }

                "3" -> {
                    //preisÄnderung()
                    println("Die Preise für Waschmittel anpassen")
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
    }

    fun preiseÄndern() {
    }

    fun sonderAngebote() {
    }


//todo -----------------------------------------------
// Ü > mT/f(m)  40  Preise ändern


}


