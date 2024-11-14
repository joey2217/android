package com.joey.composeapp.entity

data class PageData(
    val total: Long,
    val totalPage: Long,
    val notopList: List<MatchData>,
    val dataList: List<MatchData>,
    val topList: List<MatchData>,
    val liveType: Long,
    val starttime: String,
    val currentPage: Long,
    val token: String
)

data class MatchData(
    val matchtimeEn: String,
    val ouzhiJishi: String,
    val type: Long,
    val score: String,
    val zdLevel: String,
    val statusUp: Long,
    val videoURL: String,
    val id: Long,
    val ateamLogo: String,
    val hteamName: String,
    val yazhiJishi: String,
    val level: Long,
    val hteamID: Long,
    val daxiaoJishi: String,
    val zoneIDString: String,
    val clogo: String,
    val liveCartoonURL: List<Any?>,
    val awayScoreXiaojie: List<Long>? = null,
    val mirrorLiveUrls: List<LiveURL>,
    val curRound: Long,
    val liveUrls: List<LiveURL>,
    val ateamID: Long,
    val matchtime: String,
    val statusUpName: String,
    val name: String,
    val ateamName: String,
    val time: String,
    val hteamLogo: String,
    val cid: Long,
    val status: Long,
    val homeScoreXiaojie: List<Long>? = null,
    val globalLiveUrls: List<LiveURL>,
    val hteamRed: Long? = null,
    val jiaoqiu: String? = null,
    val hteamYellow: Long? = null,
    val ateamRed: Long? = null,
    val banchang: String? = null,
    val ateamYellow: Long? = null
)

data class LiveURL(
    val roomNum: Long,
    val streamID: String? = null,
    val name: String,
    val index: Long,
    val liveUserName: String? = null,
    val id: String? = null,
    val url: String,
    val seq: Long,
    val status: Long
)

