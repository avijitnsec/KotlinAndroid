package com.example.avijitdas.kotlinbeginner

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

//    private lateinit var editTextHellolo

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun launchSecondActivity(view: View){
        val LOG_TAG = "DEBUG"
        Log.d(LOG_TAG, "Button Clicked")

        var intent = Intent(this, secondActivity::class.java)


        var editTextHello = findViewById<EditText>(R.id.editText).text.toString()
        Log.d("TAG", editTextHello)
        intent.putExtra("Extra", "$editTextHello")
        startActivity(intent)
    }
}
