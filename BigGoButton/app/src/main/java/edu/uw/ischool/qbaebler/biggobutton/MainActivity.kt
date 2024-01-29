package edu.uw.ischool.qbaebler.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.graphics.Color
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var pushCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val giant_button = findViewById<Button>(R.id.giant_button)
        giant_button.setOnClickListener {
            pushCount++
            if (pushCount == 1) {
                giant_button.text =  getString(R.string.button_text_pushed_once)
            } else {
                giant_button.text = "You have pushed me $pushCount times!"
            }
            val randomBackground = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            giant_button.setBackgroundColor(randomBackground)
            val randomColor = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
            giant_button.setTextColor(randomColor)
        }
    }
}