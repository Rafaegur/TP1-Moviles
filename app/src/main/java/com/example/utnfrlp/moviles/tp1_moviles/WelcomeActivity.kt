package com.example.utnfrlp.moviles.tp1_moviles

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.CheckBox
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        //Inicializo las componentes que voy a utilizar (Encuentro su id dispuesto en el xml, etc
        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        val username = intent.getStringExtra("USERNAME")
        welcomeMessage.text = "¡Bienvenido, $username!"

        val platformRadioGroup = findViewById<RadioGroup>(R.id.platformRadioGroup)
        val platformLogo = findViewById<ImageView>(R.id.platformLogo)
        val otherPreferenceInput = findViewById<EditText>(R.id.otherPreferenceInput)
        val checkOther = findViewById<CheckBox>(R.id.checkOther)
        //Funcion que se encarga de chequear que sistema operativo se elije, en el xml Agrupe los botones en un radio, depende cual elija, con su id determino que imagen mostrar
        platformRadioGroup.setOnCheckedChangeListener { group, checkedId ->
            val selectedPlatform = findViewById<RadioButton>(checkedId)
            when (selectedPlatform.id) {
                R.id.radioAndroid -> {
                    platformLogo.setImageResource(R.drawable.android_logo)
                }
                R.id.radioIOS -> {
                    platformLogo.setImageResource(R.drawable.ios_logo)
                }
            }
        }

        //Si la caja de otros esta seleccionado desplega el texto visible para que se pueda escribir
        checkOther.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                otherPreferenceInput.visibility = EditText.VISIBLE
            } else {
                otherPreferenceInput.visibility = EditText.GONE
            }
        }
    }
}
