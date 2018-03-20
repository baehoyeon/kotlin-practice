package lambda.collections

import common.blankSpace

/**
 * Created by Qoo
 * Date : 2018. 3. 20..
 */
fun main(args: Array<String>) {
    val people = listOf(Person(name = "qoo", age = 30), Person(name = "pooh", age = 29), Person(name = "Judy", age = 28))
    println(people.maxBy { it.age })
    println(people.maxBy { p -> p.age })
    println(people.maxBy { p: Person -> p.age })
    println(people.maxBy(Person::age))

    blankSpace()
    val sum = { x: Int, y: Int -> x + y }
    print(sum(1, 2))

    blankSpace()
    println(people.joinToString(separator = " ", transform = { p -> p.name }))
    println(people.joinToString(" ") { p: Person -> p.name })
}