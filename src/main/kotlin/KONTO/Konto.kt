package KONTO
import date
import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Konto(
    var datum: String = "2023-06-23",
    var kontostand: Double = 16345.92
) {
    /*    fun einzahlen(kundenKontoEinzahlung: Double) {
        date()
        print("wie viel möchten Sie einzahlen? (Betrag in € z.B. 100.0):  ")
        var einzahlung = readln()
        kontostand = kontostand + einzahlung

    }
}*/


    fun einzahlen(einzahlung: Double) {
        date()
        readln()
        kontostand = kontostand + einzahlung
    }

    fun shopkonto() {
        println("am $datum beträgt Ihr Guthaben: $kontostand")
    }
}


/*fun date() {
    val now = LocalDate.now()
//    val nowWithTime = LocalDateTime.now()
//    println(nowWithTime)
    println(now)
}*/

/*
    val birthday = LocalDate.of(2000,1,1)
    println(birthday)
    val format = DateTimeFormatter.ofPattern("dd.MM.yyyy")*/
