package fr.avainfo.lessonm2ilyon.models

data class Todo(
    val userId: Int = -1,
    val id: Int = -1,
    val title: String = "",
    val completed: Boolean = false,
)
