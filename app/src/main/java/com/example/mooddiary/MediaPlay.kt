package com.example.mooddiary

import android.content.Context
import android.media.MediaPlayer

class MediaPlay {
    lateinit var mediaPlayer : MediaPlayer
    fun Init(context: Context) {
       mediaPlayer  = MediaPlayer.create(context, R.raw.shade)
    }

    @Override
    fun onStart() {
    }
}