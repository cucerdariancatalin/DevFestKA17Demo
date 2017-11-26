package de.dbaelz.devfest.demo.data

object UserService {
    private var users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUser(username: Username): User {
        return users.first { it.username == username }
    }
}