package com.example.apiarise.api

import com.example.apiarise.model.UserModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

public interface UserApi {
    @Headers(
        "Accept: application/json"
    )
    @GET("users/{id}")
    abstract fun getUserById(@Path("id") id: String): Call<UserModel?>?
}