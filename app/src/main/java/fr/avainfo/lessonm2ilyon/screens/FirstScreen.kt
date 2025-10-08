package fr.avainfo.lessonm2ilyon.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.navigation.NavController
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme
import fr.avainfo.lessonm2ilyon.utils.FirstPage
import fr.avainfo.lessonm2ilyon.utils.SecondPage
import fr.avainfo.lessonm2ilyon.utils.ThirdPage
import fr.avainfo.lessonm2ilyon.widgets.CustomCard

@Composable
fun FirstScreen(navController: NavController) {
    val configuration = LocalConfiguration.current

    val screenWidth = configuration.screenWidthDp
    LessonM2ILyonTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Row(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                // Todo : Search shortcut to modify multiple ctrl + w
                CustomCard(
                    height = 75,
                    width = screenWidth / 4,
                    color = Color.Blue,
                    navController = navController,
                    FirstPage,
                ) {
                    Text("Page 1")
                }
                CustomCard(
                    height = 75,
                    width = screenWidth / 4,
                    color = Color.White,
                    navController = navController,
                    SecondPage,
                ) {
                    Text("Page 2")
                }
                CustomCard(
                    height = 75,
                    width = screenWidth / 4,
                    color = Color.Red,
                    navController = navController,
                    ThirdPage,
                ) {
                    Text("Page 3")
                }
            }
        }
    }
}