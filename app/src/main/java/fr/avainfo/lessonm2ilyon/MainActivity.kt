package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			LessonM2ILyonTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Column(modifier = Modifier.padding(innerPadding)) {
						// TODO : Modify Code here
						Surface(
							Modifier
								.size(50.dp),
							color = Color.Red,
							shape = CircleShape,
						) {}
					}
				}
			}
		}
	}
}
