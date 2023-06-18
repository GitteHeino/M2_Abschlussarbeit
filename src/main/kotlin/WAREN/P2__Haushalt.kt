package WAREN

class P2__Haushalt(
        nr: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        var merkmal: String,
        var gefährlich: String,
        var innenAußen: String
) : Produkt(nr, name, preis, kundenRezension) {

    init {
        println("P2__Haushalt")
    }

    /*
        override fun toString(): String {
            return "$anwendungsBereich" + "$begrenzteAbgabe"
        }       // TODO  hier werden die @speicherAdressen gegen den wahren Inhalt getauscht
    */


}


