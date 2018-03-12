package grammar.exception

fun main(args: Array<String>) {
    val percent = 101.2
    validPercent(percent)
}

fun validPercent(percent: Double) {
    if (percent !in 0..100) throw RuntimeException("퍼센트는 0 ~ 100 사이의 값이여야 합니다.")
}
