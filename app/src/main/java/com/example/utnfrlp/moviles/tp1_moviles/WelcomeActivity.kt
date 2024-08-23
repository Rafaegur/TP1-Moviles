package com.example.utnfrlp.moviles.tp1_moviles

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val username = intent.getStringExtra("USERNAME")
        welcomeMessage.text = "¡Bienvenido, $username!"
    }
}
