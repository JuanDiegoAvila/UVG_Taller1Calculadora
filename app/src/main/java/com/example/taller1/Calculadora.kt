package com.example.taller1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Calculadora : AppCompatActivity() {

    lateinit var txtResultado: TextView
    lateinit var btnUno: Button
    lateinit var btnDos: Button
    lateinit var btnTres: Button
    lateinit var btnMas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)
        txtResultado.text = ""

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnMas = findViewById(R.id.btnMas)



        btnUno.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " 1 "
        }
        btnDos.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " 2 "
        }
        btnTres.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " 3 "
        }
        btnMas.setOnClickListener {
            txtResultado.text = txtResultado.text as String + " + "
        }
    }
}