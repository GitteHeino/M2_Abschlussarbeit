package USER

class Manager(
        id: Int,
        name: String,
        firstName: String,
        eMail: String,
        password: String,
        var shopID: Int = 1,
        var shopCity: String = "",
        var shopStreet: String,
        var shopHausNr: Int,
        val shopZIP: String = "",
        var passwordAdmin: String = ""
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



//todo -----------------------------------------------
// Ü > mT/f(m)  40  Preise ändern










}