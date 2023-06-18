import USER.*
/*import USER.Manager
import USER.Mitarbeiter
import USER.User*/

object UserList {

    val userList: List<User> = listOf(
            Kunde(101, "Maier","Sepp", "maiers@gmail.com", "ms41", "Berg", "Zur Schmiede", 11, "82335", "Sehr geehrter Herr ", "1951-06-14"),
            Kunde(102, "Niblock", "Phil", "ayulive@dot.com", "ayufirst", "Hannover", "Berliner Straße", 211, "30457", "Guten Tag ", "1987-02-07"),
            Kunde(103, "Nagel", "Jenny", "nagel.je@web.de", "1234", "Rochlitz", "Kunigundentraße", 54, "09306", "Sehr geehrte Frau ", "1967-06-23"),
            Manager(0, "Unbekannt", "Kiki", "cc", "44", 3698, "Leipzig", "Elsterstraße", 75, "04109", "s8o17"),
            Mitarbeiter(11, "Bogenmacher", "Paul", "bmp", "000", "Honk"),
            Mitarbeiter(12, "b", "Bert", "b", "0", "Honk")
    )
}