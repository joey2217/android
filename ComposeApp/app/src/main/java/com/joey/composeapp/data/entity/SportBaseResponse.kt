package com.joey.composeapp.data.entity

abstract class SportBaseResponse<T> {
    val code: String = "0"
    val message: String = "ok"
    abstract val data: T
}
