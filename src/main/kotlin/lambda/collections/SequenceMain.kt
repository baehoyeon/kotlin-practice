package lambda.collections

import common.blankSpace

fun main(args: Array<String>) {
    val people = listOf(Person(name = "qoo", age = 30), Person(name = "linda", age = 29), Person(name = "Judy", age = 28),
            Person(name = "pooh", age = 40), Person(name = "jinny", age = 19), Person(name = "merry", age = 23))

    val list = people.asSequence()
            .filter { it.age > 20 }
            .filter { it.name.startsWith("q") || it.name.startsWith("p") }
            .toList()
    println(list)

    blankSpace()
    people.asSequence()
            .map { person -> println(person) }
    println("호출되지 않음")

    blankSpace()
    people.asSequence()
            .map { person -> println(person) }
            .toList()
}