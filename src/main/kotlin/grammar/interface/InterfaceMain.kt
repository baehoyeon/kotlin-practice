package grammar.`interface`

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {
    val logger = SystemLogger()
    logger.addLog("custom")
    logger.hello()
}

interface Logger {
    fun addLog(message: String)
    fun hello() = addLog("hello world")
}

class SystemLogger: Logger {
    override fun addLog(message: String) {
        println(message)
    }
}