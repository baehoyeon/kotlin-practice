package grammar.collection

fun main(args: Array<String>) {
    // ArrayList
    val arrayList = arrayListOf("qoo", "curl", "berry", "zoe")
    println(arrayList.toString())

    // HashMap
    val map = hashMapOf("qoo" to 30, "curl" to 29, "berry" to 27, "zoe" to 27)
    println(map.toString())

    for (name in arrayList) {
        val age = map[name]
        println("name : $name age : $age")
    }

    // List
    val list = listOf("qoo", "curl", "berry", "zoe")
    println(list.toString())

    // Set
    val set = setOf("qoo", "curl", "berry", "zoe", "qoo", "curl", "berry", "zoe")
    println(set.toString())
}