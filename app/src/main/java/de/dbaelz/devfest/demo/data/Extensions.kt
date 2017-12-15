package de.dbaelz.devfest.demo.data

// An extension function for the User class
// This function is implemented as a single-line expression
fun User.hasPassed(): Boolean = points >= 80

// Example of a higher-order function
// A similar function is implemented in the standard library (Timing.kt)
fun measureTimeInMillis(func: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    func()
    return System.currentTimeMillis() - startTime
}