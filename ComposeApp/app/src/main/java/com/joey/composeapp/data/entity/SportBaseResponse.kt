package com.joey.composeapp.data.entity

data class SportBaseResponse<T>(
    val code: String,
    val data: T,
    val message: String
)