package com.example.mooddiary

import android.content.Context
import android.media.MediaPlayer

/**
 * Объект, созданный для работы с музыкальным плеером
 * Можно подключать в разных активностях
 */
object MediaPlay {
    private var player: MediaPlayer? = null

    fun init(context: Context) {
        if (player == null) {
            player = MediaPlayer.create(context.applicationContext, R.raw.shade)?.apply {
                setVolume(0.2f, 0.2f)
                isLooping = true
            }
        }
    }

    fun start() = player?.let {
        if (!it.isPlaying)
            it.start()
    }
    fun pause() = player?.let {
        if (it.isPlaying)
            it.pause()
    }
    fun release() {
        player?.release()
        player = null
    }
}