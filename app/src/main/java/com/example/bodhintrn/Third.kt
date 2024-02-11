package com.example.bodhintrn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val buttonThird: Button = findViewById(R.id.button3)


        buttonThird.setOnClickListener {
            val intent = Intent(this, Fourth::class.java)
            startActivity(intent)

        }
    }
}