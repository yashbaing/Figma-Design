package com.example.bodhintrn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFirst: Button = findViewById(R.id.button1)



        buttonFirst.setOnClickListener {
            val intent = Intent(this, secondactivity::class.java)
            startActivity(intent)

        }
    }
}