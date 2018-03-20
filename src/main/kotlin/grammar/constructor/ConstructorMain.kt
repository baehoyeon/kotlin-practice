package grammar.constructor

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {

}

class User constructor(_name: String) {
    val name : String

    init {
        name = _name
    }
}