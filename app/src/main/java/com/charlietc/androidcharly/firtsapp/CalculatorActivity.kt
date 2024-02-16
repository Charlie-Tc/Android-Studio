package com.charlietc.androidcharly.firtsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.charlietc.androidcharly.R

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val ediText = findViewById<AppCompatEditText>(R.id.ediText)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val addition = findViewById<Button>(R.id.addition)
        val subtraction = findViewById<Button>(R.id.subtraction)
        val multiplication = findViewById<Button>(R.id.multiplication)
        val division = findViewById<Button>(R.id.division)
        val btnCalculate = findViewById<Button>(R.id.button)
        val remove = findViewById<Button>(R.id.remove)




        btn1.setOnClickListener{
            // setText: sirve para mostrar un palabra en el editText
            ediText.append("1")
        }

        btn2.setOnClickListener{
                ediText.append("2")
        }

        btn3.setOnClickListener{
                ediText.append("3")
        }

        btn4.setOnClickListener{
                ediText.append("4")
        }

        btn5.setOnClickListener{
                ediText.append("5")
        }

        btn6.setOnClickListener{
                ediText.append("6")
        }

        btn7.setOnClickListener{
                ediText.append("7")
        }

        btn8.setOnClickListener{
                ediText.append("8")
        }

        btn9.setOnClickListener{
                ediText.append("9")
        }

        addition.setOnClickListener{
            ediText.append("+")
        }
        subtraction.setOnClickListener{
            ediText.append("-")
        }
        multiplication.setOnClickListener{
            ediText.append("x")
        }
        division.setOnClickListener{
            ediText.append("/")
        }

        btnCalculate.setOnClickListener{
            val editarText = ediText.text.toString()
            if (editarText.isNotEmpty()){
                val intent = Intent(this,CalculadoraActivity::class.java)
                intent.putExtra("EXTRA_NAMES", editarText)
                startActivity(intent)
            }
        }

        remove.setOnClickListener{
            ediText.setText("")
        }

    }
}