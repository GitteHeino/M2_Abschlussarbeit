package WAREN

class U1_Gesundheit(
    name: String,
    preis: Double,
    kundenRezension: Double,
    merkmal: String,
    var anwendungsBereich: String,
    var begrenzteAbgabe: Boolean
) : Produkt(name, preis, kundenRezension) {

    init {      //todo  println("Gesundheit")

    }

    override fun toString(): String {
        return "$anwendungsBereich" + "$begrenzteAbgabe"
    }       // TODO  hier werden die @speicherAdressen gegen den wahren Inhalt getauscht

/*    fun text() {
        println("{U1_Gesundheit.merkmal[0]}")
    }*/
}

