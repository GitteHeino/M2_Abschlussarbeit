package WAREN

class P1__Leben(
        nr: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        var merkmal: String = "sauber"
) : Produkt(nr, name, preis, kundenRezension) {



    init {
        println("P2__Haushalt")
    }

    override fun toString(): String {
        return "$merkmal"
    }


}


/*
var merkmal: String =""
constructor(me: String, preis: Double,merkmal: String):this(name, preis, kundenRezension,)
this.merkmal.addall(merkmal)

init {
    println("underCat2")
}*/
