package com.example.taller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var txtResultado: TextView
        lateinit var btnUno: Button
        lateinit var btnDos: Button
        lateinit var btnTres: Button
        lateinit var btnCuatro: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnCuatro = findViewById(R.id.btnCuatro)

        btnUno.setOnClickListener()
        {
            txtResultado.text = "1"
        }

        btnDos.setOnClickListener()
        {
            txtResultado.text = "2"
        }

        btnTres.setOnClickListener()
        {
            txtResultado.text = "3"
        }

        btnCuatro.setOnClickListener()
        {
            txtResultado.text = "4"
        }
    }
}