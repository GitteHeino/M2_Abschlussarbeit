import WAREN.*

object ProductList {


    val productList: MutableList<Produkt> = mutableListOf(

            P11_BodyCare(1, "Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+",1, "all", "L"),
            P11_BodyCare(2, "Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", 10,"Men", "XL"),
            P11_BodyCare(3, "Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", 20,"Woman", "S"),

            P12_Gesundheit(4, "Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", 40,"", "nein"),
            P12_Gesundheit(5, "Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g",30, "innen", "nein"),
            P12_Gesundheit(6, "Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", 30,"Ohne Fluorid", "nein"),

            P21_Lebensmittel(7, "Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", 50,"ja", "H H N"),
            P21_Lebensmittel(8, "EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei",50, "nein", " H H H"),
            P21_Lebensmittel(9, "Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan",50, "nein", "H M M"),

            P22_Reinigungsmittel(10, "Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", 20,"ja", "Nassbereich"),
            P22_Reinigungsmittel(11, "Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", 50,"nein", "-"),
            P22_Reinigungsmittel(12, "Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", 20,"nicht verschlucken!", "innen")


    )

    fun getProducByNumber(id: Int): Produkt? {

        val auswählen = readln().toInt()
        for (produkt in productList){
            if(produkt.id == id){
                return produkt
            }
        }
        return null
    }



    fun userBestellung() {
        println("\u001B[34m Um einen Artikel genauer anzusehen geben Sie die dreistellige ArtikelNr. ein:  \u001B[0m")
        var auswahlArtikel = readln()?.toIntOrNull()

        if (auswahlArtikel != null) {
            val selectedItem = productList.firstOrNull { it.id == auswahlArtikel }
            if (selectedItem != null) {
                println("ArtikelNr: ${selectedItem.id} \nName: ${selectedItem.name} \nPreis: ${selectedItem.preis}\n" +
                        "Bewertung: ${selectedItem.kundenRezension}\nMerkmal: ${selectedItem.warenAngebot} ${selectedItem.merkmal}\n")
                /*                println("$selectedItem")*/


            } else {
                println("Artikel nicht gefunden")
            }
        } else {
            println("Ungültige Eingabe")
        }
        return
    }       // TODO





}