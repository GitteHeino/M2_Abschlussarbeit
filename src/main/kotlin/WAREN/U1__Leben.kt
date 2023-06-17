package WAREN

class U1__Leben(
    name: String,
    preis: Double,
    kundenRezension: Double,
    var merkmal: String = "sauber"
) : Produkt(name, preis, kundenRezension) {


    init {
/*        println("U1__Leben")*/
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
