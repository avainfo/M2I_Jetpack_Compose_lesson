package fr.avainfo.lessonm2ilyon.services

import fr.avainfo.lessonm2ilyon.models.Todo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PostsService {
    @GET("posts/{postId}")
    fun getTodo(@Path("postId") taskId: Int): Call<Todo?>?
}