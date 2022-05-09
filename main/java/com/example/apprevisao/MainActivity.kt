package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{checa()}
    }

    private fun checa(){
        val num1 = findViewById<EditText>(R.id.numero1).text.toString()
        val num2 = findViewById<EditText>(R.id.numero2).text.toString()



        try {
            val n1 = num1.toFloat()
            val n2 = num2.toFloat()

            if(n1 == n2) {
                Toast.makeText(
                    this, "Os números são iguais!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if(n1 > n2) {
                Toast.makeText(
                    this, "O primeiro número é maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if(n1 < n2) {
                Toast.makeText(
                    this, "O segundo número é maior!",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }
        catch(err: NumberFormatException) {
            Toast.makeText(
                this, "Números inválidos",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}