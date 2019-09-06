package com.cshihlin9015

import java.time.Duration
import java.time.LocalDateTime

fun main() {
    val enter = LocalDateTime.of(2019, 9, 6, 8, 0, 0)
    val leave = LocalDateTime.of(2019, 9, 6, 11, 5, 0)
    var car1 = Car("LJY-756", enter)
    car1.leave = leave
    println(car1.duration())
    val hours = Math.ceil(car1.duration() / 60.0).toLong()
    println(hours)
}

class Car(val id: String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value
        }

    fun duration() = Duration.between(enter, leave).toMinutes()

}