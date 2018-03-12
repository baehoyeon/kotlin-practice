package grammar.clazz

import common.blankSpace

/**
 * Created by Qoo
 * Date : 2018. 3. 11..
 */
fun main(args: Array<String>) {
    val person = Person("qoo", true)
    println(person.name)
    println(person.isMarried)

    person.isMarried = false
    println(person.isMarried)

    blankSpace()

    val rectangle = Rectangle(10, 10)
    println(rectangle.isSquare)
}

class Person(
        val name: String, // final
        var isMarried: Boolean
)

class Rectangle(private val height: Int, private val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}