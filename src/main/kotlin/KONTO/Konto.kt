package KONTO

import KONTO.kundenKonto.datum
import KONTO.kundenKonto.kontostand

open class Konto(
    var datum: String = "2023-06-23",
    val kontostand: Double = 16345.92
) {
    fun einzahlen(kundenKontoEinzahlung: Double) {
        print("wie viel möchten Sie einzahlen? (Betrag in € z.B. 100.0):  ")
        var einzahlung = readln()
        kundenKonto
        TODO("Not yet implemented")
    }
}

fun shopkonto() {
    println("am $datum beträgt Ihr Guthaben: $kontostand")
}