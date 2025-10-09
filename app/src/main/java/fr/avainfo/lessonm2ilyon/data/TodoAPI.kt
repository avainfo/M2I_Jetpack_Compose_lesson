package fr.avainfo.lessonm2ilyon.data

import com.google.gson.Gson
import fr.avainfo.lessonm2ilyon.models.Todo
import fr.avainfo.lessonm2ilyon.services.PostsService
import fr.avainfo.lessonm2ilyon.services.TodoService
import okhttp3.OkHttpClient
import okhttp3.Request
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TodoAPI {
    fun <T> makeRetrofitRequest(url: String, service: Class<T>): T {
        val retrofit: Retrofit =
            Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val serviceCreated: T = retrofit.create(service)
        return serviceCreated
    }

    fun makeOkHttpRequest(url: String): Request {
        return Request.Builder().url(url)
            .build()
    }

    fun getTodoV1(id: Int): Todo {
        val todoService: TodoService = makeRetrofitRequest<TodoService>(
            "https://jsonplaceholder.typicode.com",
            TodoService::class.java
        )

        val todoRes: Response<Todo?>? = todoService.getTodo(id)?.execute()
        val todoRes2: Response<Map<String, Int>>? = todoService.getAvailableTodoID()?.execute()

        if (todoRes == null || todoRes.body() == null)
            return Todo()

        if (todoRes2 == null)
            return Todo()

        println("Id of available todo : " + todoRes2.body()?.get("id"))
        return todoRes.body() as Todo
    }

    fun getTodoV2(id: Int): Todo {
        val client: OkHttpClient = OkHttpClient.Builder().build()
        val request = makeOkHttpRequest("https://jsonplaceholder.typicode.com/todos/$id");
        val response = client.newCall(request).execute()
        if (response.body == null) return Todo()
        val body: String = response.body!!.string()
        val todo: Todo = Gson().fromJson(body, Todo::class.java)
        return todo
    }
}