package de.dbaelz.devfest.demo.data

typealias Username = String
typealias LatLong = Pair<Float, Float>

data class User(val username: Username,
                val points: Int,
                val description: String = "",
                val location: LatLong = Pair(49.0f, 8.4f))
