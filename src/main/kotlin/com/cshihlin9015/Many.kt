package com.cshihlin9015

fun main() {
    val list = listOf(5, 1, 2, 7) // immutable，內容給定後不可在變，不可使用 add
    println(list) // 印出 [5, 1, 2, 7]

    val scores = listOf(91, 95, 88, 100, 90)
    for (score in scores) {
        println(score)
    }

    println(scores.get(3))

    //----------------------------------------------------------------------------
    var mutableList = mutableListOf(5, 1, 2, 7) // mutable，可使用 add
    mutableList.add(6)
    println(mutableList) // 印出 [5, 1, 2, 7, 6]

}