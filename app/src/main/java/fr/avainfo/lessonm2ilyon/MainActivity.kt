package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.avainfo.lessonm2ilyon.screens.FirstScreen
import fr.avainfo.lessonm2ilyon.screens.SecondScreen
import fr.avainfo.lessonm2ilyon.screens.ThirdScreen
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {

    @Serializable
    object FirstPage

    @Serializable
    object SecondPage

    @Serializable
    object ThirdPage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = FirstPage) {
                composable<FirstPage> { FirstScreen(navController) }
                composable<SecondPage> { SecondScreen() }
                composable<ThirdPage> { ThirdScreen() }
            }
        }
    }
}
