package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import fr.avainfo.lessonm2ilyon.screens.FirstScreen
import fr.avainfo.lessonm2ilyon.screens.SecondScreen
import fr.avainfo.lessonm2ilyon.screens.ThirdScreen
import fr.avainfo.lessonm2ilyon.utils.FirstPage
import fr.avainfo.lessonm2ilyon.utils.SecondPage
import fr.avainfo.lessonm2ilyon.utils.ThirdPage

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(navController, startDestination = FirstPage) {
                composable<FirstPage> { FirstScreen(navController) }
                composable<SecondPage> { backStackEntry ->
                    val secondPage: SecondPage = backStackEntry.toRoute()
                    println(secondPage.toString())
                    SecondScreen(secondPage = secondPage)
                }
                composable<ThirdPage> { ThirdScreen() }
            }
        }
    }
}
