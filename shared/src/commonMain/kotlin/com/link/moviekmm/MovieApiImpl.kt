package com.link.moviekmm

import com.link.moviekmm.model.remote.ktor.response.MovieApi
import com.link.moviekmm.model.remote.ktor.response.MovieResponseItem
import io.ktor.client.*
import io.ktor.client.call.*

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.util.cio.*

import kotlinx.serialization.json.*



class MovieApiImpl : MovieApi{

    private val client = HttpClient {
        install(ContentNegotiation) {
            json(Json{
                ignoreUnknownKeys = true
                prettyPrint = true
                isLenient = true
            })
            expectSuccess = true
        }

    }

    override suspend fun fetchMovieFromApi(): MovieResponseItem =
         client.get{
            getMoviesHttpBuilder("")
        }.body()



    private fun HttpRequestBuilder.getMoviesHttpBuilder(path: String) {
        url{
            if(path.isNotEmpty()){
                takeFrom("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=328c283cd27bd1877d9080ccb1604c91&$path")
            }else{
                takeFrom("https://api.themoviedb.org/3/discover/movie?sort_by=popularity.desc&api_key=328c283cd27bd1877d9080ccb1604c91")
            }
        }
    }
}