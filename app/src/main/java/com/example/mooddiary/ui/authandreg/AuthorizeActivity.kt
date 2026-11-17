package com.example.mooddiary.ui.authandreg

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddiary.IntentActivity
import com.example.mooddiary.R

class AuthorizeActivity : AppCompatActivity() {
    /**
     * Метод для создания активности авторизации
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorize)
        setup()
    }

    /**
     * Метод для инициализации разных полей,
     * кнопок и других объектов и переменных,
     * нужных для работы с этой активностью
     */
    fun setup() {
        val onRegisterButton : Button = findViewById(R.id.register_button)
        val authorizeButton : Button = findViewById(R.id.authorize_button)
        val loginEditText : EditText = findViewById(R.id.login_edit_text)
        val passwordEditText : EditText = findViewById(R.id.password_edit_text)
    }

    /**
     *  Метод для перехода в другое окно,
     *  а именно в окно регистрации
     */
    fun onActivityRegister(view: View) {
        IntentActivity.intentHelper(this, RegisterActivity::class.java)
    }
}