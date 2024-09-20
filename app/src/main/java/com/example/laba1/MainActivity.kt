package com.example.laba1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var age: EditText
    private lateinit var check: Button
    private lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        age = findViewById(R.id.editTextText)
        check = findViewById(R.id.button)
        result = findViewById(R.id.textView2)



        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
    }

    fun checkAge(view: View) {
        val ageRes = age.text.toString().toIntOrNull()
        result.text = when {
            ageRes == null -> "Введите возраст!"
            ageRes <= 20 -> "Вы слишком молоды!"
            ageRes == 30 || ageRes == 40 || ageRes == 50 || ageRes == 60 -> "Поздравляем с повышением!"
            ageRes == 65 -> "Преподносим вам золотые часы!"
            ageRes > 65 -> "Вы слишком стар!"

            else -> {"Продолжайте накапливать опыт!"}
        }
    }

}