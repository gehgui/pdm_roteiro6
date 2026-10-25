package com.example.pdm_roteiro6

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val TAG = "CicloDeVida"
    private val NOME_ALUNO = "[Seu Nome]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(TAG, "onCreate chamado - MainActivity2 - $NOME_ALUNO")

        val textNome = findViewById<TextView>(R.id.textNome)
        val textEmail = findViewById<TextView>(R.id.textEmail)

        val nome = intent.getStringExtra("NOME")
        val email = intent.getStringExtra("EMAIL")

        textNome.text = nome
        textEmail.text = email
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado - MainActivity2 - $NOME_ALUNO")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado - MainActivity2 - $NOME_ALUNO")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado - MainActivity2 - $NOME_ALUNO")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop chamado - MainActivity2 - $NOME_ALUNO")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado - MainActivity2 - $NOME_ALUNO")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado - MainActivity2 - $NOME_ALUNO")
    }
}
