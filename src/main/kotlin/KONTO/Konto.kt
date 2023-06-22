package KONTO
import date


open class Konto(
    var datum: String = "2023-06-23",
    var kontostand: Double = 16345.92
) {


    fun einzahlen(einzahlung: Double) {
        date()
        readln()
        kontostand = kontostand + einzahlung
    }
}

