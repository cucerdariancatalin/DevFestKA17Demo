package de.dbaelz.devfest.example


sealed class Response {
    class Success(val body: String): Response()
    class Error(val errorCode: Int, val message: String?): Response()
}