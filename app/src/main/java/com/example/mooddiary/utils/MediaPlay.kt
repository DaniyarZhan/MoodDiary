package com.example.mooddiary.utils

import android.content.Context
import android.media.MediaPlayer
import com.example.mooddiary.R

/**
 * Объект, созданный для работы с музыкальным плеером
 * Можно подключать в разных активностях
 */
object MediaPlay {
    private var player: MediaPlayer? = null

    /**
     * Метод для инициализации медиаплеера
     */
    fun init(context: Context) {
        if (player == null) {
            player = MediaPlayer.create(context.applicationContext, R.raw.shade)?.apply {
                setVolume(0.2f, 0.2f)
                isLooping = true
            }
        }
    }

    /**
     * Метод для включения медиаплеера
     */
    fun start() = player?.let {
        if (!it.isPlaying)
            it.start()
    }

    /**
     * Метод для приостановления медиаплеера
     */
    fun pause() = player?.let {
        if (it.isPlaying)
            it.pause()
    }

    /**
     * Метод, позволяющий отключить медиаплеер при закрытии программы
     */
    fun release() {
        player?.release()
        player = null
    }
}