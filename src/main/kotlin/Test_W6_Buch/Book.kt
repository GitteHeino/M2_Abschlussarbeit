package Test_W6_Buch

class Book {
    var pages : List<Page>
    var page : Page

    constructor(pages: List<Page>, page : Page){
        this.pages = pages
        this.page = page
    }

    fun read() {
        this.page.read()
    }

    fun nextPage() {
        var index : Int = this.pages.indexOf(this.page)
        index++
        if(index < this.pages.size){
            this.page = this.pages[index]
        }
    }

    fun previousPage() {
        var index : Int = this.pages.indexOf(this.page)
        index--
        if(index >= 0){
            this.page = this.pages[index]
        }
    }
}