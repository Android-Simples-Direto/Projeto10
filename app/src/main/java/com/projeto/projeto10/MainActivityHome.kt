package com.projeto.projeto10

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityHome : AppCompatActivity() {

    private lateinit var Voltar: ImageView
    private lateinit var telaResumo: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_home)

        telaResumo = findViewById(R.id.btn_Resumo)

        telaResumo.setOnClickListener {

            val telaResumoProsseguir = Intent(this, MainActivityResumo::class.java)

            startActivity(telaResumoProsseguir)
        }

        Voltar = findViewById(R.id.btnVoltar)

        Voltar.setOnClickListener {

            val voltarTela = Intent(this, MainActivity::class.java)

            startActivity(voltarTela)
        }
    }
}