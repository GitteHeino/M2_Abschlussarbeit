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
    }*/


/*fun changePreis(neuerPreis: Double){
    println("Geben sie master-Passwort ein")
    var input = readln()

    if (input == "master123"){
        this.preis = neuerPreis
    }
    else {
        println("Authorisierung fehlgeschlagen.")
    }
}*/       // Preis ändern

fun warteschleife() {
    Thread.sleep(700)
    print("Sie werden gleich weitergeleitet zum Shop  . ")
    Thread.sleep(300); print(".")
    Thread.sleep(300); print(" .")
    /*    Thread.sleep(300); print(" .")
        Thread.sleep(300); print(" .")*/
    Thread.sleep(300); print(" .")
    Thread.sleep(800); println("\n")
}       //  für überall

