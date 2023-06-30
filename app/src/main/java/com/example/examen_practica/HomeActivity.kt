package com.example.examen_practica

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val button1 = findViewById<ImageButton>(R.id.button_1)
        button1.setOnClickListener {
            // Acción para el botón 1
        }
        val button2 = findViewById<ImageButton>(R.id.button_2)
        button2.setOnClickListener {
            // Acción para el botón 2
        }
        val button3 = findViewById<ImageButton>(R.id.button_3)
        button3.setOnClickListener {
            // Acción para el botón 3
        }
        val button4 = findViewById<ImageButton>(R.id.button_4)
        button4.setOnClickListener {
            // Acción para el botón 4
        }
    }
}
}