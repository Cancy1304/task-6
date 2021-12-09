package com.example.task_6.dataBook

import retrofit2.http.GET

interface BookApi {
    @GET("books")
    suspend fun getAllbooks():List<AllBooks>
}