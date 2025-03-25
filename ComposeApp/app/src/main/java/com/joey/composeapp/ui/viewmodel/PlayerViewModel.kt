package com.joey.composeapp.ui.viewmodel

import android.content.Context
import android.net.Uri
import androidx.lifecycle.ViewModel
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer


class PlayerViewModel : ViewModel() {

    private var exoPlayer: ExoPlayer? = null

    fun initializePlayer(context: Context) {
        exoPlayer = ExoPlayer.Builder(context).build()
    }

    fun playHlsStream(url: String) {
        val mediaItem = MediaItem.fromUri(Uri.parse(url))
        exoPlayer?.setMediaItem(mediaItem)
        exoPlayer?.prepare()
        exoPlayer?.play()
    }

    fun releasePlayer() {
        exoPlayer?.release()
        exoPlayer = null
    }

    override fun onCleared() {
        super.onCleared()
        releasePlayer()
    }
}