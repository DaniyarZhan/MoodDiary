package com.example.mooddiary

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val Register : Button = findViewById(R.id.register)
        val onAuthorize : Button= findViewById(R.id.authorize)
    }

    /* Метод для перехода в другое окно,
    а именно в окно авторизации (входа)
     */
    fun onActivityAuthorize(view: View) {
        val intent = Intent(this, AuthorizeActivity::class.java)
        startActivity(intent)
    }
}