package USER

class Mitarbeiter(
        id: Int,
        name: String,
        firstName: String,
        eMail: String,
        password: String,
        /*        city: String = "",
                street_Nr: String = "",
                zipCode: String = "",*/
        var arbeitsModell: String = "Vollzeit"      // "Teilzeit", "Honk"

) : User(id, name, firstName, eMail, password) {

    init {
    }

    // TODO _________________________________________________________


    // TODO _________________________________________________________


    fun passwordAdmin() {
    }

    fun warenbestandPrüfen() {
    }

    fun kontostandstandPrüfen() {
    }

    fun warenBestellen() {
    }

    fun preiseÄndern() {
    }

    fun sonderAngebote() {
    }

}
