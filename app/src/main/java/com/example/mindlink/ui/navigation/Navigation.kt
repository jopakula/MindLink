package com.example.mindlink.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mindlink.ui.screens.MainScreen
import com.example.mindlink.ui.screens.SplashScreen

@Composable
fun Navigation(
    navigationController: NavHostController,
    startDestination: String,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navigationController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Screens.Splash.screen) { SplashScreen(navigationController = navigationController)}
        composable(Screens.Main.screen) { MainScreen(navigationController = navigationController) }

    }
}