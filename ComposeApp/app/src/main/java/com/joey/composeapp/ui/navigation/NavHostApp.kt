package com.joey.composeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joey.composeapp.ui.screens.MainFrame
import com.joey.composeapp.ui.screens.MineScreen


@Composable
fun NavHostApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = Destinations.Main) {
        composable<Destinations.Main> { MainFrame() }
        composable<Destinations.Mine> { MineScreen() }
    }
}
