package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    lateinit var ageEditText : EditText
    lateinit var sendAgeButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var name = intent.extras?.getString("NAME","")

        ageEditText = findViewById(R.id.ageEditText)
        sendAgeButton = findViewById(R.id.sendAgeButton)

        sendAgeButton.setOnClickListener {

            val age = ageEditText.text.toString().toInt()
            val intent = Intent(this, MainActivity3::class.java)

            intent.putExtra("NAME",name)
            intent.putExtra("AGE",age)

            startActivity(intent)



        }


    }
}