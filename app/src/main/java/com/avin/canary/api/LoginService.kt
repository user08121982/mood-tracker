package com.avin.canary.api

import retrofit2.http.GET

interface LoginService {
    @GET("/v3/b6111390-a0e4-4291-9461-d56d37c3745c")
    suspend fun authenticate(): CanarySession
}