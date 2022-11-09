package com.link.moviekmm

import io.ktor.client.*
import io.ktor.client.statement.*
import io.ktor.client.request.*

class Greeting {
    private val platform: Platform = getPlatform()
    private val client = HttpClient()
    suspend fun greeting(): String {
        val response = client.get("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=328c283cd27bd1877d9080ccb1604c91")
        return response.bodyAsText()
    }
}