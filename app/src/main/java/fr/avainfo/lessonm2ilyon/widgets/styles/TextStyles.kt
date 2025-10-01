package fr.avainfo.lessonm2ilyon.widgets.styles

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Title(value: String, modifier: Modifier = Modifier) {
	Text(
		value,
		modifier = modifier,
		fontSize = 30.sp,
	)
}