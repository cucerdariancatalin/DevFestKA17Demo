package de.dbaelz.devfest.demo.data

fun User.hasPassed(): Boolean = points >= 80

fun measureTimeInMillis(func: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    func()
    return System.currentTimeMillis() - startTime
}