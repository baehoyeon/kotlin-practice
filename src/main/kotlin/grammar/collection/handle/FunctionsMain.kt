package grammar.collection.handle

import common.blankSpace

/**
 * Created by Qoo
 * Date : 2018. 4. 2..
 */
fun main(args: Array<String>) {
    val people = listOf(Person(name = "qoo", age = 30), Person(name = "linda", age = 29), Person(name = "Judy", age = 28),
            Person(name = "pooh", age = 40), Person(name = "jinny", age = 19), Person(name = "merry", age = 23))

    val twentyCount = people.filter { it.age in 20..29 }.count()
    println("20 대는 몇명 : $twentyCount")

    blankSpace()
    val map = people.groupBy { it.age / 10 * 10 }
    println("세대별 : $map")

    blankSpace()
    val listOrderByAge = people.sortedBy { it.age }.map { it.name }
    println("나이 어린순으로 이름 : $listOrderByAge")

    blankSpace()
    val youngestPerson = people.sortedBy { it.age }.first()
    println("가장 어린사람 :  $youngestPerson")
}