package com.joey.composeapp.navigation

import kotlinx.serialization.Serializable

sealed interface Destinations {

    @Serializable
    data object Main : Destinations

    @Serializable
    data object Mine : Destinations

}