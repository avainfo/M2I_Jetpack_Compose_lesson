package fr.avainfo.lessonm2ilyon.services

import fr.avainfo.lessonm2ilyon.models.Todo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface TodoService {
    @GET("todos/{taskId}")
    fun getTodo(@Path("taskId") taskId: Int): Call<Todo?>?
    @POST("todos")
    fun getAvailableTodoID(): Call<Map<String, Int>>?
}