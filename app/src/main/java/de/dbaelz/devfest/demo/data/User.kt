package de.dbaelz.devfest.demo.data

typealias Username = String

data class User(val username: Username,
                val points: Int,
                val description: String = "")
