package com.joey.composeapp

import com.joey.composeapp.data.common.SportApi
import com.joey.composeapp.data.service.SportService
import kotlinx.coroutines.*
import org.junit.Test

class HttpTest {
    private val service = SportService.instance()

    @Test
    fun test (): Unit = runBlocking {
        launch {
            val result = service.fetchHotPageData()
            println(result)
        }
    }
}