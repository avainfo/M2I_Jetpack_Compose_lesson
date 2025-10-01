package fr.avainfo.lessonm2ilyon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.avainfo.lessonm2ilyon.ui.theme.LessonM2ILyonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LessonM2ILyonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CustomIconButton(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CustomIconButton(modifier: Modifier = Modifier) {
    Surface(
        onClick = {
            println("Coucou")
        },
        color = MaterialTheme.colorScheme.primary,
        shape = RoundedCornerShape(500.dp),
        modifier = modifier.height(50.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "test",
                Modifier
                    .padding(start = 24.dp)
                    .height(25.dp)
                    .width(25.dp),
                tint = Color(0xFFFFFFFF)
            )
            Box(modifier.width(12.dp))
            Text("Click me!", Modifier.padding(end = 24.dp))
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