package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import de.dbaelz.devfest.demo.data.User
import de.dbaelz.devfest.demo.data.UserService
import de.dbaelz.devfest.demo.data.Username

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        UserService.addUser(User("dbaelz", 100))

        val dbaelz: Username = "dbaelz"
        val user = UserService.getUser(username = dbaelz)
    }
}
