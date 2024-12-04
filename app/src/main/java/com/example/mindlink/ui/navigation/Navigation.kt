package com.example.mindlink.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mindlink.ui.screens.lesons.Lesson1Screen
import com.example.mindlink.ui.screens.main.MainScreen
import com.example.mindlink.ui.screens.splash.SplashScreen

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
        composable(Screens.Splash.screen) { SplashScreen(navigationController = navigationController) }
        composable(Screens.Main.screen) { MainScreen(navigationController = navigationController) }
        composable(Screens.Lesson1.screen) { Lesson1Screen(navigationController = navigationController) }

    }
}