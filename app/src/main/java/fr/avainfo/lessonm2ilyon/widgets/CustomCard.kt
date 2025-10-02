package fr.avainfo.lessonm2ilyon.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomCard(
	height: Int = 50, width: Int, color: Color = Color.Red, brush: Brush?
) {
	Surface(
		modifier = Modifier
			.height(height.dp)
			.width(width.dp),
		color = color,
		shape = RoundedCornerShape(15.dp)
	) {
		Box(modifier = brush?.let {
			Modifier.background(it)
		} ?: Modifier)
	}
}