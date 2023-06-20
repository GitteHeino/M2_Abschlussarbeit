package WAREN

class P12_Gesundheit(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String,
        var anwendungsBereich: String,
        var begrenzteAbgabe: Boolean
) : P1__Leben(id, name, preis, kundenRezension, merkmal) {

    init {
        /*        println("P12__Gesundheit")*/
    }


    /*    fun text() {
            println("{U1_Gesundheit.merkmal[0]}")
        }*/


    /*
        var produktGesund1 = P12_Gesundheit("Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", "", false)
        var produktGesund2 = P12_Gesundheit("Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false)
        var produktGesund3 = P12_Gesundheit("Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false)
    */


}

