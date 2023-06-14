package USER

class Manager(
    id: Int,
    name: String,
    firstName: String,
    eMail: String,
    password: String,
    var shopID: Int = 1,
    var shopCity: String = "",
    var shopStreet_Nr: String = "",
    val shopPLZ: String = "",
    var passwordAdmin: String = ""
) : User(id, name, firstName, eMail, password) {

    init {
    }
}


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


