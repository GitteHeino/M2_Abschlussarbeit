package WAREN

open class P1__Leben(
        id: Int,
        name: String,
        preis: Double,
        kundenRezension: Double,
        merkmal: String = "",
        menge: Int
) : Produkt(id, name, preis, kundenRezension, merkmal,menge) {



    init {

    }

/*    override fun toString(): String {
        return "$merkmal"
    }*/


}


/*
var merkmal: String =""
constructor(me: String, preis: Double,merkmal: String):this(name, preis, kundenRezension,)
this.merkmal.addall(merkmal)

init {
    println("underCat2")
}*/
