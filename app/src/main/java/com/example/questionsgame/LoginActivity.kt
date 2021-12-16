package com.example.questionsgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        var create= findViewById<TextView>(R.id.create_account)
        var forget = findViewById<TextView>(R.id.forget_password)
        var login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            var intent = Intent(applicationContext, HomeActivity::class.java)
            startActivity(intent)
        }
        forget.setOnClickListener {
            var intent = Intent(applicationContext, ForgetPassWordActivity::class.java)
            startActivity(intent)
        }
        create.setOnClickListener {
            var intent = Intent(applicationContext, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}