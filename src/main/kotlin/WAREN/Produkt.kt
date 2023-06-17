package WAREN


open class Produkt(
        var name: String = "produkt",
        var preis: Double = 1.0,
        var kundenRezension: Double = 5.0
) {
    init {
        /*    Code kann nicht lose in Klasse stehen, nur:
              - Eigenschaften
              - Konstruktoren
              - Methoden*/
        /*  println("das ist die Klasse aller Produkte.")*/
    }

    override fun toString(): String {
        return "$name"
    }



}