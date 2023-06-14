package Waren

class U2__Haushalt(
    name: String,
    preis: Double,
    kundenRezension: Double,
    var merkmal: String,
    var gefährlich: String,
    var innenAußen: String
) : Produkt(name, preis, kundenRezension) {

    init {
        println("underCat2")
    }
}

