package com.example.examen_practica

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class OnboardingActivity : AppCompatActivity() {
    private var constraintLayout: ConstraintLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        constraintLayout = findViewById<ConstraintLayout>(androidx.core.R.id.activity_onboarding)
        val textView1 = findViewById<TextView>(R.id.textView1)
        textView1.setOnClickListener { showSnackbar("Funcionalidad próximamente disponible") }
        val textView2 = findViewById<TextView>(R.id.textView2)
        textView2.setOnClickListener { showSnackbar("Funcionalidad estará próximamente disponible") }
    }

    private fun showSnackbar(message: String) {
        Snackbar.make(constraintLayout!!, message, Snackbar.LENGTH_LONG).show()
    }
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}