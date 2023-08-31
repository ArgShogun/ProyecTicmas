package com.curso.android.app.practica.apppractica.proyecticmas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText1 = findViewById(R.id.editText1)
        editText2 = findViewById(R.id.editText2)
        resultTextView = findViewById(R.id.resultTextView)
    }

    fun compareTexts(view: View) {
        val text1 = editText1.text.toString()
        val text2 = editText2.text.toString()

        if (text1 == text2) {
            resultTextView.text = "Los textos son iguales."
        } else {
            resultTextView.text = "Los textos son diferentes."
        }
    }
}
