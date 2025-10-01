package fr.avainfo.lessonm2ilyon.widgets

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import fr.avainfo.lessonm2ilyon.widgets.styles.MainBorder

@Composable
fun TopBar() {
	IconButton(
		onClick = { },
		modifier = Modifier.border(
			MainBorder(),
			shape = CircleShape
		)
	) {
		Icon(
			imageVector = Icons.AutoMirrored.Filled.ArrowBack,
			contentDescription = "Back Icon Button"
		)
	}
}