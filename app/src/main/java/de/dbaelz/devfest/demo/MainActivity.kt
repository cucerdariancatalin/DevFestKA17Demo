package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import de.dbaelz.devfest.demo.data.UserService
import de.dbaelz.devfest.demo.data.Username
import de.dbaelz.devfest.demo.data.hasPassed
import de.dbaelz.devfest.demo.data.measureTimeInMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dbaelz: Username = "dbaelz"

        val duration = measureTimeInMillis {
            val user = UserService.getUser(username = dbaelz)
            Log.d("DevFest", "User ${user.username} has ${user.points} points and " +
                    if (user.hasPassed()) "passed" else "failed")
        }
        Log.d("DevFest", "Duration is $duration ms")

        val (username, _, _, latlong) = UserService.getUser(username = dbaelz)
        val (lat, long) = latlong
        Log.d("DevFest", "User $username location is lat $lat and long $long")
    }
}
