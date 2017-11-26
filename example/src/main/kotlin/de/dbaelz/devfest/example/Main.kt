package de.dbaelz.devfest.example

fun main(args: Array<String>) {
    println(checkForResponse(Response.Success("Yeah, it worked!")))
    println(checkForResponse(Response.Error(404, "Not found")))
}

fun checkForResponse(response: Response): String {
    return when(response) {
        is Response.Success -> response.body
        is Response.Error -> "${response.errorCode}: ${response.message}"
    }
}