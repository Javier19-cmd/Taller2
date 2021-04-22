package com.example.taller2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.Button
import android.widget.TextView
import android.content.Intent

class MainActivity : AppCompatActivity() {
    lateinit var txtResultado: TextView
    lateinit var btnUno: Button
    lateinit var btnDos: Button
    lateinit var btnTres: Button
    lateinit var btnCuatro: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnCuatro = findViewById(R.id.btnCuatro)


        btnUno.setOnClickListener {
            txtResultado.text = "1"
        }

        btnDos.setOnClickListener {
            txtResultado.text = "2"
        }

        btnTres.setOnClickListener {
            txtResultado.text = "3"
        }

        btnCuatro.setOnClickListener {
            txtResultado.text = "4"
        }

        /*
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show()


        val btnHel: Button = findViewById(R.id.btnHello);

        btnHello.setOnClickListener {
            val intent: Intent = Intent(this, Calculadora::class.java)
            startActivity(intent)

            finish()

        }*/



    }

    /*
    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }*/
}