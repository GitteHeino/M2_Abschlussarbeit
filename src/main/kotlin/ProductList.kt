import USER.User
import WAREN.*

object ProductList {


    val productList: List<Produkt> = listOf(

            P11_BodyCare(111, "Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L"),
            P11_BodyCare(112, "Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", "Men", "XL"),
            P11_BodyCare(113, "Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", "Woman", "S"),

            P12_Gesundheit(121, "Mund- und Rachenspülung antiviral, fluoridfrei ab 6 Jahren, 300 ml", 7.95, 4.5, "Hals gurgeln", "", false),
            P12_Gesundheit(122, "Doppelherz Omega-3 1400 Kapseln", 12.95, 4.7, " 90 St, 171,3 g", "innen", false),
            P12_Gesundheit(123, "Ecodenta Zahnpasta, Sensitivity, 75 ml", 7.47, 4.2, "Ohne Fluorid", "Ohne Fluorid", false),

            P21_Lebensmittel(211, "Milch, haltbare Alpenmilch, 1 l", 1.65, 4.9, "3,5% Fett", true, "H H N"),
            P21_Lebensmittel(212, "EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6, "Laktosefrei", false, " H H H"),
            P21_Lebensmittel(213, "Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3, "Laktosefrei, Vegan", true, "H M M"),

            P22_Reinigungsmittel(221, "Essigreiniger Essenz zum Reinigen & Kochen, 0,4 l", 1.45, 4.9, "Vorsicht! Nicht unverdünnt genießen!", "ja", "Nassbereich"),
            P22_Reinigungsmittel(222, "Colorwaschmittel Power Caps, 40 Wl", 8.95, 4.8, "Mit Duft", "nein", "-"),
            P22_Reinigungsmittel(223, "Vileda Ultramax Bodenwischer", 41.51, 4.4, "Komplett Ultramax Set + 2 extra Bezüge", "nicht verschlucken!", "innen")


    )

    fun getProducByNumber(nr: Int): Produkt? {

        val auswählen = readln().toInt()
        for (produkt in productList){
            if(produkt.nr == nr){
                return produkt
            }
        }
        return null
    }



    fun userBestellung() {
        println("\u001B[34m Um einen Artikel genauer anzusehen geben Sie die dreistellige ArtikelNr. ein:  \u001B[0m")
        var auswahlArtikel = readln()?.toIntOrNull()

        if (auswahlArtikel != null) {
            val selectedItem = productList.firstOrNull { it.nr == auswahlArtikel }
            if (selectedItem != null) {
                println("ArtikelNr: ${selectedItem.nr} \nName: ${selectedItem.name} \nPreis: ${selectedItem.preis}\n" +
                        "Bewertung: ${selectedItem.kundenRezension}\nMerkmal: ${selectedItem.warenAngebot} ${selectedItem}\n")
                /*                println("$selectedItem")*/


            } else {
                println("Artikel nicht gefunden")
            }
        } else {
            println("Ungültige Eingabe")
        }
        return
    }       // TODO löschen



/*    fun produktAngebotAlleKategorien() {
        val warenAngebot = ProductList.productList
        val leer = " "
        println("\n\t\t = = = shopShop. DER Online_DrugStore! = = =\n")
        println("Sie sehen die Kategorien, in denen Sie eine gute Auswahl haben.\n")      // "Beachten sie auch unsere Sonderangebote!"
        *//*println(">>> ${warenAngebot.size}.000 Produkte im Shop!\n\n")*//*
        println("\u001b[34mNr.\u001b[0m\t \u001B[34mArtikel ${leer.padEnd(64, ' ')}\u001B[34mPreis\u001B[0m\t\t \u001B[34mBewertung\u001B[0m\t")


        for (produkt in warenAngebot) {
            println("${produkt.nr}\t ${produkt.name.padEnd(70, ' ')}\t ${produkt.preis}€\t\t ${produkt.kundenRezension}")
            Thread.sleep(200)
        }
    }*/

    /*println("Was möchten Sie sich näher ansehen? Geben Sie hierzu die angezeigte Nr. ein:  ")
    val auswählen = readln().toInt()
    if(auswählen == produkt.nr)*/


}