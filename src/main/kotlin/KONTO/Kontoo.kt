
package KONTO


class Kontoo(val inhaber: String) {
    var kontostand: Double = 0.0
    val zahlungseingaenge: MutableList<Double> = mutableListOf()

    fun einzahlen(betrag: Double) {
        kontostand += betrag
        zahlungseingaenge.add(betrag)
    }

    fun auszahlen(betrag: Double) {
        kontostand -= betrag
    }
}

object KundenKonto {
    private val konten: MutableMap<String, Konto> = mutableMapOf()

    fun kontoErstellen(kundenname: String) {
        konten[kundenname] = Konto(kundenname)
    }

    fun kontoLoeschen(kundenname: String) {
        konten.remove(kundenname)
    }

    fun kontoVorhanden(kundenname: String): Boolean {
        return konten.containsKey(kundenname)
    }

    fun konto(kundenname: String): Konto? {
        return konten[kundenname]
    }
}

object ShopKonto {
    private val konto: Konto = Konto("Shop-Inhaber")

    fun konto(): Konto {
        return konto
    }
}


fun main(){

// Kundenkonto erstellen
KundenKonto.kontoErstellen("Max Mustermann")

// Einzahlung auf Kundenkonto
val konto = KundenKonto.konto("Max Mustermann")
konto?.einzahlen(100.0)


// Überprüfen des Kontostands des Shop-Inhabers
val shopInhaberKonto = ShopKonto.konto()
println("Kontostand des Shop-Inhabers: ${shopInhaberKonto.kontostand}")

// Löschen des Kundenkontos
KundenKonto.kontoLoeschen("Max Mustermann")

}
