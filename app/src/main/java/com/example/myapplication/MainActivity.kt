package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var enterBtn: Button
    private lateinit var loginET: EditText
    private lateinit var passwordET: EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)
        enterBtn = findViewById(R.id.enterButton)
        loginET = findViewById(R.id.login_ET)
        passwordET = findViewById(R.id.passET)
        enterBtn.setOnClickListener {
            if (loginET.text.toString() != "" && passwordET.text.toString() != "") {
                val intent: Intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Введите логин и пароль", Toast.LENGTH_SHORT).show()
            }
        }
    }
}