package grammar.innerfunction

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {
    var user = User(1, "QOO", "잠실")
    saveUser(user)

    user = User(1, "", "잠실")
    saveUser(user)
}

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if(value.isEmpty()) {
            throw RuntimeException("유저(id : ${user.id})의 $fieldName 을 입력하세요.")
        }
    }

    validate(user.name, "이름")
    validate(user.address, "주소")

    println("User($user) 저장 완료")
}