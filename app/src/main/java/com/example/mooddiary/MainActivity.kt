package com.example.mooddiary

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //методы для обработки кнопок
    fun onActivityRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
    fun onActivityAuthorize(view: View) {
        val intent = Intent(this, AuthorizeActivity::class.java)
        startActivity(intent)
    }
}