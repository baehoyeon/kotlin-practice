package grammar.parsing

import common.blankSpace

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
fun main(args: Array<String>) {
    val filePath = "Users/BaeHoyeon/Desktop/kotlin/kotlin-practice/build.gradle"
    val directory = filePath.substringBeforeLast("/")
    val fullName = filePath.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("directory : $directory")
    println("fileName : $fileName")
    println("extension : $extension")

    blankSpace()

    val str = "12.323.4343.232.123.2323-2323-4323"
    val strList = str.split(".", "-")
    println(strList)
}