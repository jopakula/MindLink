package com.example.mindlink.ui.screens.lesons

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mindlink.ui.common.Strings

@Composable
fun Lesson1Screen(
    navigationController: NavController,
) {
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
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = Strings.GINGER_CAT_INFO,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp),
            )
            Text(
                text = Strings.WHITE_CAT_INFO,
                fontSize = 16.sp,
                modifier = Modifier.padding(8.dp),
            )
        }

    }
}

@Composable
@Preview
private fun Lesson1ScreenPreview(){
    Lesson1Screen(navigationController = rememberNavController())
}