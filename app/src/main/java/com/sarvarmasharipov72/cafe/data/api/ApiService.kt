package com.sarvarmasharipov72.cafe.data.api

import com.sarvarmasharipov72.cafe.model.response.MenuResponse
import retrofit2.http.GET

interface ApiService {

    @GET("/best-foods")
    fun getMenu(): MenuResponse
}