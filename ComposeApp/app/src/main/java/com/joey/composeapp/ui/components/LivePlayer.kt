package com.joey.composeapp.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.viewinterop.AndroidView
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.PlayerView

@Composable
fun LivePlayer(playerController: ExoPlayer) {
    AndroidView(
        factory = { context ->
            PlayerView(context).apply {
                player = playerController
            }
        },
    )
}