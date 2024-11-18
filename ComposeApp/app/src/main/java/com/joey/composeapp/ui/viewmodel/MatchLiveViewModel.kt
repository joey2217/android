package com.joey.composeapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.joey.composeapp.data.entity.MatchData
import com.joey.composeapp.data.service.SportService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MatchLiveViewModel : ViewModel() {

    private val service = SportService.instance()

    private val _liveDataState = MutableStateFlow<MatchData?>(null)

    val liveDataState = _liveDataState.asStateFlow()

    suspend fun fetchMatchLiveData(matchId: Long, type: Int) {
        val response = service.fetchMatchDetailData(matchId, type)
        _liveDataState.update {
            response.data.matchInfo
        }
    }

}