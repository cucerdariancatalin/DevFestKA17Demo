package de.dbaelz.devfest.demo.data

typealias Username = String
typealias LatLong = Pair<Float, Float>

// A data class provides extended functionality like automatically generated
// equals()/hashCode(), toString() and component functions for destructuring
data class User(val username: Username,
                val points: Int,
                val description: String = "",
                val location: LatLong = Pair(49.0f, 8.4f))
