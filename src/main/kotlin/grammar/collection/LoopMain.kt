package grammar.collection

import common.blankSpace
import java.util.*

fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    blankSpace()

    for (i in 100 downTo 1 step 2) {
        print(fizzBuzz(i))
    }

    blankSpace()

    // Map
    val binaryReps = TreeMap<Char, String>()
    for (char in 'A'..'Z') {
        val binaryChar = Integer.toBinaryString(char.toInt())
        binaryReps[char] = binaryChar
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    blankSpace()

    // List
    val list = arrayListOf("100", "1000", "10000")
    for ((index, element) in list.withIndex()) {
        println("$index - $element")
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "fizzbuzz "
    i % 3 == 0 -> "fizz "
    i % 5 == 0 -> "buzz "
    else -> "$i "
}
