import USER.*

object UserList {

    val userList: List<User> = listOf(
            Kunde(101, "Maier", "Sepp", "h", "8", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14"),
            Kunde(102, "Niblock", "Phil", "a", "1", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07"),
            Kunde(103, "Nagel", "Jenny", "f", "6", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23"),

            Manager(0, "Admin", "Sandra", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17"),

            Mitarbeiter(11, "Bogenmacher", "Paul", "bmp", "000", "Honk"),
            Mitarbeiter(12, "b", "Bert", "b", "0", "Honk")
    )

    fun UserExist(eMail: String): Boolean {
        for (kunde in userList) {
            if (kunde.eMail == eMail) {
                return true
            }
        }
        return false
    }

    fun GetUserByEmail(eMail: String): User? {
        for (kunde in userList) {
            if (kunde.eMail == eMail) {
                return kunde
            }
        }
        return null
    }
}