package de.dbaelz.devfest.example

fun main(args: Array<String>) {
    println(checkForResponse(Response.Success("Yeah, it worked!")))
    println(checkForResponse(Response.Error(404, "Not found")))

    val map = hashMapOf(Pair("a", 1), Pair("b", 2))
    for ((key, value) in map) {
        println("$key -> $value")
    }
    map.mapValues { (key, value) -> println("$key -> $value") }
}

fun checkForResponse(response: Response): String {
    return when(response) {
        is Response.Success -> response.body
        is Response.Error -> "${response.errorCode}: ${response.message}"
    }
}