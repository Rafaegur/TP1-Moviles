package com.example.utnfrlp.moviles.tp1_moviles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        //Inicializo las variables adjuntandolas segun su id con el xml
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val emailInput = findViewById<EditText>(R.id.emailInput)
        val passwordInput = findViewById<EditText>(R.id.passwordInput)
        val confirmPasswordInput = findViewById<EditText>(R.id.confirmPasswordInput)
        val registerButton = findViewById<Button>(R.id.registerButton)
        //Cuando registra el click disparatodo el codigo del registro
        registerButton.setOnClickListener {
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()
            val confirmPassword = confirmPasswordInput.text.toString()
            //Validaciones que pide el ejercicio, si alguna no se cumple tira una notificacion con Toast
            if (name.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "El nombre y el e-mail no pueden estar vacíos", Toast.LENGTH_SHORT).show()
            } else if (password.length < 6) {
                Toast.makeText(this, "La contraseña debe tener al menos 6 caracteres", Toast.LENGTH_SHORT).show()
            } else if (password != confirmPassword) {
                Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Registro exitoso", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, Login::class.java) //Intent, es una clase utilizada para realizar una solicitud de acción en Android, el contexto es el que acciona (this en este caso porque generalmente se llama desde donde se va a usar, y el resto es a donde va ( en este caso login )
                startActivity(intent) //Llama al método startActivity con el Intent creado anteriormente, lo que le indica al sistema que inicie la actividad Login.
                finish() // Cierra la actividad actual para que el usuario no pueda volver atrás al registro
            }
        }
    }
}
