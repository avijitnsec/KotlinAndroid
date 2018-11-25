package com.example.avijitdas.kotlinbeginner

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = getIntent()
        val myVal = intent.getStringExtra("Extra")//getStringExtra("key")
        Log.d("TAG", "$myVal")

        var tView = findViewById<TextView>(R.id.secondView)
        tView.text = myVal
    }
}
