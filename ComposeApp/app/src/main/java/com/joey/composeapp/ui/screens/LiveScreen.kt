package com.joey.composeapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.joey.composeapp.data.entity.MatchData
import com.joey.composeapp.ui.components.LivePlayer
import com.joey.composeapp.ui.components.MatchColumn
import com.joey.composeapp.ui.viewmodel.MatchLiveViewModel

@Composable
fun LiveScreen(matchId: Long, type: Int, matchLiveViewModel: MatchLiveViewModel = viewModel()) {

    LaunchedEffect(
        true
    ) {
        matchLiveViewModel.fetchMatchLiveData(matchId, type)
    }

    val liveDataState by matchLiveViewModel.liveDataState.collectAsStateWithLifecycle()

    Scaffold { padding ->
        Box(modifier = Modifier.padding(padding)) {
            Column {
                liveDataState?.let {
                    val player = ExoPlayer.Builder(LocalContext.current).build()
                    val videoUri = it.globalLiveUrls[0].url
                    val mediaItem = MediaItem.fromUri(videoUri)
                    player.setMediaItem(mediaItem)
                    // Prepare the player.
                    player.prepare()
                    // Start the playback.
                    player.play()

                    LivePlayer(player)
                    LiveSection(it)
                }
            }
        }
    }
}

@Composable
fun LiveSection(liveMatchData: MatchData) {
    Column {
        MatchColumn(matchData = liveMatchData, navigateToLive = null)
    }
}