package fr.avainfo.lessonm2ilyon.widgets

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import fr.avainfo.lessonm2ilyon.widgets.styles.MainBorder

@Composable
fun Card(
	modifier: Modifier = Modifier,
	content: @Composable () -> Unit
) {
	Surface(
		modifier = modifier,
		content = content,
		shape = RoundedCornerShape(size = 15.dp),
		border = MainBorder()
	)
}