package WAREN

class P2__Haushalt(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String = "",
        var gefährlich: String,
        var innenAußen: String
) : Produkt(id, name, preis, kundenRezension, merkmal) {

    init {
/*        println("P2__Haushalt")*/
    }

    /*
        override fun toString(): String {
            return "$anwendungsBereich" + "$begrenzteAbgabe"
        }       // TODO  hier werden die @speicherAdressen gegen den wahren Inhalt getauscht
    */


}


