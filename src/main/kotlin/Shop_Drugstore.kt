import WAREN.U1_Gesundheit
import WAREN.U1_bodyCare
import WAREN.U2_Lebensmittel
import WAREN.U2_Reinigungsmittel

class Shop_Drugstore() {

    /*    init {
    * }*/

    fun willkommen(){
        println("shopShop - Ihr Drugstore digital um die Ecke!")
        Thread.sleep(1000)

    }

    fun Produkt() {
        var produktDB = mutableListOf<String>()
        var produktKörper1 = U1_bodyCare(
                "Sonnenfluid Gesicht, 50ml",
                4.75,
                3.8,
                "sensitiv LSF 50+",
                "all",
                "L"
        )
        var produktKörper2 = U1_bodyCare(
                "Axe 3in1 Duschgel & Shampoo 250 ml",
                26.99,
                4.5,
                "Face Body Hair, 6x 250ml, dermatologisch getestet",
                "Men",
                "XL"
        )
        var produktKörper3 = U1_bodyCare(
                "Lippenstift Velvet Matt Berry Nude, 4,5 g",
                8.75,
                3.5,
                "Naturkosmetik, matt, alle Hauttypen",
                "Woman",
                "S"
        )

        var produktGesund = U1_Gesundheit(
                "Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml",
                7.95,
                4.5,
                "Hals gurgeln",
                "",
                false
        )
        var produktGesund2 = U1_Gesundheit(
                "Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false
        )
        var produktGesund3 =
                U1_Gesundheit(
                        "Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false
                )
        var produktGesund4 = U1_Gesundheit(
                "Mund ", 7.95, 4.9, "Hals gurgeln", "", true
        )

        var produktLeben1 = U2_Lebensmittel(
                "Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N"
        )
        var produktLeben2 = U2_Lebensmittel(
                "EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H"
        )
        var produktLeben3 = U2_Lebensmittel(
                "Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g",
                2.45,
                4.3,
                "Laktosefrei, Vegan",
                true,
                "H M M"
        )

        var produktReini1 = U2_Reinigungsmittel(
                "Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l",
                1.45,
                4.9,
                "Vorsicht! Nicht unverdünnt genießen!",
                "ja",
                "Nassbereich"
        )
        var produktReini2 =
                U2_Reinigungsmittel("Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
        var produktReini3 = U2_Reinigungsmittel(
                "Vileda Ultramax Bodenwischer",
                41.51,
                4.4,
                "Komplett Ultramax Set + 2 extra Bezüge",
                "nicht verschlucken!",
                "innen"
        )
        println(produktDB.addAll(mutableListOf()))
    }


    /*    fun login()

        fun register()*/

}

