package com.driuft.androidkotlindebugging.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import java.util.*

class RandomColorActivity : AppCompatActivity() {

    private val rootView: View get() = findViewById(android.R.id.content)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_color)

        rootView.setOnClickListener {
            it.setBackgroundColor(getRandomColor())
        }
    }

    private fun getRandomColor(): Int {
        val rnd = Random()
        return Color.argb(
            255,                   // full opacity
            rnd.nextInt(256),      // red
            rnd.nextInt(256),      // green
            rnd.nextInt(256)       // blue
        )
    }
}
