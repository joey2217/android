package com.joey.composeapp.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.media3.common.MediaItem
import androidx.media3.exoplayer.ExoPlayer
import com.joey.composeapp.data.entity.MatchData
import com.joey.composeapp.ui.components.LivePlayer
import com.joey.composeapp.ui.components.MatchColumn
import com.joey.composeapp.ui.viewmodel.MatchLiveViewModel
import com.joey.composeapp.ui.viewmodel.PlayerViewModel

@Composable
fun LiveScreen(
    matchId: Long,
    type: Int,
    matchLiveViewModel: MatchLiveViewModel = viewModel(),
    playerViewModel: PlayerViewModel = viewModel(),
    lifecycleOwner: LifecycleOwner = LocalLifecycleOwner.current,
) {
    val context = LocalContext.current

    LaunchedEffect(
        Unit
    ) {
        matchLiveViewModel.fetchMatchLiveData(matchId, type)
    }

    // 释放 ExoPlayer
    DisposableEffect(Unit) {
        onDispose {
            playerViewModel.releasePlayer()
        }
    }

    val liveDataState by matchLiveViewModel.liveDataState.collectAsStateWithLifecycle()

    Scaffold { padding ->
        Box(modifier = Modifier.padding(padding)) {
            Column {
                liveDataState?.let {
                    playerViewModel.initializePlayer(context)
                    val videoUri = it.globalLiveUrls[0].url
                    playerViewModel.playHlsStream(videoUri)
                    
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