package org.iproute.examples.kotlin.test.other.study0

/**
 * @author tech@intellij.io
 * @since 2020/12/28
 */

// 字符串模板
fun main() {
    var a = 1
    val s1 = "a is $a"
    a = 2

    val s2 = "${s1.replace("is", "was")},but now is $a"
    println(s2)
}