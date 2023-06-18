import WAREN.P12_Gesundheit
import WAREN.P11_BodyCare
import WAREN.P21_Lebensmittel
import WAREN.P22_Reinigungsmittel

class Shop_Drugstore() {

    /*    init {
    * }*/

    fun willkommen(){
        println("shopShop - Ihr Drugstore digital um die Ecke!")
        Thread.sleep(1000)

    }

    fun Produkt() {
        var produktDB = mutableListOf<String>()
        var produktKörper1 = P11_BodyCare(111, "Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L")
        var produktKörper2 = P11_BodyCare(112,"Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", "Men", "XL")
        var produktKörper3 = P11_BodyCare(113,"Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", "Woman", "S")

        var produktGesund = P12_Gesundheit(121,"Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", "", false)
        var produktGesund2 = P12_Gesundheit(122,"Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false)
        var produktGesund3 = P12_Gesundheit(123,"Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false)
        var produktGesund4 = P12_Gesundheit(124,"Test ", 7.95, 4.9, "Hals gurgeln", "", true)

        var produktLeben1 = P21_Lebensmittel(211,"Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N")
        var produktLeben2 = P21_Lebensmittel(212,"EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H")
        var produktLeben3 = P21_Lebensmittel(213,"Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan", true, "H M M")

        var produktReini1 = P22_Reinigungsmittel(221,"Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", "ja", "Nassbereich")
        var produktReini2 = P22_Reinigungsmittel(222,"Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-")
        var produktReini3 = P22_Reinigungsmittel(223,"Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", "nicht verschlucken!", "innen")
        println(produktDB.addAll(mutableListOf()))
    }


    /*    fun login()

        fun register()*/

}

