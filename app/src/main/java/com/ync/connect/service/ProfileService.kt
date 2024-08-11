package com.ync.connect.service

import retrofit2.http.GET

interface ProfileService {

    @GET("TBD URL")
    suspend fun getProfile()
}