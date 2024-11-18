package com.joey.composeapp.data.entity

import com.squareup.moshi.Json

data class LiveDataResponse(
    val data: MatchLiveData
) : SportBaseResponse()

data class MatchLiveData(
    @Json(name = "hascount") val hasCount: Int,
    @Json(name = "haslineup") val hasLineUp: Int,
    val likeMatchList: List<MatchData>,
    @Json(name = "live_type_onoff") val liveTypeOnOff: String,
    @Json(name = "matchinfo") val matchInfo: MatchData,
    @Json(name = "online_num") val onlineNum: Int,
    val token: String
)
