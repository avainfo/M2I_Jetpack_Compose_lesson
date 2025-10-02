package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
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
			LessonM2ILyonTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Column(modifier = Modifier.padding(innerPadding)) {
						// TODO : Modify Code here
						CustomCard(height = 75, width = 150, color = Color.Red) {
							CustomCard(height = 70, width = 145, color = Color.Blue) {
								CustomCard(height = 65, width = 140, color = Color.White) {
									CustomCard(height = 60, width = 135, color = Color.Green) {
										Text("Coucou")
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
