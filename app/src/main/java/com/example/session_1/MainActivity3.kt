package com.example.session_1                                                                       //Тамбовцева К,  26.03.2024

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {                                                         //Third Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
    val tohomez : TextView = findViewById(R.id.button_home)                                         //Переход на страницу регистрации/авторизации
    tohomez.setOnClick {
        val intent: Intent(this, home::class.java)
        startActivity(intent)
}
    val tohomep : TextView = findViewById(R.id.button_home2)                                        //Переход на страницу регистрации/авторизации
    tohomep.setOnClick {
        val intent: Intent(this, home::class.java)
        startActivity(intent)
    }