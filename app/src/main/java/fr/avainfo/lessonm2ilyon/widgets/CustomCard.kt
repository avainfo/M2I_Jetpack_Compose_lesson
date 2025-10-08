package fr.avainfo.lessonm2ilyon.widgets

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import fr.avainfo.lessonm2ilyon.utils.Routes
import kotlinx.serialization.Serializable

@Composable
fun CustomCard(
    height: Int = 50,
    width: Int,
    color: Color = Color.Red,
    navController: NavController,
    route: @Serializable Routes,
    content: @Composable (() -> Unit),
) {
    Surface(
        modifier = Modifier
            .height(height.dp)
            .width(width.dp),
        color = color,
        shape = RoundedCornerShape(15.dp),
        onClick = {
            navController.navigate(route = route)
        }
    ) {
        Column {
            content()
        }
    }
}