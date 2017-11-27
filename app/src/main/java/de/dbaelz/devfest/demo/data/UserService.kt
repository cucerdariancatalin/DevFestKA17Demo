package de.dbaelz.devfest.demo.data

object UserService {
    private var users = mutableListOf<User>()

    val hasUser: Boolean
        get() = users.isNotEmpty()

    init {
        addUser(User(points = 100, username = "dbaelz"))
    }

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUser(username: Username): User {
        return users.first { it.username == username }
    }
}