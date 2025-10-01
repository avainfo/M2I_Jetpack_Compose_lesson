package fr.avainfo.lessonm2ilyon.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
            verticalAlignment = Alignment.Companion.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "test",
                Modifier.Companion
                    .padding(start = 24.dp)
                    .height(25.dp)
                    .width(25.dp),
                tint = Color(0xFFFFFFFF)
            )
            Box(modifier.width(12.dp))
            Text("Click me!", Modifier.Companion.padding(end = 24.dp))
        }
    }
}