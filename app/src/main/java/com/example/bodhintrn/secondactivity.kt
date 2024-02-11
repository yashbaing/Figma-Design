package com.example.bodhintrn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        val buttonSecond: Button = findViewById(R.id.button2)



        buttonSecond.setOnClickListener {
            val intent = Intent(this, Third::class.java)
            startActivity(intent)

        }
    }
}