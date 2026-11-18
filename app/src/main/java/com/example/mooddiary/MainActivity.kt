package com.example.mooddiary

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddiary.ui.authandreg.AuthorizeActivity
import com.example.mooddiary.ui.authandreg.RegisterActivity
import com.example.mooddiary.utils.IntentActivities
import com.example.mooddiary.utils.MediaPlay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupMedia()
    }

    /**
     * Метод для включения медиаплеера
     */
    private fun setupMedia() {
        MediaPlay.init(this)
        MediaPlay.start()
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
     * Метод для уничтожения медиаплеера, при отключении приложении
     */
    override fun onDestroy() {
        super.onDestroy()
        if (isFinishing)
            MediaPlay.release()
    }

    /**
     * Метод для перехода в активность регистрации
     */
    fun onActivityRegister(view: View) {
        IntentActivities.intentHelper(this,RegisterActivity::class.java)
    }

    /**
     * Метод для перехода в активность авторизации
     */
    fun onActivityAuthorize(view: View) {
        IntentActivities.intentHelper(this,AuthorizeActivity::class.java)
    }
}