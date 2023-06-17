package WAREN

class U2_Reinigungsmittel(
    name: String,
    preis: Double,
    kundenRezension: Double,
    merkmal: String,
    var gefährlich: String,
    var innenAußen: String
) : Produkt(name, preis, kundenRezension) {

    init {
/*        println("Reinigung")*/
    }
}

