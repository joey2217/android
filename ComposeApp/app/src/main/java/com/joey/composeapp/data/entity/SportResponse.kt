package com.joey.composeapp.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

data class MatchPageDataResponse(
    val data: PageData
) : SportBaseResponse()

@JsonClass(generateAdapter = true)
data class PageData(
    val total: Int,
    val totalPage: Int,
    val notopList: List<MatchData>,
    val dataList: List<MatchData>,
    val topList: List<MatchData>,
    @Json(name = "live_type") val liveType: Int,
    val starttime: String,
    val currentPage: Int,
    val token: String
)

@JsonClass(generateAdapter = true)
data class MatchData(
    @Json(name = "ateam_id") val awayTeamId: Int,
    @Json(name = "ateam_logo") val awayTeamLogo: String,
    @Json(name = "ateam_name") val awayTeamName: String,
    @Json(name = "ateam_red") val awayTeamRed: Int? = null,
    @Json(name = "away_score_xiaojie") val awayScores: List<Int>? = null,

    val cid: Int,
    val clogo: String,
    @Json(name = "cur_round") val curRound: Int,
    @Json(name = "daxiao_jishi") val odds: String,
    @Json(name = "global_live_urls") val globalLiveUrls: List<LiveURL>,

    @Json(name = "home_score_xiaojie") val homeScores: List<Int>? = null,
    @Json(name = "hteam_id") val homeTeamId: Int,
    @Json(name = "hteam_logo") val homeTeamLogo: String,
    @Json(name = "hteam_red") val homeTeamRed: Int? = null,
    @Json(name = "hteam_yellow") val hteamYellow: Int? = null,
    @Json(name = "hteam_name") val homeTeamName: String,

    val id: Long,
    @Json(name = "is_zd") val isZd: String,
    val level: Int,
    @Json(name = "live_cartoon_url") val liveCartoonUrls: List<LiveURL>? = null,
    @Json(name = "live_urls") val liveUrls: List<LiveURL>? = null,
    @Json(name = "matchtime") val matchTime: String,
    @Json(name = "matchtime_en") val matchTimeEn: String,
    @Json(name = "mirror_live_urls") val mirrorLiveUrls: List<LiveURL>,
    val name: String,
    @Json(name = "ouzhi_jishi") val ouZhi: String,
    val score: String,
    val status: Int,
    @Json(name = "status_up") val statusUp: Int,
    @Json(name = "status_up_name") val statusUpName: String,
    val time: String,
    val type: Int,
    @Json(name = "video_url") val videoUrl: String,
    @Json(name = "yazhi_jishi") val yaZhi: String,
    @Json(name = "zd_level") val zdLevel: String,
    @Json(name = "zoneIdString") val zoneIdString: String,
    @Json(name = "jiaoqiu") val cornerKick: String? = null,
    @Json(name = "banchang") val halfCourt: String? = null,
)


@JsonClass(generateAdapter = true)
data class LiveURL(
    val id: String? = null,
    val index: Int,
    @Json(name = "live_user_name") val liveUserName: String? = null,
    val name: String,
    @Json(name = "room_num") val roomNum: Int,
    val seq: Int? = null,
    val url: String,
    val status: Int,
    @Json(name = "streamId") val streamID: String? = null,
)

