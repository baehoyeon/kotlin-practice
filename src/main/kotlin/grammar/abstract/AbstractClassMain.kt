package grammar.abstract

import grammar.`interface`.Logger

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {
    val logger = ExtendAbstractSystemLogger()
    logger.print()
}

abstract class AbstractSystemLogger: Logger {
    abstract fun print()

    open fun open() {

    }

    fun diable() {

    }
}

class ExtendAbstractSystemLogger: AbstractSystemLogger() {
    override fun print() {
        println("print")
    }

    override fun addLog(message: String) {
        println(message)
    }

    override fun open() {
        println("open")
    }
}