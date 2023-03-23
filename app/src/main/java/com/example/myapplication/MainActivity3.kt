package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<TextView>(R.id.textview1).text =
            intent.extras?.getString("NAME","")

        findViewById<TextView>(R.id.textview2).text =
            intent.extras?.getInt("AGE",0).toString()
    }
}