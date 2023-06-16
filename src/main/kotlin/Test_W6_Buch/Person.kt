package Test_W6_Buch

class Person {

    var vorname: String
    var nachname: String
    var alter: Int

    constructor(name: String){
        // string.split(" "):    Gordon Lucas -> ["Gordon", "Lucas"]
        this.vorname = name.split(" ")[0]
        this.nachname = name.split(" ")[1]
        this.alter = 0
    }

    constructor(vn: String, nn: String, alter: Int = 0){
        this.vorname = vn
        this.nachname = nn
        this.alter = alter
    }

    constructor(name: String, alter: Int): this(name){
        this.alter = alter
    }

    fun geburtstag(){
        alter ++
        println(alter)
    }
}


// TODO KOMMENTAR