package WAREN

class P22_Reinigungsmittel(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String,
        var gefährlich: String,
        var innenAußen: String
) : Produkt(id, name, preis, kundenRezension) {

    init {
        /*        println("Reinigung")*/

    }


    /*
        var produktReini1 = P22_Reinigungsmittel("Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", "ja", "Nassbereich")
        var produktReini2 = P22_Reinigungsmittel("Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
        var produktReini3 = P22_Reinigungsmittel("Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", "nicht verschlucken!", "innen")
    */


}

