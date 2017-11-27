package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import de.dbaelz.devfest.demo.data.UserService
import de.dbaelz.devfest.demo.data.Username

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbaelz: Username = "dbaelz"
        val user = UserService.getUser(username = dbaelz)
        Log.d("DevFest", "User ${user.username} has ${user.points} points")
    }
}
