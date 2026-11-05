package com.example.mooddiary

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AuthorizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorize)
        val onRegister : Button = findViewById(R.id.register)
        val Authorize : Button= findViewById(R.id.authorize)
    }
    /* Метод для перехода в другое окно,
    а именно в окно регистрации
     */
    fun onActivityRegister(view: View) {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}