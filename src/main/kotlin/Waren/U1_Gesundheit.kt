package Waren

class U1_Gesundheit(
    name: String,
    preis: Double,
    kundenRezension: Double,
    merkmal: String,
    var anwendungsBereich: String,
    var begrenzteAbgabe: Boolean
) : Produkt(name, preis, kundenRezension) {


    init {
/*        println("Gesundheit")*/
    }
    override fun toString(): String {
        return "$anwendungsBereich" + "$begrenzteAbgabe"
    }
}
