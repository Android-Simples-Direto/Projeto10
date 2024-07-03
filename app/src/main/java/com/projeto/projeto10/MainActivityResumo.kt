package com.projeto.projeto10

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityResumo : AppCompatActivity() {

    private lateinit var btnTelaVoltarHome: ImageView

    private  lateinit var verTelaReceita: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_resumo)

        verTelaReceita = findViewById(R.id.btn_Receita)

        verTelaReceita.setOnClickListener {

            val verReceitaAgora = Intent(this, MainActivityReceita::class.java)

            startActivity(verReceitaAgora)

        }

        btnTelaVoltarHome = findViewById(R.id.btnVoltarHome)

        btnTelaVoltarHome.setOnClickListener {

            finish()
        }
    }
}