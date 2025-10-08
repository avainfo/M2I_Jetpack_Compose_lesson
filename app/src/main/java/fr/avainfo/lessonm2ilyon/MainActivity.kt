package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.avainfo.lessonm2ilyon.screens.FirstScreen
import fr.avainfo.lessonm2ilyon.screens.SecondScreen
import fr.avainfo.lessonm2ilyon.screens.ThirdScreen
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme
import fr.avainfo.lessonm2ilyon.widgets.CustomCard
import kotlinx.serialization.Serializable

val cardGradient = object : ShaderBrush() {
    override fun createShader(size: Size): Shader {
        val biggerDimension = maxOf(size.width, size.height)
        return RadialGradientShader(
            colors = listOf(Color(0x40FFFFFF), Color(0x70000000)),
            center = Offset(size.width / 2F, 0.05F),
            radius = biggerDimension / 2f
        )
    }
}

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
                composable<FirstPage> { FirstScreen() }
                composable<SecondPage> { SecondScreen() }
                composable<ThirdPage> { ThirdScreen() }
            }
        }
    }
}
