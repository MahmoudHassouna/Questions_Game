package com.example.questionsgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Glide.with(applicationContext).load(R.drawable.quiz).into(quiz)

        var t = Thread(Runnable {
            Thread.sleep(5000)
            var intent = Intent(applicationContext,LoginActivity::class.java)
            startActivity(intent)
            finish()
        })
        t.start()
    }
}