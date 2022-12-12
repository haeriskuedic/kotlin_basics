data class DataClass(var first: String, var last: String, val id: Int) {

    fun main(args: Array<String>) {
        var w1 = DataClass("John", "Smith", 111)
        var w2 = DataClass("Sara", "Mitchell", 6765)
        var w3 = DataClass("Sara", "Mitchell", 6765)

        print(w1)

        if (w3.equals(w2))
            print("Equal")
        else
            print("Not equal")
    }
}