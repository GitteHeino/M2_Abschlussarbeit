import Waren.Produkt

fun main(){

    var produktLeben1 = Produkt("Milch, haltbare Alpenmilch, 3,5% Fett, laktosefrei, 1 l", 1.65, 4.9)
    var produktLeben2 = Produkt("EXTRA Kaugummi, Blueberry, 50 St", 1.85, 4.6)
    var produktLeben3 = Produkt("Fertiggericht italienische Ravioli mit Gemüsefüllung, 270 g", 2.45, 4.3)

    var produktReini1 = Produkt("Toilettenpapier Recycling 3-lagig, 16 St", 6.15, 4.7)
    var produktReini2 = Produkt("Colorwaschmittel Power Caps, 40 Wl", 8.95,4.8)
    var produktReini3 = Produkt("Vileda Ultramax Bodenwischer Komplett Set", 41.51, 4.4)

    var produktKörper1 = Produkt("Ecodenta Zahnpasta Ohne Fluorid Sensitivity Relief 75 ml ",7.47 ,4.2)
    var produktKörper2 = Produkt("Axe 3in1 Duschgel & Shampoo 250 ml  sixPack", 14.70 ,4.6)
    var produktKörper3 = Produkt("Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75,3.5)


    println("${ produktKörper3 }")


}