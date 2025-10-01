package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme
import fr.avainfo.lessonm2ilyon.widgets.Card
import fr.avainfo.lessonm2ilyon.widgets.CustomIconButton
import fr.avainfo.lessonm2ilyon.widgets.TopBar
import fr.avainfo.lessonm2ilyon.widgets.styles.Title

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			LessonM2ILyonTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Column(
						modifier = Modifier
							.padding(innerPadding)
							.padding(all = 24.dp)
					) {
						TopBar()
						Title(
							"Checkout",
							Modifier
								.padding(top = 24.dp)
						)
						Card(
							modifier = Modifier
								.size(250.dp)
								.padding(top = 12.dp)
						) {
						}
					}
				}
			}
		}
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	LessonM2ILyonTheme {
		CustomIconButton()
	}
}