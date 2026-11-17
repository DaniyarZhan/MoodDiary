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
        Init()
    }

    private fun Init() {
        var mediaPlayer : MediaPlayer?
    }

    //методы для обработки кнопок
    fun onActivityRegister(view: View) {
        IntentActivity(RegisterActivity::class.java)
    }
    fun onActivityAuthorize(view: View) {
        IntentActivity(AuthorizeActivity::class.java)
    }
    //методы для обработки Intent
    private fun IntentActivity(activityClass: Class<out Activity>) {
        val intent = Intent(this, activityClass)
        startActivity(intent)
    }
}