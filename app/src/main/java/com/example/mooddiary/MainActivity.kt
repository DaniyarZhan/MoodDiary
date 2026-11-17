package com.example.mooddiary

import android.app.Activity
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mooddiary.ui.authandreg.AuthorizeActivity
import com.example.mooddiary.ui.authandreg.RegisterActivity

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
     * Метод для уничтожения медиаплеера, при отключении приложении
     */
    override fun onDestroy() {
        super.onDestroy()
        if (isFinishing)
            MediaPlay.release()
    }

    //методы для обработки кнопок
    fun onActivityRegister(view: View) {
        IntentActivity.intentHelper(this,RegisterActivity::class.java)
    }
    fun onActivityAuthorize(view: View) {
        IntentActivity.intentHelper(this,AuthorizeActivity::class.java)
    }
}