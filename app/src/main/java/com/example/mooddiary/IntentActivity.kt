package com.example.mooddiary

import android.app.Activity
import android.content.Context
import android.content.Intent

/**
 * Обьект, созданный для обработки Intent
 * @param context для передачи, из какой активности запускать
 * @param activityClass для передачи, в какую активность переходить
 */
object IntentActivity {
    //метод для обработки Intent
    fun intentHelper(context: Context, activityClass: Class<out Activity>) {
        val intent = Intent(context, activityClass)
        context.startActivity(intent)
    }

}