package fr.avainfo.lessonm2ilyon.utils

import kotlinx.serialization.Serializable

@Serializable
object FirstPage : Routes()

@Serializable
data class SecondPage(val counter: Int = 0) : Routes()

@Serializable
object ThirdPage : Routes()

open class Routes {
}