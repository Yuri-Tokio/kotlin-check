package com.example.kotlincheckpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.kotlincheckpoint.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btaSoma.setOnClickListener { irSomar() }

        binding.btaSubtracao.setOnClickListener { irSubtrair() }

    }

    private fun irSomar(){
        val intent = Intent(this, SomaActivity::class.java)

        startActivity(intent)
    }

    private fun irSubtrair(){
        val intent = Intent(this, SubtracaoActivity::class.java)

        startActivity(intent)
    }
}
