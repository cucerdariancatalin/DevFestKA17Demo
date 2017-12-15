package de.dbaelz.devfest.demo.data

// The object keyword provides an easy way to declare a singleton
object UserService {
    private var users = mutableListOf<User>()

    // A single-line expression function
    fun hasUser(): Boolean = users.isNotEmpty()

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