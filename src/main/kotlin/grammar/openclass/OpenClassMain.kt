package grammar.openclass

import grammar.`interface`.Logger

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {
    val logger = ExtendOpenSystemLogger()
    logger.open()
}

open class OpenSystemLogger: Logger {
    fun disable(){} // override 금지
    open fun open(){}

    final override fun addLog(message: String) { // override 금지
        println(message)
    }
}

class ExtendOpenSystemLogger: OpenSystemLogger() {
    override fun open(){
        println("open")
    }
}