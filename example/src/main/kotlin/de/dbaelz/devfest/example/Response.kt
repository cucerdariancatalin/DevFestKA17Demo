package de.dbaelz.devfest.example

// A sealed class to represent a strict class hierarchy
// The subclasses of Response must be declared in the same file
sealed class Response {
    class Success(val body: String): Response()
    class Error(val errorCode: Int, val message: String?): Response()
}