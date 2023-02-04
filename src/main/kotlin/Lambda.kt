/*
Lambdas vs functions
 */
fun main(args: Array<String>) {

    println("Lambda functions")

    // this is a normal function
    fun printMessage(name: String) {
        println("I am a function!")
    }

    // this is a lambda
    // a Lambda is an annonymous function (has no name)
    // can have paramters, they are declared at the start of the block
    // can be assigned to a variable

    { name: String -> println("This is a Lambda") }

    val myLambda = { name: String -> println("Hello $name") }

    // Higher Order function
    // is a function that takes another function as a parameter
    fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
        for (name in names) {
            doSomething(name)
        }
    }

    val names = arrayListOf<String>("Mary", "Kate", "Mike")
    sayHello(names, myLambda)

}