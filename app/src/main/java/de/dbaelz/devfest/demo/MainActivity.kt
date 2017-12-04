package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.linearLayout
import org.jetbrains.anko.textView

class MainActivity : AppCompatActivity(), AnkoLogger {
    private var lastText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        setContentView(R.layout.activity_main)

        hello.apply {
            text = "Hello DevFest Karlsruhe"
            setTextColor(resources.getColor(R.color.colorAccent))
            setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
        }.also {
            lastText = it.text.toString()
            toast("Applied text $lastText")
        }

        lastText?.let {
            debug { it }
        }
        */

        linearLayout {
            textView {
                text = "Hello DevFest Karlsruhe"
                setTextColor(resources.getColor(R.color.colorAccent))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
            }
        }
    }
}
