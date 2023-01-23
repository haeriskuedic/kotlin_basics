import java.lang.Exception

fun main(args: Array<String>) {
    // printing lines
    println("*******")
    println("*Haris*")
    println("*******")

    // variables
    val x = 2   // inferred type
    val y: Int  // declared type
    val z: Int = 2

    y = 5

    println(x + y)

    // exercise 1
    // generate a random circle radius and calculates the circles area
    val random = Math.random()
    val radius = random * 10
    println(radius)
    println(Math.PI * (radius * radius))

    // strings
    var s1 = "Hello"
    //var s2 : String

    // raw strings
    var s2 = """ Das ist
        ein Raw
        String
    """

    println(s2)

    // string templates
    var h = 5
    var i = "x is $h"
    println(i)
    println("Hello ${h * h}")

    // conditionals
    var a = (Math.random() * 100).toInt()
    var b = (Math.random() * 100).toInt()
    println("$a,$b")

    if (a > b) {
        println("$a is bigger than $b")
    } else {
        println("$b is bigger than $a")
    }

    var max = if (a > b) a else b
    println("The max is $max")

    // when, replaces switch/case
    var grade = (Math.random() * 20).toInt()

    when (grade) {
        10 -> println("Excellent")
        9 -> println("Very good")
        8, 7 -> println("Good")
        6 -> println("Pass")
        1, 2, 3, 4, 5 -> println("Fail")
        else -> println("Illegal")
    }

    var r1 = (Math.random() * 100).toInt()
    var r2 = (Math.random() * 100).toInt()
    var op: Char = '-'

    var result = when (op) {
        '+' -> r1 + r2
        '-' -> r1 - r2
        '*' -> r1 * r2
        '/' -> r1 / r2
        else -> -1
    }

    println(result)

    // loops, while and do-while act the same as in java
    // for loop is like "for each" in other languages, only work
    // when you can operate only on iterable objects (objects than contain iterator z.B. Arrays)
    var string = "abcdefg"
    for (letter in string) {
        println(letter)
    }

    println("*Abstand*")

    // the indices property holds a collection of the objects indices, starting from 0.
    for (index in string.indices) if (index % 2 == 0) println(string[index])

    // index + buchstabe wird geprinted
    for ((index, letter) in string.withIndex()) println("$index, $letter")

    // ranges
    for (i in 1..10) print("$i")

    for (i in 1..10 step 2) print("$i")

    for (c in 'z' downTo 'c') println(c)

    // arrays
    // this codes creates an array of integers with size 5, and assigns to it the even numbers
    // between 2 and 10
    var iArray = IntArray(5)
    for (i in 2..10 step 2) iArray[i / 2 - 1] = i

    // this line creates an array of String objects with size 5:
    var stringObjects = arrayOfNulls<String>(5)

    // print results of array
    var counter = 0
    while (counter < iArray.size) {
        println(iArray[counter])
        counter++
    }

    // calling function
    display('*', 5, true)
    display('%', 3)
    display('#')


    // Lambda expression
    // Lambda Expressions
    // One of the most common thing in functional languages is the possibilty to use functions as variables,
    // meaning to pass a function as a parameter to another function, or to return a function as a returned value
    val lambda = { a: Int, b: Int -> a + b }

    println("Lambda function " + lambda(4, 5))
    println(lambda(3, 2) + lambda(1, 2))


    // Null safety
    // kotlin allow two types of variables
    // 1. variables that can never contain null
    // 2. variables that can, which called nullable
    var z1 = "abc"
    //z1 = null // error

    // defining a nullable variable:
    var z2: String? = "abc"
    z2 = null // no error

    // if the object is null, it returns null, otherwise it executes the intended command
    var len = z2?.length


    // user input
    //val userInput = readLine()?.toInt()
    val userInput = readlnOrNull()?.toInt()
    //var iInt = userInput.toInt()
    println("your input $userInput")

    /*
    Operators - Assignment
    = Assignment
    $ Reference
    ${ } Reference expression
     */
    if (userInput != null) {
        println("this is a reference expression ${userInput * userInput!!}")
    }

    // exception
    var test = readLine()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace()
        println("An exception happened \n ${e.localizedMessage}")
    } finally {
        // finally wird immer ausgeführt
        println("The execution has completed")
    }

    // throw
    var test2 = readLine()
    throw IllegalStateException("I dont like this Input")
}

// Function definition:
// parameter liste ist in klammern
// the functions returned values type comes after : ganz hinten
fun square(num: Int): Int {
    return num * num
}

// when ich diese function aufrufe und nicht alle parameter mitgebe
// werden die definierten werte genommen
fun display(sign: Char, amount: Int = 1, withIndices: Boolean = false) {
    if (withIndices) {
        for (i in 1..amount) print("$i")
        println()
    }
    for (i in 1..amount) {
        print("$sign")
    }
}