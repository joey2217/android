package com.joey.composeapp.entity

data class SportBaseResponse<T>(
    val code: String,
    val data: T,
    val message: String
)