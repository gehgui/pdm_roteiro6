package com.example.pdm_roteiro6

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editNome: EditText
    private lateinit var editEmail: EditText
    private lateinit var btnEnviar: Button
    private val TAG = "CicloDeVida"
    private val NOME_ALUNO = "[Seu Nome]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate chamado - MainActivity - $NOME_ALUNO")

        editNome = findViewById(R.id.editNome)
        editEmail = findViewById(R.id.editEmail)
        btnEnviar = findViewById(R.id.btnEnviar)

        btnEnviar.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NOME", editNome.text.toString())
            intent.putExtra("EMAIL", editEmail.text.toString())
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart chamado - MainActivity - $NOME_ALUNO")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume chamado - MainActivity - $NOME_ALUNO")

        val sharedPref = getSharedPreferences("DadosFormulario", Context.MODE_PRIVATE)
        val nomeSalvo = sharedPref.getString("NOME_SALVO", "")
        val emailSalvo = sharedPref.getString("EMAIL_SALVO", "")

        editNome.setText(nomeSalvo)
        editEmail.setText(emailSalvo)

        Log.d(TAG, "Dados recuperados com getSharedPreferences - MainActivity - $NOME_ALUNO")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause chamado - MainActivity - $NOME_ALUNO")

        val sharedPref = getSharedPreferences("DadosFormulario", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString("NOME_SALVO", editNome.text.toString())
        editor.putString("EMAIL_SALVO", editEmail.text.toString())
        editor.apply()

        Log.d(TAG, "Dados salvos com getSharedPreferences - MainActivity - $NOME_ALUNO")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop chamado - MainActivity - $NOME_ALUNO")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart chamado - MainActivity - $NOME_ALUNO")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy chamado - MainActivity - $NOME_ALUNO")
    }
}