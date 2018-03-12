package grammar.condition

/**
 * Created by Qoo
 * Date : 2018. 3. 11..
 */
fun main(args: Array<String>) {
    val n1 = 1
    val n2 = 2

    val result = max(n1, n2)
    print(result)
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}