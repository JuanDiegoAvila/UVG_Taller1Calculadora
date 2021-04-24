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
    lateinit var btnCuatro: Button
    lateinit var btnCinco: Button
    lateinit var btnSeis: Button
    lateinit var btnSiete: Button
    lateinit var btnOcho: Button
    lateinit var btnNueve: Button
    lateinit var btnCero: Button
    lateinit var btnMas: Button
    lateinit var btnMenos: Button
    lateinit var btnPor: Button
    lateinit var btnDiv: Button
    lateinit var btnIgual: Button
    lateinit var btnPunto: Button
    lateinit var btnC: Button
    lateinit var btnBorrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        txtResultado = findViewById(R.id.txtResultado)
        txtResultado.text = ""

        btnUno = findViewById(R.id.btnUno)
        btnDos = findViewById(R.id.btnDos)
        btnTres = findViewById(R.id.btnTres)
        btnCuatro = findViewById(R.id.btnCuatro)
        btnCinco = findViewById(R.id.btnCinco)
        btnSeis = findViewById(R.id.btnSeis)
        btnSiete = findViewById(R.id.btnSiete)
        btnOcho = findViewById(R.id.btnOcho)
        btnNueve = findViewById(R.id.btnNueve)
        btnCero = findViewById(R.id.btnCero)
        btnMas = findViewById(R.id.btnMas)
        btnMenos = findViewById(R.id.btnMenos)
        btnPor = findViewById(R.id.btnPor)
        btnDiv = findViewById(R.id.btnDiv)
        btnIgual = findViewById(R.id.btnIgual)
        btnPunto = findViewById(R.id.btnPunto)
        btnC = findViewById(R.id.btnC)
        btnBorrar = findViewById(R.id.btnBorrar)


        btnUno.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "1"
        }
        btnDos.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "2"
        }
        btnTres.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "3"
        }
        btnMas.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "+"
        }
        btnCuatro.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "4"
        }
        btnCinco.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "5"
        }
        btnSeis.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "6"
        }
        btnSiete.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "7"
        }
        btnOcho.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "8"
        }
        btnNueve.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "9"
        }
        btnCero.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "0"
        }
        btnMenos.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "-"
        }
        btnPor.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "×"
        }
        btnDiv.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "÷"
        }
        btnIgual.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "="
        }
        btnPunto.setOnClickListener {
            txtResultado.text = txtResultado.text as String + "."
        }
        btnC.setOnClickListener {
            txtResultado.text = ""
        }
        btnBorrar.setOnClickListener {
            var actual: String = txtResultado.text as String
            var nuevo = actual.substring(0,actual.length-1)
            txtResultado.text = nuevo
        }

    }
}