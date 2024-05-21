package com.example.marsphotos.network


import com.example.marsphotos.model.MarsPhoto
import retrofit2.Retrofit
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST


interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>

    @Headers("Content-Type: application/json")
    @POST("photos")
    suspend fun addPhoto(@Body photo: MarsPhoto) : Call<MarsPhoto>
}