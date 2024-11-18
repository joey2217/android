package com.joey.composeapp.data.service

import com.joey.composeapp.data.common.SportApi
import com.joey.composeapp.data.entity.LiveDataResponse
import com.joey.composeapp.data.entity.MatchPageDataResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface SportService {

    @GET("match/list/new")
    suspend fun fetchHotPageData(
        @Query("pn") page: Int = 1,
        @Query("type") type: Int = 1,
        @QueryMap params: Map<String, String> = mapOf(
            "isfanye" to "1",
            "cid" to "0",
            "ishot" to "1",
            "ps" to "20",
            "langtype" to "zh",
            "pid" to "1",
            "zoneId" to "Asia/Shanghai",
        )
    ): MatchPageDataResponse

    @GET("match/detail")
    suspend fun fetchMatchDetailData(
        @Query("mid") matchId: Long,
        @Query("type") type: Int = 1,
        @QueryMap params: Map<String, String> = mapOf(
            "isnew" to "1",
            "pid" to "0",
            "langtype" to "zh",
            "test" to "1",
            "zoneId" to "Asia/Shanghai",
        )
    ): LiveDataResponse

    companion object {
        fun instance(): SportService {
            return SportApi.createService(SportService::class.java)
        }
    }
}