package fr.avainfo.lessonm2ilyon.data

import fr.avainfo.lessonm2ilyon.models.Todo
import fr.avainfo.lessonm2ilyon.services.TodoService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TodoAPI {
    fun getTodo(id: Int): Todo {
        val retrofit: Retrofit =
            Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        val todoService: TodoService = retrofit.create(TodoService::class.java);

        val todoRes: Response<Todo?>? = todoService.getTodo(id)?.execute();

        var todo = Todo(-1, -1, "", false);
        if (todoRes == null || todoRes.body() == null)
            println("Todo not found")
        else
            todo = todoRes.body() as Todo
        return todo;
    }
}