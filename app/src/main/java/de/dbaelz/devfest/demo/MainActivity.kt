package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.util.TypedValue
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var lastText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello.apply {
            text = "Hello DevFest Karlsruhe"
            setTextColor(resources.getColor(R.color.colorAccent))
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }.also {
            lastText = it.text.toString()
        }

        lastText?.let {
            Log.d("DevFest", it)
        }
    }
}
