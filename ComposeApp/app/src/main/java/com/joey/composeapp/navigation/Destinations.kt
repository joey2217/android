package com.joey.composeapp.navigation

sealed class Destinations(val route: String) {

    data object Home : Destinations("home")

    data object Mine : Destinations("mine")

}