package com.joey.composeapp.service

import com.joey.composeapp.common.SportApi
import com.joey.composeapp.entity.PageData
import com.joey.composeapp.entity.SportBaseResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface SportService {

    @GET("/match/list/new")
    suspend fun fetchHotPageData(
        @Query("pn") page: Int = 1,
        @Query("type") type: Int = 1,
        @QueryMap params: Map<String, Any> = mapOf(
            "isfanye" to 1,
            "cid" to 0,
            "ishot" to 1,
            "ps" to 20,
            "langtype" to "zh",
            "pid" to 1,
            "zoneId" to "Asia/Shanghai",
        )
    ): SportBaseResponse<PageData>


    companion object {
        fun instance(): SportService {
            return SportApi.createService(SportService::class.java)
        }
    }
}