package de.dbaelz.devfest.example

fun main(args: Array<String>) {
    destructuringMapAndLambdaExample()

    sealedClassExample()

    createDSLWithKotlinExample()
}

// Destructuring declaration with maps and lambdas
fun destructuringMapAndLambdaExample() {
    val map = hashMapOf(Pair("a", 1), Pair("b", 2))
    for ((key, value) in map) {
        println("$key -> $value")
    }
    map.mapValues { (key, value) -> println("$key -> $value") }
}

// Usage example for a sealed class
fun sealedClassExample() {
    println(checkForResponse(Response.Success("Yeah, it worked!")))
    println(checkForResponse(Response.Error(404, "Not found")))
}

fun checkForResponse(response: Response): String {
    return when(response) {
        is Response.Success -> response.body
        is Response.Error -> "${response.errorCode}: ${response.message}"
    }
}

// An example for a DSL with Kotlin
fun createDSLWithKotlinExample() {
    val application = application {
        config {
            id = "de.dbaelz.devfest"
            name = "DevFest Demo"
        }
    }
    println(application.toString())
}