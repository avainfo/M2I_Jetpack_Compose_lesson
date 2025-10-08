package fr.avainfo.lessonm2ilyon.utils

import kotlinx.serialization.Serializable

@Serializable
object FirstPage : Routes()

@Serializable
object SecondPage : Routes()

@Serializable
object ThirdPage : Routes()

open class Routes {
}