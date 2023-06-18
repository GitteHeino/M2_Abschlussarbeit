package WAREN

open class Produkt(
        var nr: Int,
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
    }       // macht den eigentlichen Inhalt (des Speicherplatzes) sichtbar



val warenAngebot = mutableListOf<Produkt>()

val produkteBodyCare = mutableListOf<P11_BodyCare>()
val produkteGesundheit = mutableListOf<P12_Gesundheit>()
val produkteLebensmittel = mutableListOf<P21_Lebensmittel>()
val produkteReinigungsmittel = mutableListOf<P22_Reinigungsmittel>()


fun auswahlProdukt() {
    println("Wählen Sie einen Artikel aus der Tabelle und geben Sie die ersten Buchstaben ein:")
    var dmArtikel = readln().capitalize().toString()
    val i = 1
   for (i in warenAngebot)
        println(i)





    }
}
