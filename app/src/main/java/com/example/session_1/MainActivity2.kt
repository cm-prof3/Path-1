package com.example.session_1                                                                       //Тамбовцева К,  26.03.2024

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {                                                         //Second Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val to3 : TextView = findViewById(R.id.button_to_3)                                         //переход на MainActivity3
        to3.setOnClick {
            val intent: Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val tohome1 : TextView = findViewById(R.id.button_skip)                                     //Переход на страницу регистрации/авторизации
        tohome1.setOnClick {
            val intent: Intent(this, home::class.java)
            startActivity(intent)
    }
}