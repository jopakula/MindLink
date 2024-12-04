package com.example.mindlink.ui.screens.main

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mindlink.ui.navigation.Screens
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun MainScreen(
    navigationController: NavController,
){
val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .background(Color.Cyan),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            Button(
                onClick = {
                    Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                    CoroutineScope(Dispatchers.Main).launch{
                        delay(1000)
                        navigationController.navigate(Screens.Lesson1.screen)
                    }


                }
            ) {
                Text(text = "Lesson # 1")
            }
            Button(
                onClick = {},
                enabled = false,
                ) {
                Text(text = "Lesson # 2")
            }
            Button(
                onClick = {},
                enabled = false,
            ) {
                Text(text = "Lesson # 3")
            }
            Button(
                onClick = {},
                enabled = false,
            ) {
                Text(text = "Lesson # 4")
            }
            Button(
                onClick = {},
                enabled = false,
            ) {
                Text(text = "Lesson # 5")
            }

        }
    }

}

