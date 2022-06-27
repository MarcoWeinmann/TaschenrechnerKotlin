package com.example.taschenrechnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val eingabe1 = findViewById<EditText>(R.id.editTextNumber)
        val eingabe2 = findViewById<EditText>(R.id.editTextNumber2)
        val plusButton = findViewById<Button>(R.id.button_plus)
        val minusButton = findViewById<Button>(R.id.button_minus)
        val geteiltButton = findViewById<Button>(R.id.buttonTeilen)
        val MultiButton = findViewById<Button>(R.id.buttonMulti)
        val ergebniss = findViewById<TextView>(R.id.Ergebniss_View)

        plusButton.setOnClickListener {
           ergebniss.text = (eingabe1.text.toString().toDouble() + eingabe2.text.toString().toDouble()).toString()
        }

        minusButton.setOnClickListener {
            ergebniss.text = (eingabe1.text.toString().toDouble() - eingabe2.text.toString().toDouble()).toString()
        }

        geteiltButton.setOnClickListener {

            if (eingabe2.text.toString().toInt() == 0){
                ergebniss.text = "error"
                }else {
                ergebniss.text = (eingabe1.text.toString().toDouble() / eingabe2.text.toString().toDouble()).toString()
                }
        }

        MultiButton.setOnClickListener {
            ergebniss.text = (eingabe1.text.toString().toDouble() * eingabe2.text.toString().toDouble()).toString()
        }



    }

}
