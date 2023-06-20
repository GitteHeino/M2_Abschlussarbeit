package WAREN

class P11_BodyCare(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String,
        var who: String,
        var size: String
) : P1__Leben(id, name, preis, kundenRezension, merkmal) {

    init {
        /*        println("P11__bodyCare")*/
    }


    /*
        var produktKörper1 = P11_BodyCare("Sonnenfluid Gesicht, 50ml", 4.75, 3.8, "sensitiv LSF 50+", "all", "L")
        var produktKörper2 = P11_BodyCare("Axe 3in1 Duschgel & Shampoo 250 ml", 26.99, 4.5, "Face Body Hair, 6x 250ml, dermatologisch getestet", "Men", "XL")
        var produktKörper3 = P11_BodyCare("Lippenstift Velvet Matt Berry Nude, 4,5 g", 8.75, 3.5, "Naturkosmetik, matt, alle Hauttypen", "Woman", "S")
    */


}