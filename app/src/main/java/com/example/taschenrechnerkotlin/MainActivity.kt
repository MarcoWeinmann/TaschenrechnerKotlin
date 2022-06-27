package com.example.taschenrechnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    val eingabe1 = findViewById<EditText>(R.id.editTextNumber).text
    val eingabe2 = findViewById<EditText>(R.id.editTextNumber2).text
    val plusButton = findViewById<Button>(R.id.button_plus).

}

fun Plus(){

}