package com.joey.composeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.joey.composeapp.ui.screens.LiveScreen
import com.joey.composeapp.ui.screens.MainFrame

@Composable
fun NavHostApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Main.route) {
        composable(route = Main.route) {
            MainFrame(
                navigateToLive = { matchId, type ->
                    navController.navigate("${Live.bathPath}/$matchId/$type")
                }
            )
        }
        composable(route = Live.route, arguments = listOf(
            navArgument(Live.argMatchId) {
                type = NavType.LongType
            }, navArgument(Live.argMatchType) {
                type = NavType.IntType
            }
        )) { navBackStackEntry ->
            val matchId = navBackStackEntry.arguments?.getLong(Live.argMatchId) ?: 0L
            val argType = navBackStackEntry.arguments?.getInt(Live.argMatchType) ?: 0
            LiveScreen(matchId, argType)
        }
    }
}
