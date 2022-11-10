package com.link.moviekmm.model.remote.ktor.response

interface MovieApi {
    suspend fun fetchMovieFromApi(): MovieResponseItem
}