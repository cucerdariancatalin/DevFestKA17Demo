package de.dbaelz.devfest.example

// An example for a DSL with nested elements
// It uses basic language features of Kotlin like data classes, higher-order functions
// and extensions functions
data class Application(var config: Config? = null) {
    fun config(init: Config.() -> Unit) {
        config = Config().apply(init)
    }
}

data class Config(var id: String? = null,
                  var name: String? = null,
                  var versionCode: Int? = null)


fun application(init: Application.() -> Unit): Application = Application().apply(init)