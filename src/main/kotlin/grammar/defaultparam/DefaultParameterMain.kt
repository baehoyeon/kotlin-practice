package grammar.defaultparam

fun main(args: Array<String>) {
    val list = arrayListOf("a", "b", "c", "d")

    println(joinToString(list))
    println(joinToString(list, postfix = ")", prefix = "("))

    println(list.joinToString())
}

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}