package com.joey.composeapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.joey.composeapp.data.entity.MatchPageData
import com.joey.composeapp.data.service.SportService
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {
    private val service = SportService.instance()

    private val _matchPageState = MutableStateFlow(MatchPageData())

    val matchPageState = _matchPageState.asStateFlow()

    suspend fun fetchHotPageData(page: Int = 1) {
        val res = service.fetchHotPageData(page)
        val data = res.data
        _matchPageState.value = MatchPageData(
            total = data.total,
            totalPage = data.totalPage,
            items = data.dataList,
            hots = data.notopList,
            liveType = data.liveType,
            starttime = data.starttime,
            currentPage = data.currentPage
        )
    }
}