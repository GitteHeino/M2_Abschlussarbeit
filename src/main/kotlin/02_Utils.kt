import java.lang.Exception

fun login(){
    println("shopShop - Deine Online-Drogerie")
    println("Loggen Sie sich mit Ihren Anmeldedaten ein." +
            "eMail oder Benutzername:")

    try {
        var loginM = readln().toString()
        println("Passwort (nur Zahlen und Buchstaben):")
        var loginP = readln().toString()
        if(loginP == "1234acab"){
            println("Hallo!")
        }
    }
    catch (e: Exception){
        println("Sie haben eMail/Benutzername oder das Passwort falsch eingegeben.")
    }



}