package com.joey.composeapp.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.joey.composeapp.data.entity.MatchPageData
import com.joey.composeapp.data.service.SportService

class HomeViewModel : ViewModel() {
    private val service = SportService.instance()

    var matchPageUiState by mutableStateOf(MatchPageData())
        private set

    suspend fun fetchHotPageData(page: Int = 1) {
        val res = service.fetchHotPageData(page)
        val data = res.data
        matchPageUiState = matchPageUiState.copy(
            total = data.total,
            totalPage = data.totalPage,
            items = data.dataList,
            hots = data.topList,
            liveType = data.liveType,
            starttime = data.starttime,
            currentPage = data.currentPage
        )
    }
}