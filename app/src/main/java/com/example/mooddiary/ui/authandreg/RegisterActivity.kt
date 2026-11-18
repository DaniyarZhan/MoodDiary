package com.example.mooddiary.ui.authandreg

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddiary.utils.IntentActivities
import com.example.mooddiary.R
import com.example.mooddiary.utils.MediaPlay

/**
 * Активность регистрационного окна
 */
class RegisterActivity : AppCompatActivity() {

    /**
     * Метод для создания активности авторизации
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        setup()
    }

    /**
     * Переопределенный метод для работы с медиаплеером
     */
    override fun onResume() {
        super.onResume()
        MediaPlay.start()
    }

    /**
     * Переопределенный метод для работы с медиаплеером
     */
    override fun onPause() {
        super.onPause()
        MediaPlay.pause()
    }

    /**
     * Метод для инициализации разных полей,
     * кнопок и других объектов и переменных,
     * нужных для работы с этой активностью
     */
    fun setup() {
        val registerButton : Button = findViewById(R.id.register_button)
        val onAuthorizeButton : Button = findViewById(R.id.authorize_button)
        val loginEditText : EditText = findViewById(R.id.login_edit_text)
        val passwordEditText : EditText = findViewById(R.id.password_edit_text)
        val passwordRepeatEditText : EditText = findViewById(R.id.password_repeat_edit_text)
    }
    /**
     * Метод для перехода в другое окно,
     *  а именно в окно авторизации (входа)
     */
    fun onActivityAuthorize(view: View) {
        IntentActivities.intentHelper(this, AuthorizeActivity::class.java)
    }
}