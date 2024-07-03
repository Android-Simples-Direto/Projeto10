package com.projeto.projeto10

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivityReceita : AppCompatActivity() {

    private lateinit var btnFechar: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_receita)

        btnFechar = findViewById(R.id.btn_Fechar)

        btnFechar.setOnClickListener {

            finish()
        }
    }
}