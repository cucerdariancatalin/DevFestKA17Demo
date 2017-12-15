package de.dbaelz.devfest.demo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.TypedValue
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity(), AnkoLogger {
    private var lastText: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Examples:
        // - Kotlin Android Extension
        // - apply/also/let function blocks and
        // - Anko Commons: Useful extension functions
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


        // Example: Anko Layouts DSL
        linearLayout {
            orientation = LinearLayout.VERTICAL
            textView {
                text = "Hello DevFest Karlsruhe"
                textAlignment = View.TEXT_ALIGNMENT_CENTER
                setTextColor(resources.getColor(R.color.colorAccent))
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f)
            }
        }
    }
}
