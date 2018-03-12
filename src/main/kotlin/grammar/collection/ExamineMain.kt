package grammar.collection

import common.blankSpace

fun main(args: Array<String>) {
    println(isLetter('a'))
    println(isNotDigit('a'))

    blankSpace()

    println(recognize('A'))
    println(recognize('2'))
    println(recognize('@'))

    blankSpace()

    println("kotlin" in setOf("java", "javascript"))
}

fun isNotDigit(char: Char) = char !in '0'..'9'

fun isLetter(char: Char) = char in 'a'..'z' || char in 'A'..'Z'

fun recognize(char: Char) = when (char) {
    in 'a'..'z', in 'A'..'Z' -> "This is a letter"
    in '0'..'9' -> "This is a digit"
    else -> "I don't know"
}

