package grammar.collection.handle

fun main(args: Array<String>) {
    val strs = listOf("qoo", "pooh")
    val flatStr = strs.flatMap { it.toList() }
}