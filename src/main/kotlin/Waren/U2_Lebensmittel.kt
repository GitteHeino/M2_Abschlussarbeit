package Waren

class U2_Lebensmittel(
    name: String,
    preis: Double,
    kundenRezension: Double,
    merkmal: String,
    var bio: Boolean,
    var feSaZu: String = "N M H"
) : Produkt(name, preis, kundenRezension) {

    init {
/*        println("Lebensmittel")*/
    }
}
