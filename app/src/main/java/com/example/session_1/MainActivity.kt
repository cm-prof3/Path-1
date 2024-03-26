package com.example.session_1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {                                                          //First Activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
    }
    val to2 :TextView = findViewById(R.id.button_to_2)                                              //переход на MainActivity2
           to2.setOnClick {
         val intent: Intent(this, MainActivity2::class.java)
         startActivity(intent)
        }

        val tohome :TextView = findViewById(R.id.button_skip)                                       //Переход на страницу регистрации/авторизации
        tohome.setOnClick {
        val intent: Intent(this, home::class.java)
        startActivity(intent)
    }
}