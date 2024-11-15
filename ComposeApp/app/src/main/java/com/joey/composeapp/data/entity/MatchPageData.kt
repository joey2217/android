package com.joey.composeapp.data.entity

data class MatchPageData(
    val total: Int = 0,
    val totalPage: Int = 0,
    val items: List<MatchData> = listOf(),
    val hots: List<MatchData> = listOf(),
    val liveType: Int = 0,
    val starttime: String = "",
    val currentPage: Int = 0
)
