package com.example.utnfrlp.moviles.tp1_moviles

import android.os.Bundle
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameInput = findViewById<EditText>(R.id.username) //Creo una variable para ingresar el usuario y segun el tipo de label (EditText en este caso) y una id me lo linkea con la vista.
        val passwordInput = findViewById<EditText>(R.id.password) //Misma logica pero para la contraseña
        val loginButton = findViewById<Button>(R.id.loginButton)
        val registerTextView = findViewById<TextView>(R.id.registerTextView)
        loginButton.setOnClickListener { //Cuando se clickea el boton disparatodo el codigo que va adentro de las llaves
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            if (username == "Juan Torres" && password == "1234utn") {
                Toast.makeText(this, "Login exitoso", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
            }
        }
        registerTextView.setOnClickListener {
            //
        }

    }
}