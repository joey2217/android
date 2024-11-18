package com.joey.composeapp.ui.navigation


interface Destination {
    val route: String
}

object Main : Destination {
    override val route = "main"
}

object Live : Destination {
    const val argMatchId = "matchId"
    const val argMatchType = "type"
    const val bathPath = "live"
    override val route = "$bathPath/{$argMatchId}/{$argMatchType}"
}
