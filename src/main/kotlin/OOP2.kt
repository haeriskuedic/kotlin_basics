import javax.xml.crypto.Data

/*
- There are 2 object concepts in Kotlin
	- A class can be instantiated
		- the instance is called an object
	- "Object" construct -> An object is a static class
		- all methods and variables can be accessed without an instance
		- Similar how to create a class, you create an object
 */

fun main(args: Array<String>) {
    /*
        first Object concept
     */
    val myCar: Car = Car()  // type is optional
    val yourCar = Car()

    myCar.model = "BMW"
    yourCar.model = "Mercedes-Benz"

    myCar.start()
    myCar.drive(60)

    yourCar.start()
    yourCar.drive(100)


    /*
        second Object concept
     */
    //DatabaseAccess.connected = true
    if(DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println("Database is connected: ${DatabaseAccess.connected}")
}

class Car {
    var model: String? = null
    var topSpeed = 100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at a speed to $speed")
    }
}

/*
    second Object concept
 */
object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the databse")
    }

    fun disconnect() {
        connected = false
        println("Disconnected to the databse")
    }


}
