package com.example.mindlink.ui.navigation

sealed class Screens(
    val screen: String
) {

    data object Main: Screens("main")
    data object Splash: Screens("splash")
}