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
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme
import fr.avainfo.lessonm2ilyon.widgets.CustomCard

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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
                        CustomCard(height = 75, width = screenWidth / 4, color = Color.Blue) {
                            Text("Page 1")
                        }
                        CustomCard(height = 75, width = screenWidth / 4, color = Color.White) {
                            Text("Page 2")
                        }
                        CustomCard(height = 75, width = screenWidth / 4, color = Color.Red) {
                            Text("Page 3")
                        }
                    }
                }
            }
        }
    }
}
