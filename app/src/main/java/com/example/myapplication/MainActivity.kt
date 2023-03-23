package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var nameEditText : EditText
    lateinit var sendNameButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Function", "onCreate")

        nameEditText = findViewById(R.id.nameEditText)
        sendNameButton = findViewById(R.id.sendNameButton)

        sendNameButton.setOnClickListener {
            var name = nameEditText.text.toString()

            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NAME",name)
            startActivity(intent)
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("Function","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Function","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Function","onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Function","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Function", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Function","onDestroy")
    }
}