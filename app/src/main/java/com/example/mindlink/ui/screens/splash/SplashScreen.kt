package com.example.mindlink.ui.screens.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.mindlink.ui.navigation.Screens
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    navigationController: NavController,
){

    LaunchedEffect(Unit) {
        delay(1000)
        navigationController.navigate(Screens.Main.screen)
    }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Splash"
        )
    }

}