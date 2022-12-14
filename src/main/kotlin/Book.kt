// Book class
class Book(val title: String, val author: String, var pages:Int) {
    val LONG = 200
    init {
        if(pages <= 0)
            pages = 1;
    }

    fun isLongBook() = pages > LONG
}

fun main(args: Array<String>) {
    var b1 = Book("1984", "George Orwell", 250)
    println(if(b1.isLongBook()) "long" else "short")

    var b2 = Book("1984", "Haris Kudic", 180)
    println(if(b2.isLongBook()) "long" else "short")
}