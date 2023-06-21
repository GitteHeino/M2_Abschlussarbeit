package WAREN


class P21_Lebensmittel(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String = "",
        menge: Int,
        var bio: String = "",
        var feSaZu: String = ""
) : Produkt(id, name, preis, kundenRezension, merkmal, menge) {

    init {
        /*        println("Lebensmittel")*/
    }

    /*
        var produktLeben1 = P21_Lebensmittel("Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N")
        var produktLeben2 = P21_Lebensmittel("EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H")
        var produktLeben3 = P21_Lebensmittel("Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan", true, "H M M")
    */

}
