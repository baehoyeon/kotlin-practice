package grammar.`when`

import common.blankSpace

/**
 * Created by Qoo
 * Date : 2018. 3. 11..
 */
fun main(args: Array<String>) {
    println(getDescription(Color.RED))
    println(getDescription(Color.BLUE))
    println(getDescription(Color.GREEN))

    blankSpace()

    println(isMyFavoriteColor(Color.RED))
    println(isMyFavoriteColor(Color.BLUE))
    println(isMyFavoriteColor(Color.GREEN))

    blankSpace()

    println(mix(Color.RED, Color.BLUE))
    println(mix(Color.BLUE, Color.RED))
    println(mix(Color.BLUE, Color.GREEN))

    blankSpace()

    println(mixOptimized(Color.RED, Color.BLUE))
    println(mixOptimized(Color.BLUE, Color.RED))
    println(mixOptimized(Color.BLUE, Color.GREEN))
}

fun getDescription(color: Color) = when (color) {
    Color.RED -> "red"
    Color.BLUE -> "blue"
    Color.GREEN -> "green"
}

fun isMyFavoriteColor(color: Color) = when (color) {
    Color.RED, Color.BLUE -> true
    Color.GREEN -> false
}

fun mix(color1: Color, color2: Color) = when (setOf(color1, color2)) {
    setOf(Color.RED, Color.BLUE) -> "orange"
    else -> "black"
}

fun mixOptimized(color1: Color, color2: Color) = when {
    (color1 == Color.RED && color2 == Color.BLUE) || (color2 == Color.RED && color1 == Color.BLUE) -> "orange"
    else -> "black"
}