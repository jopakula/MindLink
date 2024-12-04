package com.example.mindlink.ui.screens.lesons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mindlink.ui.common.Strings
import com.example.mindlink.uikit.MindBottomSheet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Lesson1Screen(
    navigationController: NavController,
) {

    var showBottomSheet by rememberSaveable { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .padding(16.dp),
            text = Strings.LESSON_1_TITLE,
            fontSize = 32.sp,
        )

        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Text(
                text = Strings.GRAY_CAT_INFO,
                fontSize = 18.sp,
                modifier = Modifier.padding(8.dp),
            )
            Button(
                onClick = { showBottomSheet = true },
            ) {
                Text(text = "Mind")
            }
            Text(
                text = Strings.GINGER_CAT_INFO,
                fontSize = 18.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = Strings.WHITE_CAT_INFO,
                fontSize = 18.sp,
                modifier = Modifier.padding(8.dp),
            )
        }
        if (showBottomSheet) {
            MindBottomSheet(
                id = 2,
                onDismiss = { showBottomSheet = false }
            )
        }

    }
}

@Composable
@Preview
private fun Lesson1ScreenPreview(){
    Lesson1Screen(navigationController = rememberNavController())
}