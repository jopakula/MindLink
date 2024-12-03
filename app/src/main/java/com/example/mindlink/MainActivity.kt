package com.example.mindlink

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.rememberNavController
import com.example.mindlink.ui.navigation.Navigation
import com.example.mindlink.ui.navigation.Screens
import com.example.mindlink.ui.theme.MindLinkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MindLinkTheme {
                val navHostController = rememberNavController()
                Navigation(
                    navigationController = navHostController,
                    startDestination = Screens.Splash.screen
                )
            }
        }
    }
}
