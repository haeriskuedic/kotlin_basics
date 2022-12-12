// new class:
// class header
class OOP {
    // class body

}

// every class can have ony primary constructor and several secondary constructors.
// The primary constructor is defined in the class header
class Circle constructor(radius: Double, x: Double, y: Double) {

}

// the primary constructor is public by default, and if we keep it public,
// we can omit (auslassen) the constructor keyword:
/*
class Circle(radius: Double, x: Double, y: Double) {

}
*/

// the constructor determines how objects can be created
fun main(args: Array<String>) {
    var c = Circle(3.2, 1.0, 4.0)
}
