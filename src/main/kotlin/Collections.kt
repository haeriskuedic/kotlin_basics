/*
Types of Collections

Collections are a list of elements
Group elements together
Zero or more elements
Same type

- List
Ordered Collection
Elements can be accessed by the position (index, Indices always start with 0)
Can contain duplicate elements

- Set
Group of unique elements
The order has no significance
We can go through the elements one by one (iterate over them), but the order is not defined

- Map
A set of key-value pairs
Keys are unique (set)
Each key maps to exactly one value
values can be duplicates

- Iterators
An iterator is an object that loops through elements of a collection

 */

fun main(args: Array<String>) {
    /*
    Lists
     */
    // List - ordered collection that contain duplicate elements
    var colors = listOf<String>("blue", "yellow", "red", "blue", "red");
    println(colors)
    println(colors[2])
    println(colors.get(2))
    println(colors.component1().length)
    println(colors.size)

    // ArrayList - a mutable List, that means we can change it
    var colors2 = arrayListOf<String>("blue", "red")
    println(colors2)
    colors2.add("yellow")
    println(colors2)

    // add new collection to ArrayList
    var moreColors = arrayListOf<String>("purple", "pink")
    colors2.addAll(moreColors)
    println(colors2)


    /*
    Sets
     */
    // Set - stores unique elements in an undefined order
    // doppelte values werden nicht ausgegeben, also ignoriert
    val numbers = setOf<Int>(6, 37, 6, 41)
    println(numbers)
    println(numbers.average())

    val numbers2 = setOf<String>() // a empty set

    // HashSet - a mutable set, that means we can change it
    val numbers3 = hashSetOf<Int>(1, 2, 3, 4, 4, 56)
    println(numbers3)
    numbers3.add(21)
    println(numbers3)


    /*
    Maps
     */
    // Map - is a set of key-value pairs
    // keys are unique, values can be duplicates
    val count = mapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(count)

    val count2 = mapOf<Int, String>(Pair(1, "HK"), Pair(2, "HHKK"))
    println(count2.values.onEach { value -> println(value) })

    // Hash Maps - a mutable map, that means we can change it
    var count3 = hashMapOf(Pair(1, "eins"), Pair(2, "zwei"))
    println(count3)
    count3[5] = "five"
    println(count3)

    count3.remove(2)
    println(count3)

    for (pairs in count3)
        println("in $pairs")
}